
public class Instructor extends User {
	
	private int userId;
	private int salary;

	public Instructor() {
		
	
	}
	
	public Instructor(int id, String fullName, String password, String email,int userId, int salary) {
		super(id, fullName, password, email);
		this.userId = userId;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
