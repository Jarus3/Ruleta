/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author Jaruslav Markowski
 */
public class PruebaAleatorio {
    private int rep=100;           //numero de lanzamientos
    private int presicion=1000;     //el numero de ceros es el de decimales de presicion
    private Ruleta r;
    public static void main(String[] args) {
        PruebaAleatorio p=new PruebaAleatorio();
        int[] aux;
        System.out.println("El porcentaje deberia ser 2.631 mas o menos");
        System.out.println();
        System.out.println("Con 10000000 repeticiones 1:");
        p.setRep(100000000);
        aux=p.datos(p.rep);
        p.mostrar(aux,p.porcentaje(p.rep, aux));
        System.out.println();
        System.out.println("Con 10000000 repeticiones 2:");
        p.setRep(100000000);
        aux=p.datos(p.rep);
        p.mostrar(aux,p.porcentaje(p.rep, aux));
        System.out.println();
        System.out.println("Con 10000000 repeticiones 3:");
        p.setRep(100000000);
        aux=p.datos(p.rep);
        p.mostrar(aux,p.porcentaje(p.rep, aux));
    }
    public PruebaAleatorio(){
        r=new Ruleta();
    }
    public int lanzarPruebaAleatorio(){
        int salio;
        r.girar();
        salio=r.getNumero();
        return salio;
    }
    public int[] datos(int n){
        int[] res=new int[38];
        int aux;
        for(int i=0;i<n;i++){
            aux=lanzarPruebaAleatorio();
            res[aux]+=1;                
        }
        return res;
    }
    public void mostrar(int[] cad,float[] por){
        for(int i=0;i<38;i++){
            
            System.out.println("Apariciones del "+i+": "+cad[i]+"   Porcentaje: "+por[i]+"%");
            
        }
    }
    public float[] porcentaje(int n,int[] cad){
        //int presicion=1000;
        float[] res=new float[38];
        float aux;
        for(int i=0;i<38;i++){
            aux=cad[i]*100;
            aux=aux/n;
            aux=aux*presicion;
            res[i]=Math.round(aux);
            res[i]/=presicion;
        }
        return res;
    }

    public void setRep(int rep) {
        this.rep = rep;
    }
    
}

