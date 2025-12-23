package model;

public class Cirurgia {
	private String idCirurgia;
	private String dataHora;
	private String tipo;
	private String notasOperatorias;

	public Cirurgia() {}

	public Cirurgia(
			String idCirurgia,
			String dataHora,
			String tipo,
			String notasOperatorias
			) {
		this.setIdCirurgia(idCirurgia);
		this.setDataHora(dataHora);
		this.setTipo(tipo);
		this.setNotasOperatorias(notasOperatorias);
	}

	public String getIdCirurgia() {
		return idCirurgia;
	}

	public void setIdCirurgia(String idCirurgia) {
		this.idCirurgia = idCirurgia;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNotasOperatorias() {
		return notasOperatorias;
	}

	public void setNotasOperatorias(String notasOperatorias) {
		this.notasOperatorias = notasOperatorias;
	}
}
