package edu.miu.cs.cs425.studentmgmtapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.studentmgmtapp.model.Student;
import edu.miu.cs.cs425.studentmgmtapp.repository.StudentRepository;
import edu.miu.cs.cs425.studentmgmtapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository= studentRepository;
		
	}

	@Override
	public Student addNewStudent(Student student) {
		return studentRepository.save(student);
	}

}
