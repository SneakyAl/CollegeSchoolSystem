package collegeStudentSystem;

import java.util.LinkedList;

public class StudentArrayList implements UniversalInterface {

	LinkedList<Student> studentList = new LinkedList<Student>();
	private int counter = 0;

	public void add(Student student) {
		studentList.add(student);
		counter ++;

	}

	@Override
	public void delete(int studentId) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getStudentId() == studentId) {
				studentList.remove(i);
				counter--;
			}
		}

	}

	@Override
	public void print() {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).toString());
		}

	}

	public int search(int studentId) {
	
		for(int i=0; i<studentList.size();i++) {
			if(studentList.get(i).getStudentId() == studentId) {
				return studentList.get(i).getStudentId();
			}
		}
		return 0;
	}

	public int size() {
		return counter;
	}

//	public int get(int studentId) {
//		for(int i=0; i<studentList.size();i++) {
//			if(studentList.get(i).getStudentId() == studentId) {
//				return 
//			}
//		}
//	}

}
	