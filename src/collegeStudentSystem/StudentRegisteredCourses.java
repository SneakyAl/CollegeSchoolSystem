package collegeStudentSystem;

import java.util.LinkedList;

public class StudentRegisteredCourses {

	private int studentId, firstCourseId, secondCourseId, thirdCourseId, fourthCourseId;
	
	public StudentRegisteredCourses(int studentId, int firstCourseId) {
		this.studentId = studentId;
		this.firstCourseId = firstCourseId;
	}
	
	public StudentRegisteredCourses(int studentId, int firstCourseId,  int secondCourseId) {
		this.studentId = studentId;
		this.firstCourseId = firstCourseId;
		this.secondCourseId = secondCourseId;
	}
	
	public StudentRegisteredCourses(int studentId, int firstCourseId,  int secondCourseId,  int thirdCourseId) {
		this.studentId = studentId;
		this.firstCourseId = firstCourseId;
		this.secondCourseId = secondCourseId;
		this.thirdCourseId = thirdCourseId;
	}
	
	public StudentRegisteredCourses(int studentId, int firstCourseId, int secondCourseId, int thirdCourseId, int fourthCourseId ) {
		this.studentId = studentId;
		this.firstCourseId = firstCourseId;
		this.secondCourseId = secondCourseId;
		this.thirdCourseId = thirdCourseId;
		this.fourthCourseId = fourthCourseId;
	}
	

	public StudentRegisteredCourses() {
		// TODO Auto-generated constructor stub
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getFirstCourseId() {
		return firstCourseId;
	}

	public void setFirstCourseId(int firstCourseId) {
		this.firstCourseId = firstCourseId;
	}

	public int getSecondCourseId() {
		return secondCourseId;
	}

	public void setSecondCourseId(int secondCourseId) {
		this.secondCourseId = secondCourseId;
	}

	public int getThirdCourseId() {
		return thirdCourseId;
	}

	public void setThirdCourseId(int thirdCourseId) {
		this.thirdCourseId = thirdCourseId;
	}

	public int getFourthCourseId() {
		return fourthCourseId;
	}

	public void setFourthCourseId(int fourthCourseId) {
		this.fourthCourseId = fourthCourseId;
	}

	@Override
	public String toString() {
		return "StudentRegisteredCourses [studentId=" + this.getStudentId() + ", firstCourseId=" + firstCourseId
				+ ", secondCourseId=" + secondCourseId + ", thirdCourseId=" + thirdCourseId + ", fourthCourseId="
				+ fourthCourseId + "]";
	}
//	
//	public int getAllCourses() {
//		
//	}
	}

