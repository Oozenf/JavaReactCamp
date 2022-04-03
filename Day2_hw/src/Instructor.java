

public class Instructor {
	
	private String identityNumber;
	private String firstName;
	private String lastName;
	private Course course;
	
	
	public Instructor(String identityNumber, String firstName, String lastName) {
		this.identityNumber = identityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getIdentityNumber() {
		return identityNumber;
	}


	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
