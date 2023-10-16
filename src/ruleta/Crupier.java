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

public class Crupier {
    private ArrayList<Apuesta> apuestas;
    private ArrayList<Ficha> banca;
    private Mesa mesa;

    public Crupier() {
        apuestas = new ArrayList<Apuesta>();
        banca = new ArrayList<Ficha>();
        mesa = null;
    }

    // public Crupier(ArrayList<Apuesta> apuestas) {
    // this.apuestas = apuestas;
    // banca = new ArrayList<Ficha>();
    // mesa = null;
    // }

    // public Crupier(ArrayList<Ficha> banca) {
    // apuestas = new ArrayList<Apuesta>();
    // this.banca = banca;
    // mesa=null;
    // }

    public Crupier(Mesa mesa) {
        apuestas = new ArrayList<Apuesta>();
        banca = new ArrayList<Ficha>();
        this.mesa = mesa;
    }

    public Crupier(ArrayList<Apuesta> apuestas, ArrayList<Ficha> banca, Mesa mesa) {
        this.apuestas = apuestas;
        this.banca = banca;
        this.mesa = mesa;
    }

    public ArrayList<Apuesta> getApuestas() {
        return apuestas;
    }

    public void setApuestas(ArrayList<Apuesta> apuestas) {
        this.apuestas = apuestas;
    }

    public ArrayList<Ficha> getBanca() {
        return banca;
    }

    public void setBanca(ArrayList<Ficha> banca) {
        this.banca = banca;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String toString() {
        return "Crupier [Apuestas: " + apuestas + ", Banca: " + banca + ", Mesa: " + mesa + "]";
    }

}