

public class CourseManager {
	
	
	public void addStudent(Course course, Student[] student) {	
		course.setStudent(student);
	}
	
	public void addInstructor(Course course, Instructor inst) {
		course.setInstructor(inst);
	}

}
