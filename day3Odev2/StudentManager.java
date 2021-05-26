package day3Odev2;

public class StudentManager extends UserManager {

	public void register(User user) {
		System.out.println(user.kurslar + " kay�t olundu.");
	}
	
	public void cancel(User user) {
		System.out.println(user.kurslar + " kay�t silindi.");
	}
	
	public void addHomework(Student student) {
		System.out.println(student.studentNumber + " �devi y�kledi.");
	}
}
