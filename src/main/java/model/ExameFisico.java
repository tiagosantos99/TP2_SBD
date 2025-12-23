package model;

public class ExameFisico {
	private String idExameFisico;
	private String dataHora;
	private String temperatura;
	private int peso;
	private int frequenciaCardiaca;
	private int frequenciaRespiratoria;

	public ExameFisico() {}

	public ExameFisico(
			String idExameFisico,
			String dataHora,
			String temperatura,
			int peso,
			int frequenciaCardiaca,
			int frequenciaRespiratoria
		) {
		this.setIdExameFisico(idExameFisico);
		this.setDataHora(dataHora);
		this.setTemperatura(temperatura);
		this.setPeso(peso);
		this.setFrequenciaCardiaca(frequenciaCardiaca);
		this.setFrequenciaRespiratoria(frequenciaRespiratoria);
	}

	public String getIdExameFisico() {
		return idExameFisico;
	}

	public void setIdExameFisico(String idExameFisico) {
		this.idExameFisico = idExameFisico;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getFrequenciaCardiaca() {
		return frequenciaCardiaca;
	}

	public void setFrequenciaCardiaca(int frequenciaCardiaca) {
		this.frequenciaCardiaca = frequenciaCardiaca;
	}

	public int getFrequenciaRespiratoria() {
		return frequenciaRespiratoria;
	}

	public void setFrequenciaRespiratoria(int frequenciaRespiratoria) {
		this.frequenciaRespiratoria = frequenciaRespiratoria;
	}
}
