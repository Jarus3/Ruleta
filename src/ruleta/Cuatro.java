/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Jaruslav Markowski
 */
public class Cuatro extends Apuesta implements Interfaz_Apuestas{
    private int[] numeros;
    public Cuatro(int numero1,int numero2,int numero3,int numero4){
        numeros=new int[4];
        numeros[0]=numero1;
        numeros[1]=numero2;
        numeros[2]=numero3;
        numeros[3]=numero4;
        super.multiplicador=(float)8;
        super.ficha=new Ficha();
        super.nombreUsuario="";
    }
    public Cuatro(int numero1,int numero2,int numero3,int numero4, String nombreUsuario){
        numeros=new int[4];
        numeros[0]=numero1;
        numeros[1]=numero2;
        numeros[2]=numero3;
        numeros[3]=numero4;
        super.multiplicador=(float)8;
        super.ficha=new Ficha();
        super.nombreUsuario=nombreUsuario;
    }
    public Cuatro(int numero1,int numero2,int numero3,int numero4, String nombreUsuario,Ficha ficha){
        numeros=new int[4];
        numeros[0]=numero1;
        numeros[1]=numero2;
        numeros[2]=numero3;
        numeros[3]=numero4;
        super.multiplicador=(float)8;
        super.ficha=ficha;
        super.nombreUsuario=nombreUsuario;
    }
    public Cuatro(int[] numeros){
        this.numeros=numeros;
        super.multiplicador=(float)8;
        super.ficha=new Ficha();
        super.nombreUsuario="";
    }
    public Cuatro(int[] numeros, String nombreUsuario){
        this.numeros=numeros;
        super.multiplicador=(float)8;
        super.ficha=new Ficha();
        super.nombreUsuario=nombreUsuario;
    }
    public Cuatro(int[] numeros, String nombreUsuario,Ficha ficha){
        this.numeros=numeros;
        super.multiplicador=(float)8;
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