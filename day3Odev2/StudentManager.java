package day3Odev2;

public class StudentManager extends UserManager {

	public void register(User user) {
		System.out.println(user.kurslar + " kayıt olundu.");
	}
	
	public void cancel(User user) {
		System.out.println(user.kurslar + " kayıt silindi.");
	}
	
	public void addHomework(Student student) {
		System.out.println(student.studentNumber + " ödevi yükledi.");
	}
}
