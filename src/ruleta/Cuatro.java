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
public class Cuatro extends Apuesta {
    private int[] numeros;
    public Cuatro(int numero1,int numero2,int numero3,int numero4){
        numeros=new int[4];
        numeros[0]=numero1;
        numeros[1]=numero2;
        numeros[2]=numero3;
        numeros[3]=numero4;
        super.multiplicador=(float)8;
        super.fichas=new ArrayList();
        super.nombreUsuario="";
    }
    public Cuatro(int numero1,int numero2,int numero3,int numero4, String nombreUsuario){
        numeros=new int[4];
        numeros[0]=numero1;
        numeros[1]=numero2;
        numeros[2]=numero3;
        numeros[3]=numero4;
        super.multiplicador=(float)8;
        super.fichas=new ArrayList();
        super.nombreUsuario=nombreUsuario;
    }
    public Cuatro(int numero1,int numero2,int numero3,int numero4, String nombreUsuario,ArrayList<Ficha> fichas){
        numeros=new int[4];
        numeros[0]=numero1;
        numeros[1]=numero2;
        numeros[2]=numero3;
        numeros[3]=numero4;
        super.multiplicador=(float)8;
        super.fichas=fichas;
        super.nombreUsuario=nombreUsuario;
    }
    public Cuatro(int[] numeros){
        this.numeros=numeros;
        super.multiplicador=(float)8;
        super.fichas=new ArrayList();
        super.nombreUsuario="";
    }
    public Cuatro(int[] numeros, String nombreUsuario){
        this.numeros=numeros;
        super.multiplicador=(float)8;
        super.fichas=new ArrayList();
        super.nombreUsuario=nombreUsuario;
    }
    public Cuatro(int[] numeros, String nombreUsuario,ArrayList<Ficha> fichas){
        this.numeros=numeros;
        super.multiplicador=(float)8;
        super.fichas=fichas;
        super.nombreUsuario=nombreUsuario;
    }
    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

}