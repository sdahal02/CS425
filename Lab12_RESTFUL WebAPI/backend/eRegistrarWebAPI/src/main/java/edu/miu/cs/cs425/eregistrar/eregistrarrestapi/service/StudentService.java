package edu.miu.cs.cs425.eregistrar.eregistrarrestapi.service;



import edu.miu.cs.cs425.eregistrar.eregistrarrestapi.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    public abstract Student addNewStudent(Student newStudent);
    public abstract Student getStudentById(Integer studentId);
    public abstract Student updateStudentById(Student editedStudent, Integer studentId);
    public abstract void deleteStudentById(Integer studentId);
}
