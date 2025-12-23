package model;

public class Utilizador {
	private String username;
	private String password;
	private String perfil;
	
	public Utilizador() {}

	public Utilizador(
			String username,
			String password,
			String perfil
			) {
		this.setUsername(username);
		this.setPassword(password);
		this.setPerfil(perfil);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
}
