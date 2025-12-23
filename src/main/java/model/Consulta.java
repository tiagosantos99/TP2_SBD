package model;

public class Consulta {
	private String idConsulta;
	private String dataHora;
	private String motivo;
	private String sintomas;
	private String diagnostico;
	private String medicacaoPrescrita;

	public Consulta() {}
	
	public Consulta(
			String idConsulta,
			String dataHora,
			String motivo,
			String sintomas,
			String diagnostico,
			String medicacaoPrescrita
			) {
		this.setIdConsulta(idConsulta);
		this.setDataHora(dataHora);
		this.setMotivo(motivo);
		this.setSintomas(sintomas);
		this.setDiagnostico(diagnostico);
		this.setMedicacaoPrescrita(medicacaoPrescrita);
	}

	public String getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getMedicacaoPrescrita() {
		return medicacaoPrescrita;
	}

	public void setMedicacaoPrescrita(String medicacaoPrescrita) {
		this.medicacaoPrescrita = medicacaoPrescrita;
	}

}
