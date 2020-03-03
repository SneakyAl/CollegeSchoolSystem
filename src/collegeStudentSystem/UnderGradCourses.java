package collegeStudentSystem;

public class UnderGradCourses extends Courses {
	private int courseCredit;
	boolean courseReq;
//	private int studentId;
	
	public int getCourseCredit() {
		return courseCredit;
	}

	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}

	public boolean isCourseReq() {
		return courseReq;
	}

	public void setCourseReq(boolean courseReq) {
		this.courseReq = courseReq;
	}

	public UnderGradCourses(String courseName, String courseCatergory, int courseId, int courseCredit) {
		super(courseName, courseCatergory, courseId, courseCredit);
		this.courseCredit = courseCredit;
	}
	
	

}
