package controller;

import javax.swing.JOptionPane;

public class ImpostoBeloHorizonte implements IImpostos {

	public ImpostoBeloHorizonte() {
		super();
	}
	
	@Override
	public float calculaImpostos() {
		float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Insira a área total do imóvel."));
		int quartos = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de quartos."));
		float imposto = areaTotal*(7+quartos)*4;
		return imposto;
	}

}
