package MiPrimerCodigo;

public class MercanciaCaducidad extends Mercancia{
	   private int dia;
	   private int mes;
	   private int anio;
	   
	 
	public MercanciaCaducidad(String mercancia, String proveedor, String destinacion, int dia, int mes, int anio) {
		super(mercancia, proveedor, destinacion);
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
	}
	
}