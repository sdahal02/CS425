package edu.miu.cs.cs425.eregistrar.eregistrarrestapi.service.impl;

import edu.miu.cs.cs425.eregistrar.eregistrarrestapi.model.Student;
import edu.miu.cs.cs425.eregistrar.eregistrarrestapi.repository.StudentRepository;
import edu.miu.cs.cs425.eregistrar.eregistrarrestapi.service.StudentService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll(Sort.by("title"));
    }

    @Override
    public Student addNewStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public Student updateStudentById(Student editedStudent, Integer studentId) { return studentRepository.save(editedStudent); }

    @Override
    public void deleteStudentById(Integer studentId) {
        studentRepository.deleteById(studentId);
    }
}
