package ruleta;

import java.util.ArrayList;

public class Apuesta {
    protected String nombreUsuario;
    protected ArrayList<Ficha> fichas;
    protected float multiplicador;
    public Apuesta(){
        fichas=new ArrayList();
        multiplicador=1;
        nombreUsuario="";
    }
    public Apuesta(String nombreUsuario){
        fichas=new ArrayList();
        multiplicador=1;
        this.nombreUsuario=nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    public void setMultiplicador(float multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public float getMultiplicador() {
        return multiplicador;
    }
    
    
}
