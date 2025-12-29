package model;

public class Veterinario {

	private String numeroLicenca;
	private String nome;
	private String username;
	
	public Veterinario() {}
	
	public Veterinario(String numeroLicenca, String nome, String username) {
		this.setNumeroLicenca(numeroLicenca);
		this.setNome(nome);
		this.setUsername(username);
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
