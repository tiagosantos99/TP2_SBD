package model;

public class Clinica {
	private String localidade;
	private String morada;
	private String latitude;
	private String longitude;
	
	public Clinica() {}
	
	public Clinica(String localidade, String morada, String latitude, String longitude) {
		this.localidade = localidade;
		this.morada = morada;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
}
