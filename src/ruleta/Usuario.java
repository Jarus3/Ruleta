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

public class Usuario {
    private Tupla[] fichas;
    private String nombre;
    private ArrayList<Apuesta> apuestas;
    public Usuario() {
        fichas = new Tupla[3];
        apuestas = new ArrayList<Apuesta>();
        nombre = null;
    }

    public Usuario(Tupla[] fichas) {
        this.fichas = fichas;
        apuestas = new ArrayList<Apuesta>();
        nombre = null;
    }

    public Usuario(String nombre) {
        fichas = new Tupla[3];
        apuestas = new ArrayList<Apuesta>();
        this.nombre = nombre;
    }

    public Usuario(Tupla[] fichas, String nombre) {
        this.fichas = fichas;
        this.nombre = nombre;
        apuestas = new ArrayList<Apuesta>();
    }

    public Tupla[] getFichas() {
        return fichas;
    }

    public Ficha getFicha(int valor) {
        Ficha ficha=new Ficha();
        switch(valor){
            case 1:
                fichas[0].addCantidad(-1);
                ficha=fichas[0].getFicha();
            break;
            case 5:
                fichas[1].addCantidad(-1);
                ficha=fichas[1].getFicha();
            break;
            case 25:
                fichas[2].addCantidad(-1);
                ficha=fichas[2].getFicha();
            break;
            default :
        }
        return ficha;
    }

    public Tupla[] getFichasPorCantidad(int cantidad) {
        Tupla[] fichasSeleccionadas = new Tupla[3];
        fichas[0]=new Tupla(new Ficha(1,"amarillo"),0);
        fichas[1]=new Tupla(new Ficha(5,"verde"),0);
        fichas[2]=new Tupla(new Ficha(25,"rojo"),0);
        int sumaValores = cantidad;
        int i = 2;
        while (i >= 0) {
            Ficha ficha = fichas[i].getFicha();
            if(sumaValores<ficha.getValor()){
                int aux=sumaValores/ficha.getValor();
                fichas[i].addCantidad(aux);
                sumaValores=sumaValores-(ficha.getValor()*aux);
                aux=aux*(-1);
                fichas[i].addCantidad(aux);
            }
            i--;
        }
    
        if (sumaValores == 0) {
            return fichasSeleccionadas;
        } else {
            return null;
        }
    }
    

    public void setFichas(Tupla[] fichas) {
        this.fichas=fichas;
    }

    public void setFicha(Ficha ficha) {
        switch(ficha.getValor()){
            case 1:
                fichas[0].addCantidad(1);
            break;
            case 5:
                fichas[1].addCantidad(1);
            break;
            case 25:
                fichas[2].addCantidad(1);
            break;
            default :
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Usuario [Nombre: " + nombre + ", Fichas: " + fichas + "]";
    }

    public ArrayList<Apuesta> getApuestas() {
        return (ArrayList<Apuesta>)apuestas.clone();
    }

    public void apuestaColor(int cantidad, String color){
        Tupla[] fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Color(color, nombre, fichas);
        apuestas.add(apuesta);
    }

    public void apuestaParidad(int cantidad, boolean par){
        Tupla[] fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Paridad(par, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaMitades(int cantidad, boolean superior){
        Tupla[] fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Mitades(superior, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaColumna(int cantidad, int columna){
        Tupla[] fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Columna( nombre, fichas,columna);
        apuestas.add(apuesta);
    }
    public void apuestaDocena(int cantidad, int docena){
        Tupla[] fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Docena(docena, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaNumero(int cantidad, int valor){
        Tupla[] fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new ApuestaNumero(valor, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaDobleLinea(int cantidad, int linea1,int linea2){
        Tupla[] fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new DobleLinea(linea1,linea2, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaTrio(int cantidad, int valor1,int valor2,int valor3){
        Tupla[] fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Trio(valor1,valor2,valor3, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaCuatro(int cantidad, int valor1,int valor2,int valor3,  int valor4){
        Tupla[] fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Cuatro(valor1,valor2,valor3,valor4, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaDuo(int cantidad, int valor1,int valor2){
        Tupla[] fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Duo(valor1,valor2, nombre, fichas);
        apuestas.add(apuesta);
    }
}