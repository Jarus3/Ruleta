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
        super();
        par = true;
    }

    public Paridad(String nombreUsuario) {
        super(nombreUsuario);
        par = true;
    }

    public Paridad(boolean par, String nombreUsuario) {
        super(nombreUsuario);
        this.par = par;

    }

    public Paridad(boolean par, String nombreUsuario, Ficha ficha) {
        super(nombreUsuario, ficha);
        this.par = par;

    }

    public boolean getPar() {
        return par;
    }

    public void impar() {
        par = false;
    }
}
