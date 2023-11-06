
public class Armor {
	protected int avoid, price;
	protected String armorType;
	
	
	public Armor(String armorType,int avoid, int price) {
		this.avoid = avoid;
		this.price = price;
		this.armorType = armorType;
	}


	public int getAvoid() {
		return avoid;
	}


	public void setAvoid(int avoid) {
		this.avoid = avoid;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getArmorType() {
		return armorType;
	}


	public void setArmorType(String armorType) {
		this.armorType = armorType;
	}
	
	
	
	
	
	
}
