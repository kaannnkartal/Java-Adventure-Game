import java.util.Random;

public abstract class Obstacle {

	protected int id, damage, healthy,money;
	protected String name;

	public Obstacle(String name,int id, int damage, int healthy, int money) {
		this.name = name;
		this.id = id;
		this.damage = damage;
		this.healthy = healthy;
		this.money = money;
	}
	
	public int obstacleNumber() {
		
		
		int upperLimit = -1;
				
		if(this.name == "Vampir")
			upperLimit = 3;
		else if(this.name == "Zombi")
			upperLimit = 3;
		else if(this.name == "Ayi")
			upperLimit = 2;
		
		
		return upperLimit;
	}

	
	public int randomObstacle(int upperLimit) {
		Random rand = new Random();
		
		int random = (rand.nextInt(upperLimit) + 1);	
		return random;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
