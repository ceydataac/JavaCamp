package day4H3.Abstract;

import day4H3.Entities.Game;

public interface IGameService {

	void addGame(Game game);
	
	void updateGame(Game game);
	
	void deleteGame(Game game);
}
