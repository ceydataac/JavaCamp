package day3Odev2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,"Melis","Derin","mail","111","java");
		Student student2 = new Student(2,"Dilara","Türk","mail","222","java");
		
		Instructor instructor = new Instructor(3,"Engin", "Demiroğ", "MCT,PMP", "mail", "0101", "java");


		UserManager userManager = new UserManager();
		
		User[] users ={student, student2, instructor};
		
		userManager.addMultiple(users);
	}

}
