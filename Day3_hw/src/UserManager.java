
public abstract class UserManager {
	
	public abstract void takeCourse(User user, String courseName);
	
	public  void addUser(User user) {
		System.out.println(user.getFullName() + " was added successfully" );
	}
	
	public  void deleteUser(User user) {
		System.out.println(user.getFullName() + " was deleted successfully");
	}
	
	

}
