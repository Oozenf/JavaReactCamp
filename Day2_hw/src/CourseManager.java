

public class CourseManager {
	
	
	public void addStudent(Course course, Student[] student) {	
		course.setStudent(student);
	}
	
	public void addInstructor(Course course, Instructor inst) {
		course.setInstructor(inst);
	}
	
	public void showStudent(Course course) {
		System.out.println("Student list of " + course.getCourseName());
		System.out.println("-------------------");
		for (int i = 0; i < course.getStudent().length; i++) {
			
			System.out.println(course.getStudent()[i].getFullName());
		}
		
	}
	
	 

}
