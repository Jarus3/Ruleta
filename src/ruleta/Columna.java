/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Nicolas Stephan Mamani Costas
 */
public class Columna extends Apuesta {
    private int columna;

    public Columna() {
        super.multiplicador = 2;
        columna = 1;
    }

    public int getColumna() {
        return columna;
    }
}
