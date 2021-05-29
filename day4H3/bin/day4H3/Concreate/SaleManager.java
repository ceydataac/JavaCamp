package day4H3.Concreate;

import day4H3.Abstract.ISalesService;
import day4H3.Entities.Campaign;
import day4H3.Entities.Game;


public class SaleManager implements ISalesService {

	@Override
		public void sale(Game game, Campaign campaign) {
			System.out.println(game.getGameName() + " game bought with " + campaign.getDiscount() + " discount .");
		}
		
	}

	


