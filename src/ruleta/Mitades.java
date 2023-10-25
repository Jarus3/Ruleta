/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;


/**
 *
 * @author Nicolas Stephan Mamani Costas
 */
public class Mitades extends Apuesta {
    private boolean superior;

    public Mitades() {
        super();
        superior = true;
    }

    public Mitades(String nombreUsuario) {
        super(nombreUsuario);
        superior = true;
    }

    public Mitades(boolean superior, String nombreUsuario) {
        super(nombreUsuario);
        this.superior = superior;

    }

    public Mitades(boolean superior, String nombreUsuario, Ficha ficha) {
        super(nombreUsuario, ficha);
        this.superior = superior;

    }

    public boolean getSuperior() {
        return superior;
    }

    public void inferior() {
        superior = false;
    }
}
