package controller;

import java.time.LocalTime;

import model.Funcionario;
import model.TempoParcial;

public class TempoParcialController implements IContratacao {

	public TempoParcialController() {
		super();
	}

	@Override
	public void contratacao() {
		TempoParcial TPF = new TempoParcial();
		TPF.setNome("Gustavo");
		TPF.setId("002");
		TPF.setSalario(1500.00f);
		LocalTime horaInicio = LocalTime.of(8, 00);
		LocalTime horaFim = LocalTime.of(17, 00);
		TPF.setHoraInicio(horaInicio);
		TPF.setHoraFim(horaFim);
		
		System.out.println("O Funcionário " + TPF.getNome()
		+ " da categoria Tempo Parcial foi contratado.\nEle possui os seguntes dados:\nId:" + TPF.getId()
		+ "\nSalário: R$" + TPF.getSalario());
	}

}
