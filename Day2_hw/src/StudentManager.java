

public class StudentManager {
	

	
	public void addCourse(Student student, Course[] course) {
		
		student.setCourses(course);
	}
	
	public void addCourse(Student student, Course course) {
		
		student.setCourse(course);
	}
	
	public void showCourse(Student student) {
		
		System.out.println("\nCourses of " + student.getFullName() + " " + " (Student)");
		System.out.println("-------------------");		
	
		if(student.getCourses()!=null) {
			for (int i = 0; i < student.getCourses().length; i++) {
				
				System.out.println(student.getCourses()[i].getCourseName());
			}
		}
		else {
			System.out.println(student.getCourse().getCourseName());

		}
		
	}

}
