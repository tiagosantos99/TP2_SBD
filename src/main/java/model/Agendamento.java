package model;

public class Agendamento {
	private String idAgendamento;
	private String idAnimal;
	private String localidade;
	private String numeroLicenca;
	private String nomeServico;
	private String estado;
	private String dataHora;

	public Agendamento() {}

	public Agendamento(
			String idAgendamento,
			String idAnimal,
			String localidade,
			String numeroLicenca,
			String nomeServico,
			String estado,
			String dataHora
			) {
		this.setIdAgendamento(idAgendamento);
		this.setIdAnimal(idAnimal);
		this.setLocalidade(localidade);
		this.setNumeroLicenca(numeroLicenca);
		this.setNomeServico(nomeServico);
		this.setEstado(estado);
		this.setDataHora(dataHora);
	}

	public String getIdAgendamento() {
		return idAgendamento;
	}

	public void setIdAgendamento(String idAgendamento) {
		this.idAgendamento = idAgendamento;
	}

	public String getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(String idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getNumeroLicenca() {
		return numeroLicenca;
	}

	public void setNumeroLicenca(String numeroLicenca) {
		this.numeroLicenca = numeroLicenca;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
}
