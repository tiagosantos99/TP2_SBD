package model;

public class Vacina {
	private String idVacina;
	private String dataHora;
	private String tipo;
	private String fabricante;

	public Vacina() {}
	
	public Vacina(
			String idVacina,
			String dataHora,
			String tipo,
			String fabricante
			) {
		this.setIdVacina(idVacina);
		this.setDataHora(dataHora);
		this.setTipo(tipo);
		this.setFabricante(fabricante);
	}

	public String getIdVacina() {
		return idVacina;
	}

	public void setIdVacina(String idVacina) {
		this.idVacina = idVacina;
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

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
}
