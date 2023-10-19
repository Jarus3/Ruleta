/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Stephan Mamani Costas
 */
public class Color extends Apuesta {
    private String color;

    public Color() {
        super();
        color = "black";
    }

    public Color(String nombreUsuario) {
        super(nombreUsuario);
        color = "black";
    }

    public Color(String color, String nombreUsuario) {
        super(nombreUsuario);
        this.color = color;
    }

    public Color(String color, String nombreUsuario, ArrayList<Ficha> fichas) {
        super(nombreUsuario, fichas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
}