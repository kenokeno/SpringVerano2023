package mx.edu.itspa.SpringVerano2023.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import mx.edu.itspa.SpringVerano2023.commons.GenericServiceImpl;
import mx.edu.itspa.SpringVerano2023.models.Student;
import mx.edu.itspa.SpringVerano2023.repositories.StudentDaoAPI;

@Service
public class StudentServiceImpl extends GenericServiceImpl<Student, Long> 
	implements StudentServiceAPI{
	
	@Autowired
	private StudentDaoAPI studentDaoAPI;
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public CrudRepository<Student, Long> getDao() {
		// TODO Auto-generated method stub
		return studentDaoAPI;
	}
	
	@Override
	public Student getByControlNumber(String controlNumber) {
		// TODO Auto-generated method stub
		Student student = null;
		Query query = entityManager
				.createQuery("SELECT NEW mx.edu.itspa.SpringVerano2023.models.Student(d.id, d.no_ctrl, d.name, d.lastname, d.semester,d.carrer,d.rfid) FROM Student d WHERE d.no_ctrl='"+controlNumber+"'", Student.class);
		student = (Student)query.getSingleResult();
		return student;
	}

}
