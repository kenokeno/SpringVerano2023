package mx.edu.itspa.SpringVerano2023.models;

public enum Buildings {
	EDIFICIOA("LUNES"), 
	EDIFICIOB("MARTES"),
	EDIFICIOC("MIERCOLES");

	private final String value;

	Buildings(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
