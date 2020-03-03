package collegeStudentSystem;

import java.io.Serializable;

public class Student implements Serializable {
	
	private String firstName, lastName;
	private int studentId;
	
	public Student() {
		
	}
	public Student(String firstName, String lastName, int studentId) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String toString() {
		return "Student: " + getFirstName() + getLastName();
		
	}
	
	//need the equals method to compare 2 object then i can equate each variable look into the hashcode
}