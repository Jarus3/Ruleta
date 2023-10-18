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
        superior = true;
        super.multiplicador = 1;
    }

    public boolean getSuperior() {
        return superior;
    }

    public void inferior() {
        superior = false;
    }
}
