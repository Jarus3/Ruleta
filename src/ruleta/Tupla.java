/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Jaruslav Markowski
 */
public class Tupla {
    Ficha ficha;
    int cantidad;
    public Tupla(){
        ficha=new Ficha();
        cantidad=0;
    }
    public Tupla(Ficha ficha,int cantidad){
        this.ficha=ficha;
        this.cantidad=cantidad;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void addCantidad(int extra){
        cantidad+=extra;
    }
}
