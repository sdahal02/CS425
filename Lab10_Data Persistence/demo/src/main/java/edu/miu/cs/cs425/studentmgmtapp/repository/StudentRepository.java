package edu.miu.cs.cs425.studentmgmtapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.miu.cs.cs425.studentmgmtapp.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
