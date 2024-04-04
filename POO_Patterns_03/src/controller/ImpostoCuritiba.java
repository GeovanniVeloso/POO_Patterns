package controller;

import javax.swing.JOptionPane;

public class ImpostoCuritiba implements IImpostos {

	public ImpostoCuritiba() {
		super();
	}
	
	@Override
	public float calculaImpostos() {
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do imóvel."));
		float areaTotal = Float.parseFloat(JOptionPane.showInputDialog("Insira a área total do imóvel."));
		
		if(idade > 50) {
			float imposto = areaTotal * 5 +(idade * 3);
			return imposto;
		}else if (idade < 20){
			float imposto = areaTotal * 5 +(idade * 2);
			return imposto;
		}else {
			float imposto = (float) (areaTotal * 5 +(idade * 2.5));
			return imposto;
		}
	}

}
