package view;

import controller.TempoIntegralController;
import controller.TempoParcialController;
import controller.TemporarioController;

public class Teste {

	public static void main(String[] args) {
		
		TempoIntegralController TIC = new TempoIntegralController();
		TempoParcialController TPC = new TempoParcialController();
		TemporarioController TC = new TemporarioController();
		
		System.out.println("Inicio do Teste 01");
		TIC.contratacao();
		System.out.println("Fim do Teste 01\n******************");
		
		System.out.println("Inicio do Teste 02");
		TPC.contratacao();
		System.out.println("Fim do Teste 02\n******************");
		
		System.out.println("Inicio do Teste 03");
		TC.contratacao();
		System.out.println("Fim do Teste 03\n******************");
	}

}
