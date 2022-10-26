package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;
	
public class Postre {
	
	private String sabor;
    protected double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        precioParcial = 0;
    }
	
    public static void addAderezos(Postre postre,Aderezo aderezo){
    	if(postre.getClass() == Helado.class) {
    		postre.getAderezos().add(aderezo);
    	}else {
    		postre.getAderezos().add(aderezo);
    	}
    }
    
    public static void quitarAderezoHelado(Helado helado,Aderezo aderezo){
        helado.getAderezos().remove(aderezo);
    }
    
    

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    public String getSabor() {
    	return sabor;
    }
    
    public double getPrecioParcial() {
    	return precioParcial;
    }
    
    

}
