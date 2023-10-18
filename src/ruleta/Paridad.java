/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Nicolas Stephan Mamani Costas
 */
public class Paridad extends Apuesta {
    private boolean par;

    public Paridad() {
        super.multiplicador = 1;
        par = true;
    }

    public boolean getPar() {
        return par;
    }

    public void impar() {
        par = false;
    }
}
