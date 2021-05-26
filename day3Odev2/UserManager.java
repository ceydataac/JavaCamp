package day3Odev2;

public class UserManager {

	public void add(User user) {
		System.out.println(user.userNumber + " " + user.firstName + " " + user.lastName + " kaydedildi.");
	}
	public void delete(User user) {
		System.out.println(user.userNumber + " silindi.");
	}
	public void update(User user) {
		System.out.println(user.userNumber + " güncellendi.");
	}
	
	public void addMultiple(User[] users) {
		
		for(User user : users) {
			add(user);
		}
	}
	
   public void getUser(User[] users) {
		
		for(User user : users) {
			System.out.println(user.userNumber + user.getFirstName());
		}
	}
}
