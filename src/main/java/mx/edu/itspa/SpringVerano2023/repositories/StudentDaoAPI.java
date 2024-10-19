package mx.edu.itspa.SpringVerano2023.repositories;

import org.springframework.data.repository.CrudRepository;

import mx.edu.itspa.SpringVerano2023.models.Student;

public interface StudentDaoAPI 
	extends CrudRepository<Student, Long>{
}
