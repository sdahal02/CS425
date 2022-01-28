package edu.miu.cs.cs425.eregistrar.service;

import java.util.List;

import edu.miu.cs.cs425.eregistrar.model.Student;

public interface StudentService {

	public abstract List<Student> getAllStudents();
	public abstract Student saveStudent(Student s);
	public abstract Student getStudentById(Long studentId);
	public abstract void deleteStudentById(Long studentId);

	//List<Student> searchStudents(String searchString);
}
