package controller;

import model.Funcionario;
import model.Temporario;

public class TemporarioController implements IContratacao {

	public TemporarioController() {
		super();
	}

	@Override
	public void contratacao() {
		Temporario TF = new Temporario();
		TF.setNome("Geovanni");
		TF.setId("001");
		TF.setSalario(1500.00f);
		TF.setContratoMes(06);
		TF.setContratoDia(31);
		TF.setContratoAno(2025);

		System.out.println("O Funcionário " + TF.getNome()
				+ " da categoria Temporário foi contratado.\nEle possui os seguntes dados:\nId:" + TF.getId()
				+ "\nSalário: R$" + TF.getSalario());

	}

}
