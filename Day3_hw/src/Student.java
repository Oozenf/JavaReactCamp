
public class Student extends User{
	
	private int userId;
	private String studentNumber;
	
	
	public Student() {
		
	}

	public Student(int id, String fullName, String password, String email, int userId, String studentNumber) {
		super(id, fullName, password, email);
		this.userId = userId;
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}


	

	

}
