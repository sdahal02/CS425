package edu.miu.cs.cs425.studentmgmtapp.model;

import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	private String studentNumber;
	private String firstName;
	private String middleName;
	private String lastname;
	private String cgpa;
	private String dateOfEnrollment;
	
	
	public Student(Long studentId,@NotNull  String studentNumber, @NotNull String firstName, String middleName, @NotNull String lastname,
			String cgpa, String dateOfEnrollment) {
		super();
		this.studentId = studentId;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastname = lastname;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}


	Student() {
		// This constructor is used for Hibernate only 
	}


	public Long getStudentId() {
		return studentId;
	}


	public String getStudentNumber() {
		return studentNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public String getLastname() {
		return lastname;
	}


	public String getCgpa() {
		return cgpa;
	}


	public String getDateOfEnrollment() {
		return dateOfEnrollment;
	}


	@Override
	public int hashCode() {
		return Objects.hash(cgpa, dateOfEnrollment, firstName, lastname, middleName, studentId, studentNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(cgpa, other.cgpa) && Objects.equals(dateOfEnrollment, other.dateOfEnrollment)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(middleName, other.middleName) && Objects.equals(studentId, other.studentId)
				&& Objects.equals(studentNumber, other.studentNumber);
	}


	@Override
	public String toString() {
		return String.format(
				"Student [studentId=%s, studentNumber=%s, firstName=%s, middleName=%s, lastname=%s, cgpa=%s, dateOfEnrollment=%s]",
				studentId, studentNumber, firstName, middleName, lastname, cgpa, dateOfEnrollment);
	}
 
}
