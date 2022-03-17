package defNotDefault;

public class Coche extends Vehiculo{
	private int puertas;

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public Coche(String matricula, String marca, String modelo, int caballos, int puertas) {
		super(matricula, marca, modelo, caballos);
		this.puertas = puertas;
	}

}
