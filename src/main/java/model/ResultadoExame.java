package model;

public class ResultadoExame {
	private String idResultadoExame;
	private String dataHora;
	private String tipo;
	private String descricao;

	public ResultadoExame() {}

	public ResultadoExame(
			String idResultadoExame,
			String dataHora,
			String tipo,
			String descricao
			) {
		this.setIdResultadoExame(idResultadoExame);
		this.setDataHora(dataHora);
		this.setTipo(tipo);
		this.setDescricao(descricao);
	}

	public String getIdResultadoExame() {
		return idResultadoExame;
	}

	public void setIdResultadoExame(String idResultadoExame) {
		this.idResultadoExame = idResultadoExame;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
