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

    public Crupier() {
        banca = new ArrayList<Ficha>();
    }

    public Crupier(Ficha banca) {
        this.banca = new ArrayList<Ficha>();
        this.banca.add(banca);
    }

    public Crupier(ArrayList<Ficha> banca) {
        this.banca = banca;
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

    public String toString() {
        return "Crupier [Banca: " + banca + "]";
    }

}