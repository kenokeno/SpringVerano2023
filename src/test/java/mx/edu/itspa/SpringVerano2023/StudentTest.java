package mx.edu.itspa.SpringVerano2023;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.jpa.QueryHints;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import mx.edu.itspa.SpringVerano2023.models.Student;
import mx.edu.itspa.SpringVerano2023.services.StudentServiceAPI;

public class StudentTest {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private StudentServiceAPI studentServiceAPI;
	
	@Test
	void mapping() {
		List<Student> students = entityManager.createQuery(
				   "SELECT s FROM Student s",Student.class)
				.setHint( QueryHints.HINT_PASS_DISTINCT_THROUGH, false )
				.getResultList();
		System.out.println(students.size());
		Assertions.assertNotNull(students);
	}
	
	@Test
	void crud() {
		Student student = new Student();
		student.setName("Estudiante");
		student.setLastname("De Prueba");
		student.setNo_ctrl("23090000");
		student.setCarrer(8);
		student.setSemester(8);
		student.setRfid("3654275");
		
		Student s = studentServiceAPI.save(student);
		Assertions.assertNotNull(s.getId());
		
		List<Student> students = studentServiceAPI.getAll();
		students.stream().forEach(std->System.out.println(std.getNo_ctrl()));
		Assertions.assertNotNull(students);
		
		/*TEST EDIT*/
		student = studentServiceAPI.getByControlNumber("23090000");
		student.setName("Edit Test");
		student.setLastname("Test Edit");
		student.setNo_ctrl("23091111");
		student.setCarrer(8);
		student.setSemester(8);
		student.setRfid("3654275");
		
		s = studentServiceAPI.save(student);
		
		Assertions.assertEquals("23091111", s.getNo_ctrl());
		
		/*TEST EDIT*/
		student = studentServiceAPI.getByControlNumber("23091111");
		studentServiceAPI.delete(student.getId());
		student = studentServiceAPI.get(student.getId());
		Assertions.assertNull(student);
	}

}
