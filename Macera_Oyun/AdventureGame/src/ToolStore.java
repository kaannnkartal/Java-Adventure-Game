
public class ToolStore extends NormalLocation {
	


	ToolStore(Character character) {
		super(character, "Magaza");
		
	}

	
	public boolean getLocation() {
		
		toolMenu();
		
		
		return true;
	}
	
	
	public void toolMenu() {
		
		System.out.println("Para : "+ character.getMoney());
		System.out.println("1. Silahlar ");
		System.out.println("2. Zırhlar ");
		System.out.println("3. Cikis ");
		
		System.out.print("Seçiminiz : ");
		int choice = scan.nextInt();
		int selectItemID;
		switch (choice){
		case 1:
			selectItemID = weaponMenu();
			buyWeapon(selectItemID);
			break;
		case 2:
			selectItemID = armorMenu();
			buyArmor(selectItemID);
			break;
		
		}
	}
	
	public int armorMenu() {
		System.out.println("1. Hafif <Para : 15 - Zırh : 1> ");
		System.out.println("2. Orta <Para : 25 - Zırh : 3> ");
		System.out.println("3. Agir <Para : 40 - Zırh : 5> ");
		System.out.println("4. Cikis");
		
		System.out.println("Silah seciniz : ");
		
		int selectionArmor = scan.nextInt();
		
		return selectionArmor;
	}
	
	public void buyArmor(int itemID) {
		if (itemID > 0 || itemID < 4) {
			
			switch (itemID) {
			case 1:
				Armor hafif  = new Armor("Hafif",1,15);
				if(character.getMoney() >=  hafif.getPrice()) {
					
					player.getInv().setArmorName(hafif.getArmorType());
					player.getInv().setArmor(player.getInv().getArmor() + hafif.getAvoid());
					character.setMoney(character.getMoney() - hafif.getPrice());
					System.out.println("Hafif zirh satin aldiniz. Yeni zirh : " +player.getInv().getArmor());
				}
				else {
					System.out.println("Yetersiz para! Silah satın alınamadı.!");
				}
				break;
			case 2:
				Armor orta  = new Armor("Orta",3,25);	
				if(character.getMoney() >=  orta.getPrice()) {
					
					player.getInv().setArmorName(orta.getArmorType());
					player.getInv().setArmor(player.getInv().getArmor() + orta.getAvoid());
					character.setMoney(character.getMoney() - orta.getPrice());
					System.out.println("Orta zirh satin aldiniz. Yeni zirh : " +player.getInv().getArmor());
				}
				else {
					System.out.println("Yetersiz para! Silah satın alınamadı.!");
				}
				break;
			case 3:
				Armor agir  = new Armor("Agir",5,40);
				
				if(character.getMoney() >=  agir.getPrice()) {
					
					player.getInv().setArmorName(agir.getArmorType());
					player.getInv().setArmor(player.getInv().getArmor() + agir.getAvoid());
					character.setMoney(character.getMoney() - agir.getPrice());
					System.out.println("Agir zirh satin aldiniz. Yeni zirh : " +player.getInv().getArmor());
				}
				else {
					System.out.println("Yetersiz para! Silah satin alinamadi.!");
				}
				break;
			case 4:
				System.out.println("Cikis yapiliyor");
				break;
			}
		}
		else {
			System.out.println("Gecersiz islem");
		}
	}
	
	public int weaponMenu() {
		
		System.out.println("1. Tabanca <Para : 25 - Hasar : 2> ");
		System.out.println("2. Kılıc <Para : 35 - Hasar : 3> ");
		System.out.println("3. Tufek <Para : 45 - Hasar : 7> ");
		System.out.println("4. Cikis");
		
		System.out.println("Silah seciniz : ");
		
		int selectionWeapon = scan.nextInt();
		
		return selectionWeapon;
		
	}
	
	public void buyWeapon (int itemID) {
		if (itemID > 0 || itemID < 4) {
			switch (itemID) {
			case 1:
				Weapon tabanca = new Tabanca();				
				if(character.getMoney() >=  tabanca.getPrice()) {
					
					player.getInv().setWeaponName(tabanca.getWeaponType());
					player.getInv().setDamage(character.getDamage()+tabanca.getDamage());
					character.setMoney(character.getMoney() - tabanca.getPrice());
					System.out.println("Tabanca satın aldınız. Yeni damage : " +player.getTotalDamage());
				}
				else {
					System.out.println("Yetersiz para! Silah satın alınamadı.!");
				}
				break;
			case 2:
				Weapon kilic = new Kilic();	
				if(character.getMoney() >=  kilic.getPrice()) {
					
					player.getInv().setWeaponName(kilic.getWeaponType());
					player.getInv().setDamage(character.getDamage()+kilic.getDamage());
					character.setMoney(character.getMoney() - kilic.getPrice());
					System.out.println("Kilic satın aldınız. Yeni damage : " + player.getTotalDamage());
				}
				else {
					System.out.println("Yetersiz para! Silah satın alınamadı.!");
				}
				break;
			case 3:
				Weapon tufek =new Tufek();
				
				if(character.getMoney() >=  tufek.getPrice()) {
					
					player.getInv().setWeaponName(tufek.getWeaponType());
					player.getInv().setDamage(character.getDamage()+tufek.getDamage());
					character.setMoney(character.getMoney() - tufek.getPrice());
					System.out.println("Tüfek satın aldınız. Yeni damage : " + player.getTotalDamage());
				}
				else {
					System.out.println("Yetersiz para! Silah satın alınamadı.!");
				}
				break;
			case 4:
				System.out.println("Cikis yapiliyor");
				break;
			}
		}
		else {
			System.out.println("Gecersiz islem");
		}
	}
	
	
	
	

}
