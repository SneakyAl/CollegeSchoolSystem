package collegeStudentSystem;

import java.util.LinkedList;

public class CoursesStudentList implements UniversalInterface {

	LinkedList<StudentRegisteredCourses> testList = new LinkedList<StudentRegisteredCourses>();
	
	private int counter = 0;
	
	
	public void add(StudentRegisteredCourses test) {
//		if(courses.readyToAddCourses(studentId, courseId)) {
//			testList.add(courses);
//		}
		
		testList.add(test);
		counter++;
	}

	@Override
	public void delete(int studentId) {
		for(int i=0;i<testList.size();i++) {
			if(testList.get(i).getStudentId() == studentId) {
				testList.remove(i);
				counter--;
			}
		}
	}

	public StudentRegisteredCourses search(int studentId) {
		for(int i = 0; i< testList.size(); i++) {
			if(testList.get(i).getStudentId() == studentId) {
				return testList.get(i);
			}
		}
		return null;
	}

	@Override
	public void print() {
		for(int i = 0; i<testList.size(); i++) {
			System.out.println(testList.get(i).toString());
		}
	}
	
	public void printASpecificStudent(int studentId) {
		for(int i = 0; i< testList.size(); i++) {
			if(testList.get(i).getStudentId() == studentId) {
				System.out.println(testList.get(i).toString());
			}
		}
	}

	public int size() {
		return counter;
	}
	
	public boolean isTheStudentExit(int studentId) {
		for(int i=0; i<testList.size();i++) {
			if(testList.get(i).getStudentId() == studentId) {
				return true;
			}
		}
		return false;
	}

	public boolean getTotalCourseNumber(int courseId) { 
		for(int i=0;i<testList.size();i++) {
		switch(courseId) {
		case 1: 
			if(testList.get(i).getFirstCourseId() == courseId) {
				return true;}
		case 2: 
			if(testList.get(i).getSecondCourseId() == courseId) {
				return true;}
		case 3: 
			if(testList.get(i).getThirdCourseId() == courseId ) {
				return true;}
		case 4: 
			if(testList.get(i).getFourthCourseId() == courseId ) {
				return true;}
		default:
			break;
			}
		}
		return false;
	}
	
}


	
	
//	public int getTotalCourseNumber(int studentId) {
//		int counter = 0;
//		for(int i =0;i<=testList.size();i++) {
//			
//		}
//	}
//	
//	public boolean isTheCourseExit(int courseId) {
//		for(int i = 0; i< testList.size(); i++) {
//			if(testList.get(i).get == studentId) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	

