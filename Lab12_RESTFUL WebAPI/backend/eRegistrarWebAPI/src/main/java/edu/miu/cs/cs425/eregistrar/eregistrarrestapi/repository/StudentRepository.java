package edu.miu.cs.cs425.eregistrar.eregistrarrestapi.repository;

import edu.miu.cs.cs425.eregistrar.eregistrarrestapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
