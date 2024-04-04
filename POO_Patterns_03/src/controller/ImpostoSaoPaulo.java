package controller;

import javax.swing.JOptionPane;

public class ImpostoSaoPaulo implements IImpostos {

	public ImpostoSaoPaulo() {
		super();	}

	@Override
	public float calculaImpostos() {
		float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Insira a área total do imóvel."));
		int comodos = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de cômodos."));
		float imposto = areaTotal*(10+comodos)*2;
		return imposto;
	}

}
