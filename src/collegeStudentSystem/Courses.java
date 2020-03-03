package collegeStudentSystem;

import java.io.Serializable;

public class Courses implements Serializable{

	private int courseId, studentId;
	private String courseName, courseCategory;
	private static final int MAX_COURSE_CAPACITY = 40;
	
	public Courses(String courseName, String courseCatergory, int courseId, int studentId) {
		this.courseName = courseName;
		this.courseCategory = courseCatergory; 
		this.courseId = courseId;
		this.studentId = studentId;
		
	}

	public Courses() {
		// TODO Auto-generated constructor stub
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", courseCategory=" + courseCategory
				+ "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public static int getMaxCourseCapacity() {
		return MAX_COURSE_CAPACITY;
	}
	
	
	
	
}
