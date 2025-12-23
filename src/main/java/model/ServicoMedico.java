package model;

public class ServicoMedico {
	private String nomeServico;
	
	public ServicoMedico() {}
	
	public ServicoMedico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

}
