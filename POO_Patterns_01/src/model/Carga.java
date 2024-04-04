package model;

public final class Carga extends Veiculo {
	
	private int cargaMax;
	private int tara;

	public Carga() {
		super();
	}

	@Override
	public float calcVel(float velocMax) {
		float velMed = velocMax * 100000;
		return velMed;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public final void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
	}

	public int getTara() {
		return tara;
	}

	public final void setTara(int tara) {
		this.tara = tara;
	}

}
