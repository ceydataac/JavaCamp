package day4H3;

import day4H3.Adapter.MernisServiceAdapter;
import day4H3.Concreate.CampaignManager;
import day4H3.Concreate.GameManager;
import day4H3.Concreate.GamerManagerr;
import day4H3.Concreate.SaleManager;
import day4H3.Entities.Campaign;
import day4H3.Entities.Game;
import day4H3.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game(1, "WWzone", "01012022", "war game", 2, 100);
		Gamer gamer = new Gamer("mad", "melsi", "deniz", "14052001", "melsi@gmail", "got7");
		Campaign campaign = new Campaign(100, "Team Wang", 50);
		
		
		
		GamerManagerr gamerManager = new GamerManagerr(new MernisServiceAdapter());
		gamerManager.register(gamer);
		gamerManager.update(gamer);
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(game);
		gameManager.updateGame(game);
		gameManager.deleteGame(game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game, campaign);
		
		
	}

}
