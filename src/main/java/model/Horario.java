package model;

public class Horario {

	private String diaSemana;
	private String localidade;
	private String horaInicio;
	private String horaFim;
	
	public Horario() {}
	
	public Horario(String diaSemana, String localidade, String horaInicio, String horaFim) {
		this.setDiaSemana(diaSemana);
		this.setLocalidade(localidade);
		this.setHoraInicio(horaInicio);
		this.setHoraFim(horaFim);
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

}
