/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Nicolas Stepha Mamani Costas y Jaruslav Markowski
 */
import java.util.ArrayList;

public class Crupier {
    
    private Tupla[] banca;
    private Usuario jugador;
    private Mesa mesa;
    private Numero ganador;
    private ArrayList<Apuesta> apuestas;
    private ArrayList<Apuesta> ganadores;
    public Crupier() {
        banca = new Tupla[3];
        banca[0]=new Tupla(new Ficha(1,"amarillo"),100);
        banca[1]=new Tupla(new Ficha(5,"verde"),100);
        banca[2]=new Tupla(new Ficha(25,"rojo"),100);
        ganador=new Numero();
        apuestas=new ArrayList<>();
        ganadores=new ArrayList<>();
        jugador =new Usuario();
        mesa = new Mesa();
    }

    public Crupier(Tupla[] banca, Usuario jugador, Mesa mesa) {
        this.banca = banca;
        ganador=new Numero();
        apuestas=new ArrayList<>();
        ganadores=new ArrayList<>();
        this.jugador = jugador;
        this.mesa = mesa;
    }

    public Tupla[] getBanca() {
        return banca;
    }

    public void setBanca(Tupla[] banca) {
        this.banca = banca;
    }

    public void setBanca(Ficha ficha) {
        int aux=ficha.getValor();
        switch(aux){
            case 1 -> banca[0].addCantidad(1);
            case 5 -> banca[1].addCantidad(1);
            case 25 -> banca[2].addCantidad(1);
            default -> {
            }
        }
    }
    public void setBanca(Ficha ficha,int extra) {
        int aux=ficha.getValor();
        switch(aux){
            case 1 -> banca[0].addCantidad(extra);
            case 5 -> banca[1].addCantidad(extra);
            case 25 -> banca[2].addCantidad(extra);
            default -> {
            }
        }
    }

    public Usuario getJugador() {
        return jugador;
    }

    public void setJugador(Usuario jugador) {
        this.jugador = jugador;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Crupier [Jugador: " + jugador + ", Mesa: " + mesa + "]";
    }

    public void getApuestas(){
        apuestas=jugador.getApuestas();
    }
    public void ganadores(){
        ganador=mesa.getGanador();
        Apuesta aux;
        int premio=0;
        for(int i=0;i<apuestas.size();){
            aux=apuestas.get(i);
            if(gano(aux,ganador)){
                premio=(int)aux.getMultiplicador()*aux.getFichas().getValor();
                jugador.addDinero(premio);
            }
        }
    }
    public boolean gano(Apuesta apuesta,Numero ganador){
        boolean aux=false;
        if(apuesta instanceof ApuestaNumero){
            ApuestaNumero aux2=(ApuestaNumero)apuesta;
            if(aux2.getValor()==ganador.getValor()){aux=true;}
        }else if(apuesta instanceof Color){
            Color aux2=(Color)apuesta;
            if(aux2.getColor().equals(ganador.getColor())){aux=true;}
        }else if(apuesta instanceof Mitades){
            Mitades aux2=(Mitades)apuesta;
            if(aux2.getSuperior()){
                if(ganador.getValor()>18){aux=true;}
            }else{
                if(ganador.getValor()<19){aux=true;}
            }
        }else if(apuesta instanceof Paridad){
            Paridad aux2=(Paridad)apuesta;
            if(aux2.getPar()){
                if((ganador.getValor()%2)==0){aux=true;}
            }else{
                if((ganador.getValor()%2)==1){aux=true;}
            }
        }else if(apuesta instanceof Columna){
            Columna aux2=(Columna)apuesta;
            if(aux2.getColumna()==ganador.getColumna()){aux=true;}
        }else if(apuesta instanceof Docena){
            Docena aux2=(Docena)apuesta;
            if(aux2.getDocena()==ganador.getDocena()){aux=true;}
        }else if(apuesta instanceof DobleLinea){
            DobleLinea aux2=(DobleLinea)apuesta;
            int[]aux3=aux2.getLineas();
            if(aux3[0]==ganador.getColumna()){
                aux=true;
            }else{
                if(aux3[1]==ganador.getColumna()){
                    aux=true;
                }
            }
        }else if(apuesta instanceof Trio){
            Trio aux2=(Trio)apuesta;
            int[]aux3=aux2.getNumeros();
            int valor=ganador.getValor();
            if(aux3[0]==valor){
                aux=true;
            }else if(aux3[1]==valor){
                aux=true;
            }else if(aux3[2]==valor){
                aux=true;
            }
            
        }else if(apuesta instanceof Cuatro){
            Cuatro aux2=(Cuatro)apuesta;
            int[]aux3=aux2.getNumeros();
            int valor=ganador.getValor();
            if(aux3[0]==valor){
                aux=true;
            }else if(aux3[1]==valor){
                aux=true;
            }else if(aux3[2]==valor){
                aux=true;
            }else if(aux3[3]==valor){
                aux=true;
            }
        }else if(apuesta instanceof Duo){
            Duo aux2=(Duo)apuesta;
            int[]aux3=aux2.getNumeros();
            int valor=ganador.getValor();
            if(aux3[0]==valor){
                aux=true;
            }else if(aux3[1]==valor){
                aux=true;
            }
        }
        return aux;
    }
    public Tupla[] getFichasPorCantidad(int cantidad) {
        Tupla[] fichasSeleccionadas = new Tupla[3];
        banca[0]=new Tupla(new Ficha(1,"amarillo"),0);
        banca[1]=new Tupla(new Ficha(5,"verde"),0);
        banca[2]=new Tupla(new Ficha(25,"rojo"),0);
        int sumaValores = cantidad;
        int i = 2;
        while (i >= 0) {
            Ficha ficha = banca[i].getFicha();
            if(sumaValores<ficha.getValor()){
                int aux=sumaValores/ficha.getValor();
                banca[i].addCantidad(aux);
                sumaValores=sumaValores-(ficha.getValor()*aux);
                aux=aux*(-1);
                banca[i].addCantidad(aux);
            }
            i--;
        }
    
        if (sumaValores == 0) {
            return fichasSeleccionadas;
        } else {
            return null;
        }
    }
}