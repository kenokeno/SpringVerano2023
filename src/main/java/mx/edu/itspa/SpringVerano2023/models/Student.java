package mx.edu.itspa.SpringVerano2023.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private Long id;
	@Column
	private String no_ctrl;
	@Column
	private String name;
	@Column
	private String lastname;
	@Column
	private Integer semester;
	@Column
	private Integer carrer;
	@Column
	private String rfid;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long id, String no_ctrl, String name, String lastname, Integer semester, Integer carrer,
			String rfid) {
		super();
		this.id = id;
		this.no_ctrl = no_ctrl;
		this.name = name;
		this.lastname = lastname;
		this.semester = semester;
		this.carrer = carrer;
		this.rfid = rfid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNo_ctrl() {
		return no_ctrl;
	}

	public void setNo_ctrl(String no_ctrl) {
		this.no_ctrl = no_ctrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getSemester() {
		return semester;
	}

	public void setSemester(Integer semester) {
		this.semester = semester;
	}

	public Integer getCarrer() {
		return carrer;
	}

	public void setCarrer(Integer carrer) {
		this.carrer = carrer;
	}

	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	
	
}
