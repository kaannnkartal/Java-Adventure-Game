
public abstract class Character {

	protected int damage,healthy,money,id,maxHealth;
	protected String type;
	
	
	public Character(int damage, int healthy, int money, int id,String type) {
		this.damage = damage;
		this.healthy = healthy;
		this.money = money;
		this.id = id;
		this.type = type;
		setMaxHealth(healthy);
	}

	
	public String statusChar() {
		
		
		String status = "Damage : " + this.damage +"\nHealty : " + this.healthy + "\nMoney : " + this.healthy;
		
		return status;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getMaxHealth() {
		return maxHealth;
	}


	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	
}
