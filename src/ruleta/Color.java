/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;


/**
 *
 * @author Nicolas Stephan Mamani Costas
 */
public class Color extends Apuesta {
    private String color;

    public Color() {
        super();
        color = "Negro";
    }

    public Color(String nombreUsuario) {
        super(nombreUsuario);
        color = "Negro";
    }

    public Color(String color, String nombreUsuario) {
        super(nombreUsuario);
        this.color = color;
    }

    public Color(String color, String nombreUsuario, Ficha ficha) {
        super(nombreUsuario, ficha);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
}