package defNotDefault;

public class Empresa {

	private String nombre;
	private String cif;
	
	
	public Empresa(String nombre, String cif) {
		super();
		this.nombre = nombre;
		this.cif = cif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
}
