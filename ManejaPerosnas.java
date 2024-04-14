package MiPrimerCodigo;

public class ManejaPerosnas {

	public static void main(String[] args) {
		 Personas alumnos[];
	       alumnos=new Personas[3];
	       alumnos[0]=new Personas("García","Rodríguez","Ana",13, 642784313, true);
	       alumnos[1]=new Personas("Plou","Ledesma","Manuel", 13, 642784113, false);
	       alumnos[2]=new Personas("de la Vega","Próspera","Juana", 13, 642784113, false);
	       for(int cont=0;cont<3;cont++) {
	           System.out.println("\n- "+alumnos[cont].getNombreCompleto());   
	           System.out.println("\n- "+alumnos[cont].getEdadAnios());
	           System.out.println("\n- "+alumnos[cont].isUsaComedor());
	       }
	   }

	}


