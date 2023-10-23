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
    
    private ArrayList<Ficha> banca;
    private ArrayList<Usuario> jugadores;
    private Mesa mesa;
    private Numero ganador;
    private ArrayList<Apuesta> apuestas;
    private ArrayList<Apuesta> ganadores;
    public Crupier() {
        banca = new ArrayList<Ficha>();
        ganador=new Numero();
        apuestas=new ArrayList<>();
        ganadores=new ArrayList<>();
        jugadores =new ArrayList<Usuario>();
        mesa = new Mesa();
    }

    public Crupier(ArrayList<Ficha> banca, ArrayList<Usuario> jugadores, Mesa mesa) {
        this.banca = banca;
        ganador=new Numero();
        apuestas=new ArrayList<>();
        ganadores=new ArrayList<>();
        this.jugadores = jugadores;
        this.mesa = mesa;
    }

    public ArrayList<Ficha> getBanca() {
        return banca;
    }

    public void setBanca(ArrayList<Ficha> banca) {
        this.banca = banca;
    }

    public void setBanca(Ficha banca) {
        this.banca.add(banca);
    }

    public ArrayList<Usuario> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Usuario> jugadores) {
        this.jugadores = jugadores;
    }

    public void setJugadores(Usuario jugador) {
        this.jugadores.add(jugador);
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String toString() {
        return "Crupier [Banca: " + banca + ", Jugadores: " + jugadores + ", Mesa: " + mesa + "]";
    }

    public void getApuestas(){
        for(int i=0;i<jugadores.size();){
            apuestas.addAll(jugadores.get(i).getApuestas());
        }
    }
    public void ganadores(){
        ganador=mesa.getGanador();
        Apuesta aux;
        for(int i=0;i<apuestas.size();){
            aux=apuestas.get(i);
            if(gano(aux,ganador)){
                ganadores.add(aux);
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
}