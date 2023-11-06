import java.util.Scanner;

public abstract class Location {

	protected Player player;
	protected Character character;
	protected String name;
	
	Scanner scan = new Scanner(System.in);
	Location(Character character, String locationName){
		this.character = character;
		this.name = locationName;
	}
	
	public abstract boolean getLocation();

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
