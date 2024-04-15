package MiCodigo;
import java.util.Scanner;


public class ManejaCilindro {
	 static int radio;
	 static int altura;
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.out.println("Vamos a hacer un circulito");
	       cilindro micilindro;
	       Scanner entrada = new Scanner(System.in);
	       System.out.println("\nAltura: ");// Sacamos por consola un mensaje
			altura = entrada.nextInt();// leemos un número
			System.out.println("\nRadio: ");// Sacamos por consola un mensaje
			radio = entrada.nextInt();// leemos un número
			micilindro= new cilindro(altura, radio);
			System.out.println("el area vale: "+ micilindro.devuelveArea());
			
			System.out.println("La longitud vale: "+ micilindro.devuelveLongitud());
			
	       

	}
}
	
