package MiPrimerCodigo;
import  java.util.Scanner;

public class ManejaAlumnos {

	public ManejaAlumnos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
	       Alumnos clase[];
	       clase=new Alumnos[3];


	       for(int cont=0;cont<3;cont++) {
	           clase[cont]= new Alumnos(null, null, cont, null, cont, false);
	           
	           System.out.println("Nombre alumno "+(cont+1));
	           clase[cont].setNombre(entrada.next());
	           System.out.println("Primer apellido alumno "+(cont+1));
	           clase[cont].setApellido(entrada.next());
	           
	           System.out.println("Nota alumno "+(cont+1));
	           clase[cont].setnotaTIC(entrada.nextDouble());
	       }
	       System.out.println("****************************");
	       System.out.println("* LISTA DE CLASE *");
	       System.out.println("****************************");
	       for(int cont=0;cont<3;cont++) {
	           System.out.print("\n"+(cont+1)+". ");
	           System.out.print(clase[cont].getNombre()+" ");
	           System.out.print(clase[cont].getApellido()+" ");
	          
	           System.out.print(clase[cont].getnotaTIC()+" ");
	           
	       }

	   }

	}


