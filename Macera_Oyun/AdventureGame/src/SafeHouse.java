
public class SafeHouse extends NormalLocation {

	SafeHouse(Character character) {
		super(character,"Guvenli Ev");
		
	}
	
	@Override
	public boolean getLocation() {
		character.setHealthy(character.getMaxHealth());
		System.out.println("Caniniz Fullendi! ");
		System.out.println("Suan Guvenli Ev' yerindesiniz. ");
		return true;
	}
	

}
