package collegeStudentSystem;

import java.util.LinkedList;

public class StudentCourseList implements UniversalInterface {

	LinkedList<Courses> studentCourseList = new LinkedList<Courses>();
	private int counter = 0;
//	StudentArrayList studentList = new StudentArrayList();
	
	
	public void add(Courses courses) {
		studentCourseList.add(courses);
		counter++;
	}

	public void delete(int courseId) {
		for(int i =0;i<studentCourseList.size();i++) {
			if(studentCourseList.get(i).getCourseId() == courseId) {
				studentCourseList.remove(i);
				counter--;
			}
		}
		
	}

	public void print() {
		for(int i=0; i<studentCourseList.size();i++) {
			System.out.println(studentCourseList.get(i).toString());
		}
		
	}

	public Courses search(int courseId) {
		for(int i=0;i<studentCourseList.size();i++) {
			if(studentCourseList.get(i).getCourseId() == courseId) {
				return studentCourseList.get(i);
				
			}
		}
		return null;
	}
	
	public int searchForCourseId(int courseId) {
		for(int i=0;i<studentCourseList.size();i++) {
			if(studentCourseList.get(i).getCourseId() == courseId) {
			return studentCourseList.get(i).getCourseId();
		}
	}
		return 0;

}

	public int size() {
		return counter;
	}
	
	public boolean isCourseNotFull() {
		if(Courses.getMaxCourseCapacity() >= counter) {
			System.err.println(Courses.getMaxCourseCapacity() + " " + counter);
			return true;
		}else {
			return false;
		}
	}
}
