package model;

public class Desparasitacao {
	private String idDesparasitacao;
	private String dataHora;
	private String tipo;
	private String produto;

	public Desparasitacao() {}

	public Desparasitacao(
			String idDesparasitacao,
			String dataHora,
			String tipo,
			String produto
			) {
		this.setIdDesparasitacao(idDesparasitacao);
		this.setDataHora(dataHora);
		this.setTipo(tipo);
		this.setProduto(produto);
	}

	public String getIdDesparasitacao() {
		return idDesparasitacao;
	}

	public void setIdDesparasitacao(String idDesparasitacao) {
		this.idDesparasitacao = idDesparasitacao;
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

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
}
