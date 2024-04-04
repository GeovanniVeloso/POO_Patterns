package model;

import java.time.LocalTime;

public class TempoParcial extends Funcionario {

	private LocalTime horaInicio;
	private LocalTime horaFim;

	public TempoParcial() {
		super();
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(LocalTime horaFim) {
		this.horaFim = horaFim;
	}

}
