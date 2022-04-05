

public class Student {
	
	private int id;
	private String fullName;
	private String nickName;
	private Course[] courses;
	private Course course;
	
	public Student(int id, String fullName, String nickName) {
		this.id = id;
		this.fullName = fullName;
		this.nickName = nickName;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
		
	}
	
	

}
