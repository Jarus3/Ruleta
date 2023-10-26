/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;


/**
 *
 * @author Jaruslav Markowski
 */
public class ApuestaNumero extends Apuesta implements Interfaz_Apuestas{
    private int valor;
    public ApuestaNumero(int valor){
        this.valor=valor;
        super.multiplicador=35;
        super.ficha=new Ficha();
        super.nombreUsuario="";
    }
    public ApuestaNumero(int valor, String nombreUsuario){
        this.valor=valor;
        super.multiplicador=35;
        super.ficha=new Ficha();
        super.nombreUsuario=nombreUsuario;
    }
    public ApuestaNumero(int valor, String nombreUsuario,Ficha ficha){
        this.valor=valor;
        super.multiplicador=35;
        super.ficha=ficha;
        super.nombreUsuario=nombreUsuario;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
