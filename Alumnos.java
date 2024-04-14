package MiPrimerCodigo;

public class Alumnos {
	private String nombre;
    private String apellido;
    private int años;
    private String telefono;
    private double notaTIC;
    private boolean usaComedor;
    
	public Alumnos(String nombre, String apellido, int años, String telefono, float notaTIC, boolean usaComedor) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.años = años;
		this.telefono = telefono;
		this.notaTIC = notaTIC;
		this.usaComedor = usaComedor;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getAños() {
		return años;
	}
	public void setAños(int años) {
		this.años = años;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public double getnotaTIC() {
		return notaTIC;
	}
	public void setnotaTIC(double notaTIC) {
		this.notaTIC = notaTIC;
	}
	public boolean isUsaComedor() {
		return usaComedor;
	}
	public void setUsaComedor(boolean usaComedor) {
		this.usaComedor = usaComedor;
	}

	
}

