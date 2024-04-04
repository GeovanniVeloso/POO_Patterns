package model;

public class Temporario extends Funcionario {

	private int contratoDia;
	private int contratoMes;
	private int contratoAno;

	public Temporario() {
		super();
	}

	public int getContratoDia() {
		return contratoDia;
	}

	public void setContratoDia(int contratoDia) {
		this.contratoDia = contratoDia;
	}

	public int getContratoMes() {
		return contratoMes;
	}

	public void setContratoMes(int contratoMes) {
		this.contratoMes = contratoMes;
	}

	public int getContratoAno() {
		return contratoAno;
	}

	public void setContratoAno(int contratoAno) {
		this.contratoAno = contratoAno;
	}

}
