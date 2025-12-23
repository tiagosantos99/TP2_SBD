package model;

public class Avaliacao {
	private String dataHora;
	private String nifCliente;
	private String nomeServico;
	private String pontuacao;
	private String comentario;
	
	public Avaliacao() {}

	public Avaliacao(String dataHora, String nifCliente, String nomeServico, String pontuacao, String comentario) {
		this.setDataHora(dataHora);
		this.setNifCliente(nifCliente);
		this.setNomeServico(nomeServico);
		this.setPontuacao(pontuacao);
		this.setComentario(comentario);
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public String getNifCliente() {
		return nifCliente;
	}

	public void setNifCliente(String nifCliente) {
		this.nifCliente = nifCliente;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public String getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(String pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
