package edu.miu.cs.cs425.eregistrar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.miu.cs.cs425.eregistrar.model.Student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	

}
