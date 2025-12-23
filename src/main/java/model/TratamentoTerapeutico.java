package model;

public class TratamentoTerapeutico {
	private String idTratamentoTerapeutico;
	private String dataHora;
	private String tipo;

	public TratamentoTerapeutico() {}

	public TratamentoTerapeutico(
			String idTratamentoTerapeutico,
			String dataHora,
			String tipo
			) {
		this.setIdTratamentoTerapeutico(idTratamentoTerapeutico);
		this.setDataHora(dataHora);
		this.setTipo(tipo);
	}

	public String getIdTratamentoTerapeutico() {
		return idTratamentoTerapeutico;
	}

	public void setIdTratamentoTerapeutico(String idTratamentoTerapeutico) {
		this.idTratamentoTerapeutico = idTratamentoTerapeutico;
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
}
