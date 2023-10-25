package ruleta;

public class Apuesta {
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

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setFichas(Ficha fichas) {
        this.ficha = fichas;
    }

    public void setMultiplicador(float multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public Ficha getFichas() {
        return ficha;
    }

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
