package day4H3.Concreate;

import day4H3.Abstract.IGamerService;
import day4H3.Adapter.MernisServiceAdapter;
import day4H3.Entities.Gamer;

public class GamerManagerr implements IGamerService {

	public GamerManagerr(MernisServiceAdapter mernisServiceAdapter) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register(Gamer gamer) {
		System.out.println("Registered : " + gamer.getNickname());
	}
	
	@Override
	public void update(Gamer gamer) {
		System.out.println("Updated : " + gamer.getNickname());
	}
	
	@Override
	public void delete(Gamer gamer) {
		System.out.println("Deleted : " + gamer.getNickname());
	}
}
