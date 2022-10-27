package Procesos;


import Postres.Postre;

public class ManejadorDePrecio {
	Postre postre;

    public static String showPrecioFinal(Postre postre){
    	double precioFinal =(postre.getPrecioParcial()+(postre.getPrecioParcial()*0.12))+(postre.getAderezos().size()*0.50);
        return "Precio Final: $ " + precioFinal;
    }
}
