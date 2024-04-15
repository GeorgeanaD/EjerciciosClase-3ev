package MiCodigo;

public class cilindro {
	
	private int altura;
	private int radio;
	
	/**
	 * @param altura
	 * @param radio
	 */
	public cilindro(int altura, int radio) {
		this.altura = altura;
		this.radio = radio;
	}
	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	/**
	 * @return the radio
	 */
	public int getRadio() {
		return radio;
	}
	/**
	 * @param radio the radio to set
	 */
	public void setRadio(int radio) {
		this.radio = radio;
	}
	int devuelveArea() {
		int respuesta;
		respuesta=(int) ( (int) (Math.PI*Math.sqrt(radio))+(2*Math.PI*radio*altura));
		return respuesta;
		
	}
	int devuelveLongitud(){
		int respuesta;
		respuesta=(int) (2*Math.PI*radio*altura);
		return respuesta;
	}
	
	

}


