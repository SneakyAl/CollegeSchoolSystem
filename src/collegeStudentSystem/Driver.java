 package collegeStudentSystem;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Driver {

	public static void main(String[] args) {
		UndergradStudent student1 = new UndergradStudent("Bao"," Hoang",1,"2/6/2020","01/06/2024");
		UndergradStudent student2 = new UndergradStudent("Bao"," Hoang1",2,"2/6/2020","01/06/2024");
		UndergradStudent student3 = new UndergradStudent("Bao"," Hoang2",3,"2/6/2020","01/06/2024");
		UndergradStudent student4 = new UndergradStudent("Bao"," Hoang3",4,"2/6/2020","01/06/2024");
		UndergradStudent student5 = new UndergradStudent("Bao"," Hoang4",5,"2/6/2020","01/06/2024");
//		
//		GradStudent gStudent1 = new GradStudent("Bao","HoangG",1,"2/6/2020","01/06/2024");
//		GradStudent gStudent2 = new GradStudent("Bao","HoangG2",2,"2/6/2020","01/06/2024");
//		GradStudent gStudent3 = new GradStudent("Bao","HoangG3",3,"2/6/2020","01/06/2024");
//		GradStudent gStudent4 = new GradStudent("Bao","HoangG4",4,"2/6/2020","01/06/2024");
//		GradStudent gStudent5 = new GradStudent("Bao","HoangG5",5,"2/6/2020","01/06/2024");
//		
		
		
		StudentArrayList studentList = new StudentArrayList();
//		StudentArrayList list2 = new StudentArrayList();
		
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
//		
//		list2.add(gStudent1);
//		list2.add(gStudent2);
//		list2.add(gStudent3);
//		list2.add(gStudent4);
//		list2.add(gStudent5);
//		
		
	
		
		studentList.print();
		studentList.delete(1);
		studentList.delete(5);
//		System.out.println(list1.search(5));
//		System.out.println();
		studentList.print();
//		System.out.println();
//		System.out.println("graduate students:       ");
//		System.out.println();
//		list2.print();
//		list2.delete(2);
//		System.out.println("after detele");
//		list2.print();
//		System.out.println(list2.search(5));
		System.out.println("////////////////////////////////////////////////////");
		
		StudentCourseList courseList = new StudentCourseList();
//		StudentCourseList courseList2 = new StudentCourseList();
		
		UnderGradCourses gCourse1 = new UnderGradCourses("math1","mathematics", 1, 4);
		UnderGradCourses gCourse2 = new UnderGradCourses("math2","mathematics", 2, 4);
		UnderGradCourses gCourse3 = new UnderGradCourses("math3","mathematics", 3, 4);
		UnderGradCourses gCourse4 = new UnderGradCourses("math4","mathematics", 4, 4);
		UnderGradCourses gCourse5 = new UnderGradCourses("math5","mathematics", 5, 4);
		
		courseList.add(gCourse1);
		courseList.add(gCourse2);
		courseList.add(gCourse3);
		courseList.add(gCourse4);
		courseList.add(gCourse5);
		System.out.println("//////////////////////////TESTING COURSES////////////////////////////");
		courseList.print();
		System.out.println("searching for a course");
		System.out.println(courseList.search(2));
		System.out.println("//////////////////////////TESTING ADDING COURSE TO STUDENT////////////////////////////");
		System.out.println("////////////////////////////////////////////////////////////TESTING ADDING COURSE TO STUDENT///////////////////////////////////////////////////////////////////////////////////////////");
//		
		CoursesStudentList studentCourseRegisterList = new CoursesStudentList();
//		StudentRegisteredCourses test1 = new StudentRegisteredCourses();
		System.out.println(studentList.search(2));
		StudentRegisteredCourses studentCourse1 = new StudentRegisteredCourses(studentList.search(2),courseList.searchForCourseId(2)); // need better method name here.
		StudentRegisteredCourses studentCourse2 = new StudentRegisteredCourses(studentList.search(1),courseList.searchForCourseId(3));
		StudentRegisteredCourses studentCourse3 = new StudentRegisteredCourses(studentList.search(3),courseList.searchForCourseId(1));
		StudentRegisteredCourses studentCourse4 = new StudentRegisteredCourses(studentList.search(1),courseList.searchForCourseId(4),courseList.searchForCourseId(2));
		
		if(studentList.search(2) == 2 && courseList.search(2) != null ) {
			studentCourseRegisterList.add(studentCourse1);
			studentCourseRegisterList.add(studentCourse2);
			studentCourseRegisterList.add(studentCourse3);
			studentCourseRegisterList.add(studentCourse4);
//			studentRegisterList.add(studentCourse1);
		}
		
		studentCourseRegisterList.print();
		
		
		
		
//		StringTokenizer st = new StringTokenizer("this is a test");
		
		
		
//		studentRegisterList.print();
//		StudentRecordList studentRecordlist = new StudentRecordList();
//		ArrayList<Integer> courseList = new ArrayList<Integer>();
//		System.out.println(studentRecordlist.size());
//		for(int i=0; i<studentRegisterList.size(); i++) {
//			if(studentRecordlist.isTheStudentExit(1)) {
//				System.err.println("WE ARE INSIDE THE THING WE WANT");
//				System.err.println(studentRecordlist.getCoursesForAStudent(1));
//			StringTokenizer st = new StringTokenizer(studentRecordlist.getCoursesForAStudent(1));
//			while(st.hasMoreTokens()) {
//				System.err.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
//				System.err.println(st.nextToken());
//			}
			
			
			//for each studentRecordList entry, I will tokenize it and store what i want into a new array.
//			
//		}
//		}
			
			
		// the studentId and CourseId will be provided by the user
//		int studentId = 1, courseId = 1;
//	
//		for(int i=0;i<list1.size() && i<studentRegisterList.size();i++) {
//			System.err.println(list1.search(studentId));
//			System.err.println(studentRegisterList.isTheStudentExit(courseId));
//			if(list1.search(studentId) == studentId && studentRegisterList.isTheStudentExit(courseId)) { // checking if the student exit in the studentlist and the studentcourselist.
//				if(studentRegisterList.getTotalCourseNumber(2)) {
//					StudentRecord studentRecord = new StudentRecord(studentId, courseId, 'A');
//					studentRecordlist.add(studentRecord);
//					studentId ++;
//					courseId++;
//					studentRecordlist.print();
//				}
//			}
//		}
		
		
		
	
		
		
		
		

		
	
//		Testing test = new Testing();
//		test.addStudent();
//		test.printStudent();
//		test.addCourse();
//		test.printCourse();
//		System.out.println("//////////////////////////////////////////////////testing adding courses/////////////////////////////////////////////////////////////////");
//		test.courseRegister();
//		test.printStudentCourses();
//		test.recordStudentGrade();
//		test.printStudentRecord();
		
		
		
	}
	}
	


