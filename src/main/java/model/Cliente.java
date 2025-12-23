package model;

public class Cliente {
	private String nif;
	private String nome;
	private String contatos;
	private String morada;
	private String tipo;
	private String capitalSocial;
	private String preferenciasLinguisticas;

	public Cliente() {}
	
	public Cliente(String nif, String nome, String contatos, String morada, String tipo, String capitalSocial, String preferenciasLinguisticas) {
		this.setNif(nif);
		this.setNome(nome);
		this.setContatos(contatos);
		this.setMorada(morada);
		this.setTipo(tipo);
		this.setCapitalSocial(capitalSocial);
		this.setPreferenciasLinguisticas(preferenciasLinguisticas);
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContatos() {
		return contatos;
	}

	public void setContatos(String contatos) {
		this.contatos = contatos;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCapitalSocial() {
		return capitalSocial;
	}

	public void setCapitalSocial(String capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	public String getPreferenciasLinguisticas() {
		return preferenciasLinguisticas;
	}

	public void setPreferenciasLinguisticas(String preferenciasLinguisticas) {
		this.preferenciasLinguisticas = preferenciasLinguisticas;
	}

}
