package edu.miu.cs.cs425.eregistrar.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotBlank(message = "* StudentID is required")
	private Long studentID;
	@NotBlank(message = "* StudentNumber is required")
	private String studentNumber;
	@NotBlank(message = "* First Name is required")
	private String firstName;
	private String middleName;
	@NotBlank(message = "* Last Name is required")
	private String lastName;
	private Float cgpa;
	@NotBlank(message = "* Enrollment Date is required")
	private LocalDate enrollmentDate;
	@NotBlank(message = "* Is International is required")
	private Boolean isInternational; //implement as dropdown or radio button

	public Student() {
		
	}

	public Student(@NotBlank(message = "* StudentID is required") Long studentID,
			@NotBlank(message = "* StudentNumber is required") String studentNumber,
			@NotBlank(message = "* First Name is required") String firstName, String middleName,
			@NotBlank(message = "* Last Name is required") String lastName, Float cgpa,
			@NotBlank(message = "* Enrollment Date is required") LocalDate enrollmentDate,
			@NotBlank(message = "* Is International is required") Boolean isInternational) {
		super();
		this.studentID = studentID;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.enrollmentDate = enrollmentDate;
		this.isInternational = isInternational;
	}

	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCgpa(Float cgpa) {
		this.cgpa = cgpa;
	}

	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public void setIsInternational(Boolean isInternational) {
		this.isInternational = isInternational;
	}

	@Override
	public String toString() {
		return "Student{" +
				"studentID=" + studentID +
				", studentNumber='" + studentNumber + '\'' +
				", firstName='" + firstName + '\'' +
				", middleName='" + middleName + '\'' +
				", lastName='" + lastName + '\'' +
				", cgpa=" + cgpa +
				", enrollmentDate=" + enrollmentDate +
				", isInternational=" + isInternational +
				'}';
	}
}
