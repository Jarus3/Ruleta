/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

import java.util.ArrayList;

/**
 *
 * @author Jaruslav Markowski
 */
public class ApuestaNumero extends Apuesta {
    private int valor;
    public ApuestaNumero(int valor){
        this.valor=valor;
        super.multiplicador=35;
        super.fichas=new ArrayList();
        super.nombreUsuario="";
    }
    public ApuestaNumero(int valor, String nombreUsuario){
        this.valor=valor;
        super.multiplicador=35;
        super.fichas=new ArrayList();
        super.nombreUsuario=nombreUsuario;
    }
    public ApuestaNumero(int valor, String nombreUsuario,ArrayList<Ficha> fichas){
        this.valor=valor;
        super.multiplicador=35;
        super.fichas=fichas;
        super.nombreUsuario=nombreUsuario;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
