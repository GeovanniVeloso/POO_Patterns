package controller;

import model.Funcionario;
import model.TempoIntegral;

public class TempoIntegralController implements IContratacao {

	public TempoIntegralController() {
		super();
	}

	@Override
	public void contratacao() {
		TempoIntegral TIF = new TempoIntegral();
		TIF.setNome("Gabriel");
		TIF.setId("003");
		TIF.setSalario(2000.00f);
		TIF.setBancoHoras(16.30f);
		
		System.out.println("O Funcionário " + TIF.getNome()
		+ " da categoria Tempo Integral foi contratado.\nEle possui os seguntes dados:\nId:" + TIF.getId()
		+ "\nSalário: R$" + TIF.getSalario());
	}

}
