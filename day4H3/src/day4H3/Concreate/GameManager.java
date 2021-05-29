package day4H3.Concreate;

import day4H3.Abstract.IGameService;
import day4H3.Entities.Game;

public class GameManager implements IGameService {
	

	public void addGame(Game game) {
		
		System.out.println("Game added : " + game.getGameName());
	}
	
	public void updateGame(Game game) {
		
		System.out.println("Game updated : " + game.getGameName());
	}
	
	public void deleteGame(Game game) {
		
		System.out.println("Game deleted : " + game.getGameName());
	}

	

}
