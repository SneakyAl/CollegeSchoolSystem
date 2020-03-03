package collegeStudentSystem;

import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Testing {

	Scanner scan = new Scanner(System.in);
	private String firstName, lastName, startDate, endDate, endProgram, courseName, courseCategory;
	private int studentId, courseId, courseCredit, courseCount, courseId2, courseId3, courseId4, findCourse, findStudentRecord;

	StudentArrayList studentList = new StudentArrayList();
	StudentCourseList courseList = new StudentCourseList();
//	StudentCourseList studentCourseList = new StudentCourseList();
	CoursesStudentList studentCourseList = new CoursesStudentList();
	StudentRecordList studentRecordlist = new StudentRecordList();

	public void addStudent() {

		while (true) {
			System.out.println("please enter the student's first Name: ");
			firstName = scan.next();
			System.out.println("please enter the student's last Name: ");
			lastName = scan.next();
			System.out.println("please enter the student's start date: ");
			startDate = scan.next();
			System.out.println("please enter the student's end date: ");
			endDate = scan.next();
			System.out.println("please enter the student's ID: ");
			studentId = scan.nextInt();
			UndergradStudent student = new UndergradStudent(firstName, lastName, studentId, startDate, endDate);
			studentList.add(student);
			System.out.println("enter Q to quit or press any keys to continue");
			endProgram = scan.next();

			if (endProgram.equalsIgnoreCase("Q")) {
				System.out.println("this function has ended");
				break;
			}
		}

	}

	public void printStudent() {
		studentList.print();
	}

	public void addCourse() {

		while (true) {
			System.out.println("please enter the course's name: ");
			courseName = scan.next();
			System.out.println("please enter the course's catergory: ");
			courseCategory = scan.next();
			System.out.println("please enter the course's ID: ");
			courseId = scan.nextInt();
			System.out.println("please enter the course's credit: ");
			courseCredit = scan.nextInt();
			UnderGradCourses courses = new UnderGradCourses(courseName, courseCategory, courseId, courseCredit);
			courseList.add(courses);
			System.out.println("enter Q to quit or press any keys to continue");
			endProgram = scan.next();

			if (endProgram.equalsIgnoreCase("Q")) {
				System.out.println("this function has ended");
				break;
			}
		}
	}

	public void printCourse() {
		courseList.print();
	}

	public void courseRegister() {
		if(courseList.isCourseNotFull()) {
		for (int i = 0; i < studentList.size() && i < courseList.size(); i++) {
			if (studentList.search(studentId) == studentId && courseList.searchForCourseId(courseId) == courseId) {
				
				System.out.println("how many courses will be registered for this student? Type Q to quit");
				courseCount = scan.nextInt();
				if (courseCount > 0 && courseCount <= 4) {
					switch (courseCount) {
					case 1:
						System.out.println("Please enter the studentId:  ");
						studentId = scan.nextInt();
						System.out.println("Please enter the course's Id ");
						courseId = scan.nextInt();
						StudentRegisteredCourses studentCourse1 = new StudentRegisteredCourses(studentId, courseId);
						studentCourseList.add(studentCourse1);
						break;
					case 2:
						System.out.println("Please enter the studentId:  ");
						studentId = scan.nextInt();
						System.out.println("Please enter the 2 course's Id ");
						courseId = scan.nextInt();
						courseId2 = scan.nextInt();
						StudentRegisteredCourses studentCourse2 = new StudentRegisteredCourses(studentId, courseId,
								courseId2);
						studentCourseList.add(studentCourse2);
						break;
					case 3:
						System.out.println("Please enter the studentId:  ");
						studentId = scan.nextInt();
						System.out.println("Please enter the 3 course's Id ");
						courseId = scan.nextInt();
						courseId2 = scan.nextInt();
						courseId3 = scan.nextInt();
						StudentRegisteredCourses studentCourse3 = new StudentRegisteredCourses(studentId, courseId,
								courseId2, courseId3);
						studentCourseList.add(studentCourse3);
						break;
					case 4:
						System.out.println("Please enter the studentId:  ");
						studentId = scan.nextInt();
						System.out.println("Please enter the 4 course's Id ");
						courseId = scan.nextInt();
						courseId2 = scan.nextInt();
						courseId3 = scan.nextInt();
						courseId4 = scan.nextInt();
						StudentRegisteredCourses studentCourse4 = new StudentRegisteredCourses(studentId, courseId,
								courseId2, courseId3, courseId4);
						studentCourseList.add(studentCourse4);
						break;
					default:
						break;
					}
				}
			}
				System.err.println("course is full at max rate of 40 students");
		}
			System.err.println("error: student or the course or both do not exit");
		}
	}

	public void printStudentCourses() {
		System.out.println("please enter a student's id to find the courses ");
		findCourse = scan.nextInt();
		for (int i = 0; i < studentCourseList.size(); i++) {
			if (studentList.search(findCourse) == findCourse) {
				studentCourseList.printASpecificStudent(findCourse);
				System.out.println(studentCourseList.size());
			} else
				System.err.println("ERROR: STUDENT ID NOT FOUND, PLEASE CHECK AGAIN.");
		}

	}
	public void recordStudentGrade() {

		System.out.println("Please enter a student id to start upgrading class grade: ");
		int studentId = scan.nextInt();
			if(studentCourseList.isTheStudentExit(studentId) ) { 
				for(int i=0;i<=studentCourseList.size();i++) {
					System.out.println("please enter the course id to enter the grade for that course: ");
					System.err.println(studentCourseList.size());
					int courseId = scan.nextInt();
					if(studentCourseList.getTotalCourseNumber(courseId)) {
					System.out.println("Please enter the grade for this class ");
					char grade = scan.next().charAt(0);
					
					
					StudentRecord studentRecord = new StudentRecord(studentId, courseId, grade);
					studentRecordlist.add(studentRecord);
					}
				}
			}
		}
	
	
	public void printStudentRecord () {
		for(int i=0; i<studentRecordlist.size();i++) {
//			System.err.println(studentCourseList.size());
			studentRecordlist.print();
		}
	}
	
//	public void writeTofile() {
//		FileOutputStream output = null;
//		File file;
//		
//		try {
//			file = new File("D:/WriteToFileTest")
//		}
//		catch{
//			
//		}
//		
//		
//	}

}
