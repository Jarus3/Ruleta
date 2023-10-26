/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Jaruslav Markowski
 */
public class Numero {
    private String color;
    private int valor;
    private int docena;
    private int fila;
    private int columna;
    public Numero(){
        color="verde";
        valor=0;
        docena=0;
        fila=0;
        columna=0;
    }
    public Numero(int valor){
        this.valor=valor;
        iniciar();
    }
    public Numero(String valor){
        this.valor=Integer.parseInt(valor); 
        iniciar();
    }
    public void iniciar(){
        if(valor==0||valor==37){
            color="verde";
            docena=0;
            fila=0;
            columna=0;
        }else{
            if(valor%3==0){
                columna=3;
            }else{
                columna=valor%3;
            }
            fila=(valor+2)/3;
            docena=(valor+11)/12;
            if (valor >= 1 && valor <= 10 || valor >= 19 && valor <= 28) {
                if (valor % 2 == 0) {
                    color="Negro";
                } else {
                    color="Rojo";
                }
            } else if (valor >= 11 && valor <= 18 || valor >= 29 && valor <= 36) {
                if (valor % 2 == 0) {
                    color="Rojo";
                } else {
                    color="Negro";
                }
            }
        }
    }
    public String getColor() {
        return color;
    }

    public int getValor() {
        return valor;
    }

    public int getDocena() {
        return docena;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
    @Override
    public String toString(){
        String num;
        if(valor==37){
            num="00";
        }else{
            num=""+valor;
        }
        return num;
    }
}
