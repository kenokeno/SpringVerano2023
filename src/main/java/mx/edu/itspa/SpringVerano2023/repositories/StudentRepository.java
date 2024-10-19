package mx.edu.itspa.SpringVerano2023.repositories;

import mx.edu.itspa.SpringVerano2023.models.Student;

public interface StudentRepository {
	Student getByControlNumber(String controlNumber);
}
