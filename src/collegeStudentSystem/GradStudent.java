package collegeStudentSystem;

public class GradStudent extends Student {

	private String startDate, endDate;
	
	public GradStudent() {
		super();
	}
	public GradStudent(String firstName, String lastName, int studentId, String startDate, String endDate) {
		super(firstName, lastName, studentId);
		this.startDate = startDate;
		this.endDate = endDate;
		}
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String toString () {
		return "Graduate Student " + getFirstName() + getLastName() ;
		
	}

}
