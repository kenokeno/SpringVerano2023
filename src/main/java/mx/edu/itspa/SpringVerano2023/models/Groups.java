package mx.edu.itspa.SpringVerano2023.models;

import java.util.ArrayList;
import java.util.List;

public class Groups {
	private Long id;
	private String name;
	private List<Schedule> schedules = new ArrayList<>();
	private Subject subject;
	private List<Student> students = new ArrayList<>();
	public Groups() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Groups(Long id, String name, List<Schedule> schedules, Subject subject, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.schedules = schedules;
		this.subject = subject;
		this.students = students;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Schedule> getSchedules() {
		return schedules;
	}
	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Groups [id=" + id + ", name=" + name + ", schedules=" + schedules + ", subject=" + subject
				+ ", students=" + students + "]";
	}
	
	
}
