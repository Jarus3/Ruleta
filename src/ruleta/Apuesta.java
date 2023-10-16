package ruleta;
/**
 *
 * @author Nicolas Stepha Mamani Costas
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Apuesta {
    protected ArrayList<Ficha> fichas;
    protected int[] casillas;

    public Apuesta() {
        fichas = new ArrayList<Ficha>();
        casillas = new int[38];
    }

    public Apuesta(ArrayList<Ficha> fichas, int[] casillas) {
        this.fichas = fichas;
        this.casillas = casillas;
    }

    public Apuesta(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
        casillas = new int[38];
    }

    public Apuesta(int[] casillas) {
        fichas = new ArrayList<Ficha>();
        this.casillas = casillas;
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }

    public Ficha getFichas(int posicion) {
        return fichas.get(posicion);
    }

    public int getCasillas(int posicion) {
        return casillas[posicion];
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
        return "Apuesta [fichas=" + fichas + ", casillas=" + Arrays.toString(casillas) + "]";
    }
}
