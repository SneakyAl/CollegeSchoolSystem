package collegeStudentSystem;


public class UndergradStudent extends Student {

	private String startDate, endDate;
	private double GPA;
	private static final double MIN_GPA = 2.5;
	
	public UndergradStudent() {
		super();
	}
	public UndergradStudent(String firstName, String lastName, int studentId, String startDate, String endDate) {
		super(firstName, lastName, studentId);
		this.startDate = startDate;
		this.endDate = endDate;
	}
	







//	public String getMajor() {
//		return major;
//	}
//
//	public void setMajor(String major) {
//		this.major = major;
//	}

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
	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {  // todo
		GPA = gPA;
	}
	
	public double calGPA() { // todo
		return GPA;
	}
	
	public boolean isInGoodStanding() { // todo, might add parameter, Check to see of gpa is above threahold and id fees are paid.
		return false;
		
	}

	public double checkGPA() {
		return GPA; // todo: might add parameter. check to see the total GPA 
		
	}
	
	public String toString() {
		return "Under-Graduate students " + 
	" " + getFirstName() +" " +getLastName() + " " + getStudentId() + " " + getStartDate()+ " " + getEndDate();
		
	}
}