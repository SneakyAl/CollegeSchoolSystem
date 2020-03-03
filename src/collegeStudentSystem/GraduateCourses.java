package collegeStudentSystem;

public class GraduateCourses extends Courses{



	private int courseCredit;
	private boolean courseReq;
	private int studentId;
	
	StudentArrayList listOfStudent = new StudentArrayList();
	
	
	public GraduateCourses(String courseName, String courseCatergory, int courseId, int courseCredit, int studentId) {
		super(courseName, courseCatergory, courseId, courseCredit);
		this.courseCredit = courseCredit;
	}

	public int getCourseCredit() {
		return courseCredit;
	}

	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}

	@Override
	public String toString() {
		return "GraduateCourses [courseCredit=" + courseCredit + ", courseReq=" + courseReq + ", listOfStudent="
				+ listOfStudent + "]";
	}

	public boolean isCourseReq() {
		return courseReq;
	}

	public void setCourseReq(boolean courseReq) {
		this.courseReq = courseReq;
	}
	
	public int getStudentId(int studentId) {
		if(listOfStudent.search(studentId) == studentId) {
			return studentId;
		}
		return 0 ;
	}
	

}
