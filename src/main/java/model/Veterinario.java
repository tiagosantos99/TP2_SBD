package model;

public class Veterinario {

	private String numeroLicenca;
	private String nome;
	
	public Veterinario() {}
	
	public Veterinario(String numeroLicenca, String nome) {
		this.setNumeroLicenca(numeroLicenca);
		this.setNome(nome);
	}

	public String getNumeroLicenca() {
		return numeroLicenca;
	}

	public void setNumeroLicenca(String numeroLicenca) {
		this.numeroLicenca = numeroLicenca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
