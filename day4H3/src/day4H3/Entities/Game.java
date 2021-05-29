package day4H3.Entities;

import day4H3.Abstract.IEntity;

public class Game implements IEntity {

	int gameId;
	String gameName;
	String debutDate;
	String type;
	int version;
	int price;
	
	public Game(int gameId,String gameName, String debutDate, String type, int version, int price) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.debutDate = debutDate;
		this.type = type;
		this.version = version;
		this.price = price;
	}
	
	public int getGameId() {
		return gameId;
	}

	public String getGameName() {
		return gameName;
	}
	public String getDebutDate() {
		return debutDate;
	}
	public String getType() {
		return type;
	}
	public int getVersion() {
		return version;
	}

	public int getPrice() {
		return price;
	}
	
	
}
