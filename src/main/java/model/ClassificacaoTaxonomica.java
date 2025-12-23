package model;

public class ClassificacaoTaxonomica {
	private String designacao;
	private String especie;
	private String nomenclaturaBinomial;
	private String regimeAlimentar;
	private String padraoAtividade;
	private String vocalizacao;
	private String raça;
	private String expectativaVida;
	private int peso;
	private int comprimento;
	private String porte;
	private String predisposicaoGenetica;
	private String cuidadosEspecificos;
	
	public ClassificacaoTaxonomica() {}

	public ClassificacaoTaxonomica(
			String designacao, 
			String especie, 
			String nomenclaturaBinomial, 
			String regimeAlimentar, 
			String padraoAtividade, 
			String vocalizacao, 
			String raça, 
			String expectativaVida, 
			int peso,
			int comprimento,
			String porte,
			String predisposicaoGenetica,
			String cuidadosEspecificos
			) {
		this.setDesignacao(designacao);
		this.setEspecie(especie);
		this.setNomenclaturaBinomial(nomenclaturaBinomial);
		this.setRegimeAlimentar(regimeAlimentar);
		this.setPadraoAtividade(padraoAtividade);
		this.setVocalizacao(vocalizacao);
		this.setRaça(raça);
		this.setExpectativaVida(expectativaVida);
		this.setPeso(peso);
		this.setComprimento(comprimento);
		this.setPorte(porte);
		this.setPredisposicaoGenetica(predisposicaoGenetica);
		this.setCuidadosEspecificos(cuidadosEspecificos);
	}

	public String getDesignacao() {
		return designacao;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNomenclaturaBinomial() {
		return nomenclaturaBinomial;
	}

	public void setNomenclaturaBinomial(String nomenclaturaBinomial) {
		this.nomenclaturaBinomial = nomenclaturaBinomial;
	}

	public String getRegimeAlimentar() {
		return regimeAlimentar;
	}

	public void setRegimeAlimentar(String regimeAlimentar) {
		this.regimeAlimentar = regimeAlimentar;
	}

	public String getPadraoAtividade() {
		return padraoAtividade;
	}

	public void setPadraoAtividade(String padraoAtividade) {
		this.padraoAtividade = padraoAtividade;
	}

	public String getVocalizacao() {
		return vocalizacao;
	}

	public void setVocalizacao(String vocalizacao) {
		this.vocalizacao = vocalizacao;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getExpectativaVida() {
		return expectativaVida;
	}

	public void setExpectativaVida(String expectativaVida) {
		this.expectativaVida = expectativaVida;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getPredisposicaoGenetica() {
		return predisposicaoGenetica;
	}

	public void setPredisposicaoGenetica(String predisposicaoGenetica) {
		this.predisposicaoGenetica = predisposicaoGenetica;
	}

	public String getCuidadosEspecificos() {
		return cuidadosEspecificos;
	}

	public void setCuidadosEspecificos(String cuidadosEspecificos) {
		this.cuidadosEspecificos = cuidadosEspecificos;
	}
}
