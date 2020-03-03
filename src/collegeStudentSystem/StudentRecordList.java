package collegeStudentSystem;

import java.util.LinkedList;

public class StudentRecordList implements UniversalInterface {

	LinkedList<StudentRecord> recordList = new LinkedList<StudentRecord>();
	private int counter = 0;

	public void add(StudentRecord studentRecord) {
		recordList.add(studentRecord);
		counter++;

	}

	@Override
	public void delete(int studentId) {
		for (int i = 0; i <= recordList.size(); i++) {
			if (recordList.get(i).getStudentId() == studentId) {
				recordList.remove(i);
				counter--;
			}
		}

	}

	public StudentRecord searchForStudentRecord(int studentId) {
		for (int i = 0; i <= recordList.size(); i++) {
			if (recordList.get(i).getStudentId() == studentId) {
				return recordList.get(i);
			}
		}
		return null;
	}

	@Override
	public void print() {
		for (int i = 0; i < recordList.size(); i++) {
			System.out.println(recordList.get(i).toString());
		}

	}

	public int courseSearch(int studentId, int courseId) {
		for (int i = 0; i <= recordList.size(); i++) {
			if (recordList.get(i).getCourseId() == courseId) {
				return recordList.get(i).getCourseId();
			}
		}
		return 0;
	}

	public int size() {
		
		return counter;
	}
	
	public int getCourseId(int studentId) {
		for (int i = 0; i <= recordList.size(); i++) {
			if(recordList.get(i).getStudentId() == studentId) {
				return recordList.get(i).getCourseId();
			}
		}
		return 0;
	}
	
	public boolean isTheStudentExit(int studentId) {
		for(int i=0; i<recordList.size();i++) {
			if(recordList.get(i).getStudentId() == studentId) {
				return true;
			}
		}
		return false;
	}
	
	public String getCoursesForAStudent(int studentId) {
		System.err.println(recordList.size());
		for(int i=0;i<recordList.size();i++) {
			System.err.println(recordList.get(i).getStudentId());
			if(recordList.get(i).getStudentId() == studentId) {
				System.err.println(recordList.get(i).toString());
				return recordList.get(i).toString();
			}
		}
		return null;
	}

}
