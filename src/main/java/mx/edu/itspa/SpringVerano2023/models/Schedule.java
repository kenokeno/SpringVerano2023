package mx.edu.itspa.SpringVerano2023.models;

public class Schedule {
	private Long id;
	private Days day;
	private String hours;
	private Buildings building;
	
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Schedule(Long id, Days day, String hours, Buildings building) {
		super();
		this.id = id;
		this.day = day;
		this.hours = hours;
		this.building = building;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Days getDay() {
		return day;
	}
	public void setDay(Days day) {
		this.day = day;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public Buildings getBuilding() {
		return building;
	}
	public void setBuilding(Buildings building) {
		this.building = building;
	}
}
