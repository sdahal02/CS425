package edu.miu.cs.cs425.eregistrar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.eregistrar.model.Student;
import edu.miu.cs.cs425.eregistrar.repository.StudentRepository;
import edu.miu.cs.cs425.eregistrar.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>)studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long studentId) {
		return null;
	}

	@Override
	public void deleteStudentById(Long studentId) {

	}

	/*@Override
	public List<Student> searchStudents(String searchString) {
		return (List<Student>)studentRepository.findAll();
	}*/

}
