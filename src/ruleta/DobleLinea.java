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
public class DobleLinea extends Apuesta {
    private int[] lineas;
    public DobleLinea(int linea1,int linea2){
        lineas=new int[2];
        lineas[0]=linea1;
        lineas[1]=linea2;
        super.multiplicador=(float)1.5;
        super.fichas=new ArrayList();
        super.nombreUsuario="";
    }
    public DobleLinea(int linea1,int linea2, String nombreUsuario){
        lineas=new int[2];
        lineas[0]=linea1;
        lineas[1]=linea2;
        super.multiplicador=(float)1.5;
        super.fichas=new ArrayList();
        super.nombreUsuario=nombreUsuario;
    }
    public DobleLinea(int linea1,int linea2, String nombreUsuario,ArrayList<Ficha> fichas){
        lineas=new int[2];
        lineas[0]=linea1;
        lineas[1]=linea2;
        super.multiplicador=(float)1.5;
        super.fichas=fichas;
        super.nombreUsuario=nombreUsuario;
    }
    public DobleLinea(int[] lineas){
        this.lineas=lineas;
        super.multiplicador=(float)1.5;
        super.fichas=new ArrayList();
        super.nombreUsuario="";
    }
    public DobleLinea(int[] lineas, String nombreUsuario){
        this.lineas=lineas;
        super.multiplicador=(float)1.5;
        super.fichas=new ArrayList();
        super.nombreUsuario=nombreUsuario;
    }
    public DobleLinea(int[] lineas, String nombreUsuario,ArrayList<Ficha> fichas){
        this.lineas=lineas;
        super.multiplicador=(float)1.5;
        super.fichas=fichas;
        super.nombreUsuario=nombreUsuario;
    }
    public int[] getLineas() {
        return lineas;
    }

    public void setLineas(int[] lineas) {
        this.lineas = lineas;
    }

}