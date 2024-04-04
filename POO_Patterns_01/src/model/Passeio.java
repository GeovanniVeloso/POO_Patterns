package model;

public final class Passeio extends Veiculo {

	private int qtdPassageiros;

	public Passeio() {
		super();
	}

	@Override
	public float calcVel(float velocMax) {
		float velMed = velocMax*1000;
		return velMed;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

}
