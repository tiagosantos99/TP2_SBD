package model;

public class Animal {
	private String idAnimal;
	private String designacao;
	private String nifCliente;
	private String nome;
	private String raça;
	private String sexo;
	private String dataNascimento;
	private int idade;
	private String filiacao;
	private String estadoReprodutivo;
	private String alergias;
	private String cores;
	private String fotografias;
	private int peso;
	private String caracteristicasParticulares;
	private String numeroChip;

	public Animal() {}

	public Animal(
			String idAnimal,
			String designacao,
			String nifCliente,
			String nome,
			String raça,
			String sexo,
			String dataNascimento,
			int idade,
			String filiacao,
			String estadoReprodutivo,
			String alergias,
			String cores,
			String fotografias,
			int peso,
			String caracteristicasParticulares,
			String numeroChip
			) {
		this.setIdAnimal(idAnimal);
		this.setDesignacao(designacao);
		this.setNifCliente(nifCliente);
		this.setNome(nome);
		this.setRaça(raça);
		this.setSexo(sexo);
		this.setDataNascimento(dataNascimento);
		this.setIdade(idade);
		this.setFiliacao(filiacao);
		this.setEstadoReprodutivo(estadoReprodutivo);
		this.setAlergias(alergias);
		this.setCores(cores);
		this.setFotografias(fotografias);
		this.setPeso(peso);
		this.setCaracteristicasParticulares(caracteristicasParticulares);
		this.setNumeroChip(numeroChip);
	}

	public String getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(String idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public String getNifCliente() {
		return nifCliente;
	}

	public void setNifCliente(String nifCliente) {
		this.nifCliente = nifCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFiliacao() {
		return filiacao;
	}

	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}

	public String getEstadoReprodutivo() {
		return estadoReprodutivo;
	}

	public void setEstadoReprodutivo(String estadoReprodutivo) {
		this.estadoReprodutivo = estadoReprodutivo;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getCores() {
		return cores;
	}

	public void setCores(String cores) {
		this.cores = cores;
	}

	public String getFotografias() {
		return fotografias;
	}

	public void setFotografias(String fotografias) {
		this.fotografias = fotografias;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getCaracteristicasParticulares() {
		return caracteristicasParticulares;
	}

	public void setCaracteristicasParticulares(String caracteristicasParticulares) {
		this.caracteristicasParticulares = caracteristicasParticulares;
	}

	public String getNumeroChip() {
		return numeroChip;
	}

	public void setNumeroChip(String numeroChip) {
		this.numeroChip = numeroChip;
	}
}
