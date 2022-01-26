package edu.miu.cs.cs425.studentmgmtapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.miu.cs.cs425.studentmgmtapp.model.Student;
import edu.miu.cs.cs425.studentmgmtapp.service.StudentService;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {
	
	private StudentService studentService;
	

	public StudentManagementApplication(StudentService studentService) {
		super();
		this.studentService = studentService;
	}


	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
	

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application started....");
		var  student1= new Student((long) 898988989,"435678","Anna","M","Sophie","3.40","27July2021" );
		//var  student2= new Student((long) 834588989,"365436","Jean","Paul","Damestoy","3.49","29August2021" );		
		studentService.addNewStudent(student1);
		System.out.println("Completed!!");
		
	}

}
