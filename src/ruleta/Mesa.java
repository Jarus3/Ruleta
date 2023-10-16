/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Jarus
 */
public class Mesa {
    private Numero[] numeros;
    private Ruleta ruleta;
    public Mesa(){
        ruleta=new Ruleta();
        numeros=new Numero[38];
        for(int i=0;i<38;i++){
            numeros[i]=new Numero(i);
        }
    }
}
