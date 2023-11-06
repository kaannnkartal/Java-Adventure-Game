
public abstract class Weapon {
	
	protected String weaponType;
	protected int damage, award;
	
	
	
	Weapon(String weaponType, int damage, int price){
		this.weaponType = weaponType;
		this.damage = damage;
		this.award = price;
	}



	public String getWeaponType() {
		return weaponType;
	}



	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}



	public int getDamage() {
		return damage;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}



	public int getPrice() {
		return award;
	}



	public void setPrice(int price) {
		this.award = price;
	}
	
	
	
	

}
