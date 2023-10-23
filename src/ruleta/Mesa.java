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
public class Mesa {
    private Numero[] numeros;
    private Ruleta ruleta;
    private ArrayList<Apuesta> apuestas;
    private Numero ganador;
    public Mesa(){
        ruleta=new Ruleta();
        numeros=new Numero[38];
        ganador=new Numero();
        apuestas=new ArrayList<Apuesta>();
        for(int i=0;i<38;i++){
            numeros[i]=new Numero(i);
        }
    }
    public void registrarApuesta(Apuesta apuesta){
        apuestas.add(apuesta);
    }
    public void reiniciarApuestas(){
        apuestas=new ArrayList<Apuesta>();
    }

    public ArrayList<Apuesta> getApuestas() {
        return (ArrayList<Apuesta>)apuestas.clone();
    }
    public Numero getGanador(){
        ruleta.girar();
        ganador=new Numero(ruleta.getNumero());
        return ganador;
    }
}
