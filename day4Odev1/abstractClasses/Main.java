package abstractClasses;

public class Main {

	public static void main(String[] args) {
		KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
		kidsGameCalculator.hesapla();
		kidsGameCalculator.gameOver();
		
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		/*
		//abstract classlar newlenemez.
		GameCalculator gameCalculator = new GameCalculator() {
			
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
				
			}
		};*/
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.hesapla();
	}
}
