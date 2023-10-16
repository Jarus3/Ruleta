/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruleta;
import java.util.ArrayList;
/**
 *
 * @author Jaruslav Markowski
 */
public class Ruleta {
    private int numero;
    private ArrayList<Integer> historial;
    public Ruleta(){
        numero=0;
        historial=new ArrayList<Integer>();
    }
    public void girar(){
        int salio;
        salio=(int)Math.floor(Math.random()*38);
        numero=salio;
        historial.add(salio);
    }
    public ArrayList getHistorial(){
        ArrayList<Integer> clone;
        clone = (ArrayList<Integer>)historial.clone();
        return clone;
    }
    public int getNumero(){
        return numero;
    }
}
