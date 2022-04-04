

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		// Objects and arrays of Student were created
		Student student1 = new Student(1,"Cagatay", "cy");
		Student student2 = new Student(2,"Mehmet", "mt");
		Student student3 = new Student(3,"Can", "cn");
		Student[] listOfStudent1= {student1, student3 };
		Student[] listOfStudent2 = {student1, student2};
	
		// Instructor objects were created.
		Instructor instructor1 = new Instructor("904812904", "Sabahattim", "Ali");
		Instructor instructor2 = new Instructor("418921733", "Yasar", "Kemal");
	
		// Objects and array of Course were created
		Course course1 = new Course("101","Java-ReactJs");
		Course course2 = new Course("102", "C#-AngularJs");
		Course courses[] = {course1, course2};
		
		
		CourseManager cm = new CourseManager();
		//Students and instructor were added to the course1.
		cm.addInstructor(course1, instructor1);
		cm.addStudent(course1, listOfStudent1);
		//Students and instructor were added to the course2.
		cm.addInstructor(course2, instructor2);
		cm.addStudent(course2, listOfStudent2);
		
		InstructorManager im = new InstructorManager();
		// Instructors were assigned courses.
		im.addCourse(instructor1,course1);
		im.addCourse(instructor2,course2);
		
		// Students were assigned courses.
		StudentManager sm = new StudentManager();
		sm.addCourse(student2, course1);
		sm.addCourse(student1,courses);
		sm.addCourse(student3,courses);
		
		// Listing
		cm.showStudent(course1);
		sm.showCourse(student1);		
		im.showCourse(instructor2);
		
	}

}
