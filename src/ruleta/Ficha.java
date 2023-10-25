/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Nicolas Stepha Mamani Costas
 */
public class Ficha {
    private int valor;
    private String color;
    public Ficha(){
        valor=5;
        color="Black";
    }
    public Ficha(int valor){
        this.valor=valor;
        this.color="Black";
    }
    public Ficha(String color){
        valor=5;
        this.color=color;
    }
    public Ficha(int valor, String color){
        this.valor=valor;
        this.color=color;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int getValor(){
        return valor;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return "Ficha [Color: " + color + ", Valor: " + valor + "]";
    }
}