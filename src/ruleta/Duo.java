/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Jaruslav Markowski
 */
public class Duo extends Apuesta implements Interfaz_Apuestas{
    private int[] numeros;
    public Duo(int numero1,int numero2){
        numeros=new int[2];
        numeros[0]=numero1;
        numeros[1]=numero2;
        super.multiplicador=(float)17;
        super.ficha=new Ficha();
        super.nombreUsuario="";
    }
    public Duo(int numero1,int numero2, String nombreUsuario){
        numeros=new int[2];
        numeros[0]=numero1;
        numeros[1]=numero2;
        super.multiplicador=(float)17;
        super.ficha=new Ficha();
        super.nombreUsuario=nombreUsuario;
    }
    public Duo(int numero1,int numero2, String nombreUsuario,Ficha ficha){
        numeros=new int[2];
        numeros[0]=numero1;
        numeros[1]=numero2;
        super.multiplicador=(float)17;
        super.ficha=ficha;
        super.nombreUsuario=nombreUsuario;
    }
    public Duo(int[] numeros){
        this.numeros=numeros;
        super.multiplicador=(float)17;
        super.ficha=new Ficha();
        super.nombreUsuario="";
    }
    public Duo(int[] numeros, String nombreUsuario){
        this.numeros=numeros;
        super.multiplicador=(float)17;
        super.ficha=new Ficha();
        super.nombreUsuario=nombreUsuario;
    }
    public Duo(int[] numeros, String nombreUsuario,Ficha ficha){
        this.numeros=numeros;
        super.multiplicador=(float)17;
        super.ficha=ficha;
        super.nombreUsuario=nombreUsuario;
    }
    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

}