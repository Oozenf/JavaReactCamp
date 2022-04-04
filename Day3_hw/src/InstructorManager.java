
public class InstructorManager extends UserManager {
	
	
	// The different operations were override. 
	@Override
	public void takeCourse(User user, String courseName) {
		
		System.out.println(user.getFullName() + " (Instructor) assigned to teach " + courseName + " course");
	}



}
