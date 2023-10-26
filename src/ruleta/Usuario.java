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
    private int dinero;
    private String nombre;
    private ArrayList<Apuesta> apuestas;
    public Usuario() {
        dinero =0;
        apuestas = new ArrayList<Apuesta>();
        nombre = null;
    }

    public Usuario(int dinero) {
        this.dinero = dinero;
        apuestas = new ArrayList<Apuesta>();
        nombre = null;
    }

    public Usuario(String nombre) {
        dinero = 0;
        apuestas = new ArrayList<Apuesta>();
        this.nombre = nombre;
    }

    public Usuario(int dinero, String nombre) {
        this.dinero = dinero;
        this.nombre = nombre;
        apuestas = new ArrayList<Apuesta>();
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero=dinero;
    }
    
    public void addFicha(Ficha ficha){
        dinero+=ficha.getValor();
    }

    public void addDinero(int dinero){
        this.dinero+=dinero;
    }
    public String getNombre() {
        return nombre;
    }
    
    public void resetApuestas(){
        apuestas=new ArrayList<Apuesta>();
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario [Nombre: " + nombre + ", dinero: " + dinero + "]";
    }

    public ArrayList<Apuesta> getApuestas() {
        return (ArrayList<Apuesta>)apuestas.clone();
    }

    public void apuestaColor(Ficha ficha, String color){
        Apuesta apuesta = new Color(color, nombre, ficha);
        apuestas.add(apuesta);
        dinero-=ficha.getValor();
    }

    public void apuestaParidad(Ficha ficha, boolean par){
        Apuesta apuesta = new Paridad(par, nombre, ficha);
        apuestas.add(apuesta);
        dinero-=ficha.getValor();
    }
    public void apuestaMitades(Ficha ficha, boolean superior){
        Apuesta apuesta = new Mitades(superior, nombre, ficha);
        apuestas.add(apuesta);
        dinero-=ficha.getValor();
    }
    public void apuestaColumna(Ficha ficha, int columna){
        Apuesta apuesta = new Columna( nombre, ficha, columna);
        apuestas.add(apuesta);
        dinero-=ficha.getValor();
    }
    public void apuestaDocena(Ficha ficha, int docena){
        Apuesta apuesta = new Docena(docena, nombre, ficha);
        apuestas.add(apuesta);
        dinero-=ficha.getValor();
    }
    public void apuestaNumero(Ficha ficha, int valor){
        Apuesta apuesta = new ApuestaNumero(valor, nombre, ficha);
        apuestas.add(apuesta);
        dinero-=ficha.getValor();
    }
    public void apuestaDobleLinea(Ficha ficha, int linea1,int linea2){
        Apuesta apuesta = new DobleLinea(linea1,linea2, nombre,ficha);
        apuestas.add(apuesta);
        dinero-=ficha.getValor();
    }
    public void apuestaTrio(Ficha ficha, int valor1,int valor2,int valor3){
        Apuesta apuesta = new Trio(valor1,valor2,valor3, nombre, ficha);
        apuestas.add(apuesta);
        dinero-=ficha.getValor();
    }
    public void apuestaCuatro(Ficha ficha, int valor1,int valor2,int valor3,  int valor4){
        Apuesta apuesta = new Cuatro(valor1,valor2,valor3,valor4, nombre, ficha);
        apuestas.add(apuesta);
        dinero-=ficha.getValor();
    }
    public void apuestaDuo(Ficha ficha, int valor1,int valor2){
        Apuesta apuesta = new Duo(valor1,valor2, nombre, ficha);
        apuestas.add(apuesta);
        dinero-=ficha.getValor();
    }
}