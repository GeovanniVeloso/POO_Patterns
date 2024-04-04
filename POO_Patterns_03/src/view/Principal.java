package view;

import controller.ImpostoBeloHorizonte;
import controller.ImpostoCuritiba;
import controller.ImpostoPortoAlegre;
import controller.ImpostoSaoPaulo;

public class Principal {

	public static void main(String[] args) {
		
		ImpostoBeloHorizonte IBH = new ImpostoBeloHorizonte();
		ImpostoCuritiba IC = new ImpostoCuritiba();
		ImpostoPortoAlegre IPA = new ImpostoPortoAlegre();
		ImpostoSaoPaulo ISP = new ImpostoSaoPaulo();
		
		System.out.println("O imposto de São Paulo é R$"+ISP.calculaImpostos());
		System.out.println("O imposto de Belo Horizonte é R$"+IBH.calculaImpostos());
		System.out.println("O imposto de Porto Alegre é R$"+IPA.calculaImpostos());
		System.out.println("O imposto de Curitiba é R$"+IC.calculaImpostos());

	}

}
