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
    private ArrayList<Ficha> fichas;
    private String nombre;
    private ArrayList<Apuesta> apuestas;
    public Usuario() {
        fichas = new ArrayList<Ficha>();
        apuestas = new ArrayList<Apuesta>();
        nombre = null;
    }

    public Usuario(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
        apuestas = new ArrayList<Apuesta>();
        nombre = null;
    }

    public Usuario(String nombre) {
        fichas = new ArrayList<Ficha>();
        apuestas = new ArrayList<Apuesta>();
        this.nombre = nombre;
    }

    public Usuario(ArrayList<Ficha> fichas, String nombre) {
        this.fichas = fichas;
        this.nombre = nombre;
        apuestas = new ArrayList<Apuesta>();
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public Ficha getFicha(int valor) {
        for (Ficha ficha : fichas) {
            if (ficha.getValor() == valor) {
                return ficha;
            }
        }
        return null;
    }

    // public ArrayList<Ficha> getFichasPorCantidad(int cantidad) {
    //     ArrayList<Ficha> fichasSeleccionadas = new ArrayList<>();
    //     int sumaValores = 0;

    //     for (Ficha ficha : fichas) {
    //         if (sumaValores + ficha.getValor() <= cantidad) {
    //             fichasSeleccionadas.add(ficha);
    //             sumaValores += ficha.getValor();
    //         }
    //     }
    //     if (sumaValores == cantidad) {
    //         return fichasSeleccionadas;
    //     } else {
    //         return new ArrayList<Ficha>();
    //     }
    // }

    public ArrayList<Ficha> getFichasPorCantidad(int cantidad) {
        ArrayList<Ficha> fichasSeleccionadas = new ArrayList<>();
        int sumaValores = 0;
        int i = 0;
    
        while (i < fichas.size()) {
            Ficha ficha = fichas.get(i);
            if (sumaValores + ficha.getValor() <= cantidad) {
                fichasSeleccionadas.add(ficha);
                sumaValores += ficha.getValor();
                fichas.remove(i);
            } else {
                i++;
            }
        }
    
        if (sumaValores == cantidad) {
            return fichasSeleccionadas;
        } else {
            return null;
        }
    }
    

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas.addAll(fichas);
    }

    public void setFicha(Ficha ficha) {
        this.fichas.add(ficha);
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
        ArrayList<Ficha> fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Color(color, nombre, fichas);
        apuestas.add(apuesta);
    }

    public void apuestaParidad(int cantidad, boolean par){
        ArrayList<Ficha> fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Paridad(par, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaMitades(int cantidad, boolean superior){
        ArrayList<Ficha> fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Mitades(superior, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaColumna(int cantidad, int columna){
        ArrayList<Ficha> fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Columna( nombre, fichas,columna);
        apuestas.add(apuesta);
    }
    public void apuestaDocena(int cantidad, int docena){
        ArrayList<Ficha> fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Docena(docena, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaNumero(int cantidad, int valor){
        ArrayList<Ficha> fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new ApuestaNumero(valor, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaDobleLinea(int cantidad, int linea1,int linea2){
        ArrayList<Ficha> fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new DobleLinea(linea1,linea2, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaTrio(int cantidad, int valor1,int valor2,int valor3){
        ArrayList<Ficha> fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Trio(valor1,valor2,valor3, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaCuatro(int cantidad, int valor1,int valor2,int valor3,  int valor4){
        ArrayList<Ficha> fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Cuatro(valor1,valor2,valor3,valor4, nombre, fichas);
        apuestas.add(apuesta);
    }
    public void apuestaDuo(int cantidad, int valor1,int valor2){
        ArrayList<Ficha> fichas = getFichasPorCantidad(cantidad);
        Apuesta apuesta = new Duo(valor1,valor2, nombre, fichas);
        apuestas.add(apuesta);
    }
}