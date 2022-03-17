package defNotDefault;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private int caballos;
	private int dias;
	
	
	public String toStringCon() {
		return " matricula= " + matricula + ", marca= " + marca + ", modelo= " + modelo + ", dias= " + dias
				+ ", empresa= " + empresa.getNombre() ;
	}

	
	public String toStringSin() {
		return " matricula= " + matricula + ", marca= " + marca + ", modelo= " + modelo ;
	}
	
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public Vehiculo(String matricula, String marca, String modelo, int caballos) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.caballos = caballos;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public boolean isAlquiler() {
		return alquiler;
	}
	public void setAlquiler(boolean alquiler) {
		this.alquiler = alquiler;
	}
	private Empresa empresa;
	private boolean alquiler;

}
