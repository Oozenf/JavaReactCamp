

public class StudentManager {
	

	
	public void addCourse(Student student, Course[] course) {
		
		student.setCourses(course);
	}
	
	public void addCourse(Student student, Course course) {
		
		student.setCourse(course);
	}

}
