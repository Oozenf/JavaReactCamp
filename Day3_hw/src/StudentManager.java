
public class StudentManager extends UserManager {
	
	// The different operations were override. 
	@Override
	public void takeCourse(User user, String courseName) {
		
		System.out.println(user.getFullName() + "(Student) attended the " + courseName + " course ");
	}



}
