/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 * Write a description of interface Interfaz_Apuesta here.
 * 
 * @author 
 * Jaruslav Markowski
 * Nicolas Stephan Mamani Costas
 */

public interface Interfaz_Apuestas
{
    public void setFichas(Ficha ficha);
    public void setNombreUsuario(String nombreUsuario);
    public void setMultiplicador(float multiplicador);
    public Ficha getFichas();
    public String getNombreUsuario();
    public float getMultiplicador();
}