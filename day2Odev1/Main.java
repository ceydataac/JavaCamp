package day2Odev1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course("Yaz�l�m Geli�tirici Yeti�tirme Kamp� 1"
				,"Engin Demiro�", "-", "G�n sonu kay�t,\n MiniQuiz,\n �dev1,\n �dev2,\n De�erlendirme");
		
		Course course2  = new Course("Yaz�l�m Geli�tirici Yeti�tirme Kamp� 2"
				,"Engin Demiro�", "-", "G�n sonu kay�t,\n �dev1,\n �dev2,\n De�erlendirme");
		
		Course course3  = new Course("Programlamaya Giri� ��in Temel Kurs"
				,"Engin Demiro�", 
				"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.",
				"Temel Kurulumlar,\n"
				+ "Programlama Mant���n� Anlamak\n"
				+ "De�i�kenler ve Veri Tiplerini Anlamak\n"
				+ "Temel De�i�ken Yap�s�n� Anlamak\n"
				+ "Temel Kurallar� ��renelim");
		
		Course[] courses = {course1,course2,course3};
		
		System.out.println("Courses:");
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "(C# + ANGULAR)";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "(JAVA + REACT)";
		
		Category category3 = new Category();
		category3.id = 3;
		category3.name = "Temel";
		
		CourseManager courseManager = new CourseManager();
		courseManager.register(course1);
		courseManager.register(course2);
		courseManager.register(course3);

		
		
		
		}

	}


