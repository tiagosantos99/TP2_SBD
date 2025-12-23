package model;

public class ArvoreAnimal {
	private String idAnimal;
	private String idParente;
	private String parentesco;

	public ArvoreAnimal() {}

	public ArvoreAnimal(String idAnimal, String idParente, String parentesco) {
		this.setIdAnimal(idAnimal);
		this.setIdParente(idParente);
		this.setParentesco(parentesco);
	}

	public String getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(String idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getIdParente() {
		return idParente;
	}

	public void setIdParente(String idParente) {
		this.idParente = idParente;
	}

	public String getParentesco() {
		return parentesco;
	}

	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
}
