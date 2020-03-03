package collegeStudentSystem;

public class StudentRecord  {

	private int studentId, courseId;
	private char letterGrade;
	private double studentGradePoint;
	
	public StudentRecord(int studentId, int courseId, char letterGrade) {
		this.studentId = studentId;
		this.courseId = courseId;
		this.letterGrade = letterGrade;
		this.studentGradePoint = 0.0;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public char getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(char letterGrade) {
		this.letterGrade = letterGrade;
	}

	public double getStudentGradePoint() {
		return studentGradePoint;
	}

	public void setStudentGradePoint(double studentGradePoint) {
		this.studentGradePoint = studentGradePoint;
	}

	@Override
	public String toString() {
		return "StudentRecord [studentId=" + studentId + ", courseId=" + courseId + ", letterGrade=" + letterGrade
				+ ", studentGradePoint=" + studentGradePoint + "]";
	}
	
	
}
