package day4H3.Concreate;

import day4H3.Abstract.ICampaignService;
import day4H3.Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {

		System.out.println("Campaign added: " +" "+ campaign.getCampaignId() + " " + campaign.getCampaignName()+ ", discount : "+ campaign.getDiscount());
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Campaign updated: " +" "+ campaign.getCampaignId() + " " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {

		System.out.println("Campaign deleted: " +" "+ campaign.getCampaignId() + " " + campaign.getCampaignName()+ ", discount : "+ campaign.getDiscount());
		
	}

}
