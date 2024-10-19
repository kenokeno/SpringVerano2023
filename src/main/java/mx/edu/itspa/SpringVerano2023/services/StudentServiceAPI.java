package mx.edu.itspa.SpringVerano2023.services;

import mx.edu.itspa.SpringVerano2023.commons.GenericServiceAPI;
import mx.edu.itspa.SpringVerano2023.models.Student;
import mx.edu.itspa.SpringVerano2023.repositories.StudentRepository;

public interface StudentServiceAPI 
	extends GenericServiceAPI<Student, Long>, StudentRepository{
	
}
