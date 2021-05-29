package day4H3.Abstract;

import day4H3.Entities.Gamer;

public interface IGamerService {

	void register(Gamer gamer);
	
	void update(Gamer gamer);
	
	void delete(Gamer gamer);
}
