/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Jaruslav Markowski
 */
public class DobleLinea extends Apuesta implements Interfaz_Apuestas{
    private int[] lineas;
    public DobleLinea(int linea1,int linea2){
        lineas=new int[2];
        lineas[0]=linea1;
        lineas[1]=linea2;
        super.multiplicador=(float)1.5;
        super.ficha=new Ficha();
        super.nombreUsuario="";
    }
    public DobleLinea(int linea1,int linea2, String nombreUsuario){
        lineas=new int[2];
        lineas[0]=linea1;
        lineas[1]=linea2;
        super.multiplicador=(float)1.5;
        super.ficha=new Ficha();
        super.nombreUsuario=nombreUsuario;
    }
    public DobleLinea(int linea1,int linea2, String nombreUsuario,Ficha ficha){
        lineas=new int[2];
        lineas[0]=linea1;
        lineas[1]=linea2;
        super.multiplicador=(float)1.5;
        super.ficha=ficha;
        super.nombreUsuario=nombreUsuario;
    }
    public DobleLinea(int[] lineas){
        this.lineas=lineas;
        super.multiplicador=(float)1.5;
        super.ficha=new Ficha();
        super.nombreUsuario="";
    }
    public DobleLinea(int[] lineas, String nombreUsuario){
        this.lineas=lineas;
        super.multiplicador=(float)1.5;
        super.ficha=new Ficha();
        super.nombreUsuario=nombreUsuario;
    }
    public DobleLinea(int[] lineas, String nombreUsuario,Ficha ficha){
        this.lineas=lineas;
        super.multiplicador=(float)1.5;
        super.ficha=ficha;
        super.nombreUsuario=nombreUsuario;
    }
    public int[] getLineas() {
        return lineas;
    }

    public void setLineas(int[] lineas) {
        this.lineas = lineas;
    }

}