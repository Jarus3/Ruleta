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
public class Duo extends Apuesta {
    private int[] numeros;
    public Duo(int numero1,int numero2){
        numeros=new int[2];
        numeros[0]=numero1;
        numeros[1]=numero2;
        super.multiplicador=(float)17;
        super.fichas=new ArrayList();
        super.nombreUsuario="";
    }
    public Duo(int numero1,int numero2, String nombreUsuario){
        numeros=new int[2];
        numeros[0]=numero1;
        numeros[1]=numero2;
        super.multiplicador=(float)17;
        super.fichas=new ArrayList();
        super.nombreUsuario=nombreUsuario;
    }
    public Duo(int numero1,int numero2, String nombreUsuario,ArrayList<Ficha> fichas){
        numeros=new int[2];
        numeros[0]=numero1;
        numeros[1]=numero2;
        super.multiplicador=(float)17;
        super.fichas=fichas;
        super.nombreUsuario=nombreUsuario;
    }
    public Duo(int[] numeros){
        this.numeros=numeros;
        super.multiplicador=(float)17;
        super.fichas=new ArrayList();
        super.nombreUsuario="";
    }
    public Duo(int[] numeros, String nombreUsuario){
        this.numeros=numeros;
        super.multiplicador=(float)17;
        super.fichas=new ArrayList();
        super.nombreUsuario=nombreUsuario;
    }
    public Duo(int[] numeros, String nombreUsuario,ArrayList<Ficha> fichas){
        this.numeros=numeros;
        super.multiplicador=(float)17;
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