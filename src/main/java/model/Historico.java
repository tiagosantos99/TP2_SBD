package model;

public class Historico {
	private String entradaHistorico;
	private String idAnimal;
	private String idConsulta;
	private String idExameFisico;
	private String idResultadoExame;
	private String idVacina;
	private String idDesparasitacao;
	private String idCirurgia;
	private String idTratamentoTerapeutico;
	
	public Historico() {}

	public Historico(
			String entradaHistorico,
			String idAnimal,
			String idConsulta,
			String idExameFisico,
			String idResultadoExame,
			String idVacina,
			String idDesparasitacao,
			String idCirurgia,
			String idTratamentoTerapeutico
			) {
		this.setEntradaHistorico(entradaHistorico);
		this.setIdAnimal(idAnimal);
		this.setIdConsulta(idConsulta);
		this.setIdExameFisico(idExameFisico);
		this.setIdResultadoExame(idResultadoExame);
		this.setIdVacina(idVacina);
		this.setIdDesparasitacao(idDesparasitacao);
		this.setIdCirurgia(idCirurgia);
		this.setIdTratamentoTerapeutico(idTratamentoTerapeutico);
	}

	public String getEntradaHistorico() {
		return entradaHistorico;
	}

	public void setEntradaHistorico(String entradaHistorico) {
		this.entradaHistorico = entradaHistorico;
	}

	public String getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(String idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(String idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getIdExameFisico() {
		return idExameFisico;
	}

	public void setIdExameFisico(String idExameFisico) {
		this.idExameFisico = idExameFisico;
	}

	public String getIdResultadoExame() {
		return idResultadoExame;
	}

	public void setIdResultadoExame(String idResultadoExame) {
		this.idResultadoExame = idResultadoExame;
	}

	public String getIdVacina() {
		return idVacina;
	}

	public void setIdVacina(String idVacina) {
		this.idVacina = idVacina;
	}

	public String getIdDesparasitacao() {
		return idDesparasitacao;
	}

	public void setIdDesparasitacao(String idDesparasitacao) {
		this.idDesparasitacao = idDesparasitacao;
	}

	public String getIdCirurgia() {
		return idCirurgia;
	}

	public void setIdCirurgia(String idCirurgia) {
		this.idCirurgia = idCirurgia;
	}

	public String getIdTratamentoTerapeutico() {
		return idTratamentoTerapeutico;
	}

	public void setIdTratamentoTerapeutico(String idTratamentoTerapeutico) {
		this.idTratamentoTerapeutico = idTratamentoTerapeutico;
	}
}
