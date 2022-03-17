package defNotDefault;

public class Furgoneta extends Vehiculo{
	
	private int capacidad;

	public int getCapacidad() {
		return capacidad;
	}

	public Furgoneta(String matricula, String marca, String modelo, int caballos, int capacidad) {
		super(matricula, marca, modelo, caballos);
		this.capacidad = capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	

}
