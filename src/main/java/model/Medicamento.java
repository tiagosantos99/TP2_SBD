package model;

public class Medicamento {
	
	private String idMedicamento;
	private String nome;
	private String tipo;
	private int preço;

	public Medicamento() {}

	public Medicamento(String idMedicamento, String nome, String tipo, int preço) {
		this.idMedicamento = idMedicamento;
		this.nome = nome;
		this.tipo = tipo;
		this.preço = preço;
	}

	public String getIdMedicamento() {
		return idMedicamento;
	}

	public void setIdMedicamento(String idMedicamento) {
		this.idMedicamento = idMedicamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPreço() {
		return preço;
	}

	public void setPreço(int preço) {
		this.preço = preço;
	}
}
