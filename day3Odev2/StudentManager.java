package day3Odev2;

public class StudentManager extends UserManager {

	public void register(User user) {
		System.out.println(user.kurslar + " kayýt olundu.");
	}
	
	public void cancel(User user) {
		System.out.println(user.kurslar + " kayýt silindi.");
	}
	
}
