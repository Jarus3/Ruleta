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
    
    private ArrayList<Ficha> banca;
    private ArrayList<Usuario> jugadores;
    private Mesa mesa;

    public Crupier() {
        banca = new ArrayList<Ficha>();
        jugadores =new ArrayList<Usuario>();
        mesa = new Mesa();
    }

    public Crupier(ArrayList<Ficha> banca, ArrayList<Usuario> jugadores, Mesa mesa) {
        this.banca = banca;
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

}