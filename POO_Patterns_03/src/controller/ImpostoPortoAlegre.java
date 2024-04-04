package controller;

import javax.swing.JOptionPane;

public class ImpostoPortoAlegre implements IImpostos {

	public ImpostoPortoAlegre() {
		super();
	}

	@Override
	public float calculaImpostos() {
		float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Insira a área total do imóvel."));
		float garagem = Float
				.parseFloat(JOptionPane.showInputDialog("Insira a área da garagem.\nCaso não haja garagem, digite 0."));

		if (garagem <= 0) {
			float imposto = areaTotal * 8;
			return imposto;
		} else {
			float imposto = (float) (areaTotal * (7.5 + garagem) * 2.5);
			return imposto;
		}
	}

}
