
public class Test {

	public static void main(String[] args) {

		// Student and Instructor's objects were created.
		Student student = new Student();
		student.setId(1);
		student.setFullName("Ahmet");
		student.setStudentNumber("100");
		
		Instructor inst = new Instructor();
		inst.setId(2);
		inst.setFullName("Mehmet");
		inst.setSalary(10000);
		
		
		// The same operations are in the UserManager. -> addUser(), deleteUser()
		// The different operations were override. -> takeCourse()
		
		StudentManager sm = new StudentManager();
		sm.addUser(student);
		sm.takeCourse(student, "Java");
		sm.deleteUser(student);
		System.out.println("-------------");
		
		InstructorManager im = new InstructorManager ();
		im.addUser(inst);
		im.takeCourse(inst, "Java");
		im.deleteUser(inst);
		
		
		
		
		
		
		
	}
	

}
