package mx.edu.itspa.SpringVerano2023.models;

public enum Days {
	LUNES("LUNES"), 
	MARTES("MARTES"),
	MIERCOLES("MIERCOLES"), 
	JUEVES("JUEVES"),
	VIERNES("VIERNES"), 
	SABADO("SABADO");

	private final String value;

	Days(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
