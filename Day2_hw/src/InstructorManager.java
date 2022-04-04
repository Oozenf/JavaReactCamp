

public class InstructorManager {
	
	
	
	public void addCourse(Instructor instructor, Course course) {
		
		instructor.setCourse(course);
	}
	
	public void showCourse(Instructor instructor) {
		System.out.println("\nCourse of "  + instructor.getFirstName() + " " + instructor.getLastName() +"(Instructor) ");
		System.out.println("-------------------");		
		System.out.println(	instructor.getCourse().getCourseName());
	}

}
