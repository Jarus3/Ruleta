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
        super();
        super.multiplicador = 2;
        columna = 1;
    }

    public Columna(String nombreUsuario){
        super(nombreUsuario);
        super.multiplicador = 2;
        columna = 1;
    }

    public Columna(String nombreUsuario, int columna){
        super(nombreUsuario);
        super.multiplicador = 2;
        this.columna = columna;
    }

    public Columna(String nombreUsuario, Ficha ficha, int columna){
        super(nombreUsuario, ficha);
        super.multiplicador = 2;
        this.columna = columna;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna){
        this.columna = columna;
    }
}
