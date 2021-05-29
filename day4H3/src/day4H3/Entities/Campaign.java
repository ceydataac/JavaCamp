package day4H3.Entities;

import day4H3.Abstract.IEntity;

public class Campaign implements IEntity {
	
     int campaignId;
	 String campaignName;
     int discount;
     
     public Campaign(int campaignId, String campaignName, int discount) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discount = discount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public int getDiscount() {
		return discount;
	}
	
	
}
