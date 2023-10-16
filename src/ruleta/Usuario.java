/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Nicolas Stepha Mamani Costas
 */
import java.util.ArrayList;

public class Usuario {
    private ArrayList<Ficha> fichas;
    private String nombre;

    public Usuario() {
        fichas = new ArrayList<Ficha>();
        nombre = null;
    }

    public Usuario(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
        nombre = null;
    }

    public Usuario(String nombre) {
        fichas = new ArrayList<Ficha>();
        this.nombre = nombre;
    }

    public Usuario(ArrayList<Ficha> fichas, String nombre) {
        this.fichas = fichas;
        this.nombre = nombre;
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

    public ArrayList<Ficha> getFichasPorCantidad(int cantidad) {
        ArrayList<Ficha> fichasSeleccionadas = new ArrayList<>();
        int sumaValores = 0;

        for (Ficha ficha : fichas) {
            if (sumaValores + ficha.getValor() <= cantidad) {
                fichasSeleccionadas.add(ficha);
                sumaValores += ficha.getValor();
            }
        }
        if (sumaValores == cantidad) {
            return fichasSeleccionadas;
        } else {
            return new ArrayList<Ficha>();
        }
    }

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    public void setFichas(Ficha fichas) {
        this.fichas.add(fichas);
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

}