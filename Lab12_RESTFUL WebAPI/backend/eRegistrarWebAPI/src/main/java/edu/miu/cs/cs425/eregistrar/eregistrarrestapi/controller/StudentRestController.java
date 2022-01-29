package edu.miu.cs.cs425.eregistrar.eregistrarrestapi.controller;


import edu.miu.cs.cs425.eregistrar.eregistrarrestapi.model.Student;
import edu.miu.cs.cs425.eregistrar.eregistrarrestapi.service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping(value = "/eregistrar/api/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentRestController {

    private StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/list")
    public List<Student> list() {
        return studentService.getAllStudents();
    }

    @PostMapping(value = "/add")
    public Student addNewStudent(@Valid @RequestBody Student student) {
        return studentService.addNewStudent(student);
    }

    @GetMapping(value = "/get/{studentId}")
    public Student getStudentById(@PathVariable Integer studentId) {
        return studentService.getStudentById(studentId);
    }

    @PutMapping(value = "/update/{studentId}")
    public Student updateStudent(@Valid @RequestBody Student editedStudent, @PathVariable Integer studentId) {
        return studentService.updateStudentById(editedStudent, studentId);
    }

    @DeleteMapping(value = "/delete/{studentId}")
    public void deleteStudent(@PathVariable Integer studentId) {
        studentService.deleteStudentById(studentId);
    }

}
