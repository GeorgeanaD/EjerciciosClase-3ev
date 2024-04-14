package MiPrimerCodigo;

import java.util.Scanner;

public class ManejaMercancia {

	public ManejaMercancia() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		Mercancia[] productos;
		productos= new Mercancia[3];
		int cont;
		for(cont=0;cont<3; cont++) {
		productos[cont]= new Mercancia(null, null, null);
		System.out.println("Mercancia: "+(cont+1));
		productos[cont].setMercancia(null);
		System.out.println("Proveedor"+(cont+1));
		productos[cont].setProveedor(null);
		System.out.println("Destinacion "+(cont+1));
		productos[cont].setDestinacion(null);
		

	}
	System.out.println("****************************");
    System.out.println("* LISTA DE PRODUCTOS *");
    System.out.println("****************************");
    for(int cont1=0;cont<3;cont++) {
    	System.out.print("\n"+(cont+1)+". ");
    	System.out.print("\n"+productos[cont].getMercancia());
    	System.out.print("\n"+productos[cont].getProveedor());
    	System.out.print("\n"+productos[cont].getDestinacion());
    	
    	
    }
}
}