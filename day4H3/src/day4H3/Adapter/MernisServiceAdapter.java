package day4H3.Adapter;

import day4H3.Abstract.IGamerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements IGamerCheckService{

	@Override
	public boolean CheckIfRealPerson(day4H3.Entities.Gamer gamer) {
		
		boolean gamerCheck;
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		try 
		{
			gamerCheck = proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getFirstName().toUpperCase()),gamer.getLastName().toUpperCase(), gamer.getDateOfBirth() );		
		} 
		catch (NumberFormatException e) {
			gamerCheck = false;
		}
		return gamerCheck;

	}
}
