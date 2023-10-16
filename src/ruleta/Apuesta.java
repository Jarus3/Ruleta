package ruleta;
/**
 *
 * @author Nicolas Stepha Mamani Costas
 */
import java.util.ArrayList;

public class Apuesta {
    protected Usuario usuario;
    protected ArrayList<Ficha> fichas;
    private float multiplicador;

    public Apuesta() {
        fichas = new ArrayList<Ficha>();
        usuario = new Usuario();
        multiplicador = 0;
    }

    public Apuesta(ArrayList<Ficha> fichas, Usuario usuario, float multiplicador) {
        this.fichas = fichas;
        this.usuario = usuario;
        this.multiplicador = multiplicador;
    }

    public Apuesta(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
        usuario = new Usuario();
        multiplicador = 0;
    }

    public Apuesta(float multiplicador) {
        fichas = new ArrayList<Ficha>();
        usuario = new Usuario();
        this.multiplicador = multiplicador;
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public Ficha getFichas(int posicion) {
        return fichas.get(posicion);
    }

    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    public void setFichas(Ficha ficha) {
        fichas.add(0, ficha);
    }
    public void setFichas(int posicion, Ficha ficha) {
        fichas.add(posicion, ficha);
    }

    public String toString() {
        return "Apuesta [usuario=" + usuario + "fichas=" + fichas + " multiplicador="+multiplicador+" ]";
    }
}
