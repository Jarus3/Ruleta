/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;


/**
 *
 * @author Nicolas Stephan Mamani Costas
 */
public class Docena extends Apuesta implements Interfaz_Apuestas{
    private int docena;

    public Docena() {
        super();
        super.multiplicador = 2;
        docena = 1;
    }

    public Docena(String nombreUsuario) {
        super(nombreUsuario);
        super.multiplicador = 2;
        docena = 1;
    }

    public Docena(int docena, String nombreUsuario) {
        super(nombreUsuario);
        super.multiplicador = 2;
        this.docena = docena;

    }

    public Docena(int docena, String nombreUsuario, Ficha ficha) {
        super(nombreUsuario, ficha);
        super.multiplicador = 2;
        this.docena = docena;

    }

    public int getDocena() {
        return docena;
    }

    public void setDocena(int docena){
        this.docena=docena;
    }
}
