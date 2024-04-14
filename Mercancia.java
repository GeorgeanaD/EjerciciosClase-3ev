package MiPrimerCodigo;

public class Mercancia {
	String mercancia;
	String proveedor;
	String destinacion;
	public Mercancia(String mercancia, String proveedor, String destinacion) {
		super();
		this.mercancia = mercancia;
		this.proveedor = proveedor;
		this.destinacion = destinacion;
	}

	public String getMercancia() {
		return mercancia;
	}


	public void setMercancia(String mercancia) {
		this.mercancia = mercancia;
	}


	public String getProveedor() {
		return proveedor;
	}


	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}


	public String getDestinacion() {
		return destinacion;
	}


	public void setDestinacion(String destinacion) {
		this.destinacion = destinacion;
	}


	

}
