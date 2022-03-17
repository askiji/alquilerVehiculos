package defNotDefault;

public class Moto extends Vehiculo {

	private boolean maletin;

	public Moto(String matricula, String marca, String modelo, int caballos, boolean maletin) {
		super(matricula, marca, modelo, caballos);
		this.maletin = maletin;
	}

	public boolean isMaletin() {
		return maletin;
	}

	public void setMaletin(boolean maletin) {
		this.maletin = maletin;
	}
}
