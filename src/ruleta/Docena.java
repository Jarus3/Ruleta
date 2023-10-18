/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Nicolas Stephan Mamani Costas
 */
public class Docena extends Apuesta {
    private int docena;

    public Docena() {
        super.multiplicador = 2;
        docena = 1;
    }

    public int getDocena() {
        return docena;
    }
}
