package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
}

