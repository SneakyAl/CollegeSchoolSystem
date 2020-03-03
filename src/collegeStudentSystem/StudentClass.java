package collegeStudentSystem;

public class StudentClass extends Student{

	private String className;
	private int classCredit, classId;
	
	public StudentClass (String firstName, String lastName, int studentId, String className, int classCredit, int classId) {
		super(firstName, lastName, studentId);
		this.className = className;
		this.classCredit = classCredit;
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getClassCredit() {
		return classCredit;
	}

	public void setClassCredit(int classCredit) {
		this.classCredit = classCredit;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	
}
