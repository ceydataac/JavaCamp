package day3Odev2;

public class InstructorManager extends UserManager {

	public void addDetail(Instructor instructor) {
		System.out.println(instructor.instructorDetail + " sahiptir.");
	}
	
	public void addContent(User user) {
		System.out.println(user.kurslar + " içerik eklendi.");
	}
}
