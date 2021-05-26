package day3Odev2;

public class Instructor extends User{

	String instructorDetail;

	public Instructor(int userNumber, String firstName, String lastName,String instructorDetail, String email,String password, String kurslar) {
	
		super(userNumber,firstName,lastName,email,password,kurslar);
	}
}
