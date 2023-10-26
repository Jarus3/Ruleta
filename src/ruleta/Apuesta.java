package ruleta;

public class Apuesta implements Interfaz_Apuestas{
    protected String nombreUsuario;
    protected Ficha ficha;
    protected float multiplicador;
    public Apuesta(){
        ficha=new Ficha();
        multiplicador=1;
        nombreUsuario="";
    }
    public Apuesta(String nombreUsuario){
        ficha=new Ficha();
        multiplicador=1;
        this.nombreUsuario=nombreUsuario;
    }
    
    public Apuesta(String nombreUsuario, Ficha fichas){
        this.ficha=fichas;
        multiplicador=1;
        this.nombreUsuario=nombreUsuario;
    }
    @Override
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    @Override
    public void setFichas(Ficha fichas) {
        this.ficha = fichas;
    }
    @Override
    public void setMultiplicador(float multiplicador) {
        this.multiplicador = multiplicador;
    }
    @Override
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    @Override
    public Ficha getFichas() {
        return ficha;
    }
    @Override
    public float getMultiplicador() {
        return multiplicador;
    }
    
    @Override
    public String toString(){
        String salida;
        salida=""+ficha.getValor()+" "+multiplicador;
        return salida;
    }
}
