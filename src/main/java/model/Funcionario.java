package model;

public class Funcionario {

	private String idFuncionario;
	private String nome;
	private String localidade;
	private String username;
	
	public Funcionario() {}
	
	public Funcionario(String idFuncionario, String nome, String localidade, String username) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.localidade = localidade;
		this.setUsername(username);
	}

	public String getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(String idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
