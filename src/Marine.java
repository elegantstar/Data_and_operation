
public class Marine {
	static int defense = 3;
	static int totalHp = 50;
	static int damage = 5;
	static int defaultSpeed = 400;
	static boolean isActiveSteamPack = false;
	private int hp;
	private int speed;
	
	
	public Marine() {
		this.hp = totalHp;
		this.speed = defaultSpeed;
	}
	
	public int getHp() {
		return hp;
	}

	public int getDamage() {
		return damage;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public static void upgradeDamage() {
//		damage = damage + 2;
		damage += 2;
	}
	public static void upgradeDefense() {
//		defense = defense + 1;
		defense += 1;		
	}
	
	public void attack(Marine enemy) {
		enemy.hp -= damage - enemy.defense;
	}
	
	public static void learnSteamPack() {
		isActiveSteamPack = true;
	}
	
	public void activateSteamPack() {
		if(!isActiveSteamPack || hp <= 10) {
			return;
		}
		hp -= 10;
		speed += 50;
	}
	public boolean isSurvival() {
		if(hp <= 0) {		
			return false;
		}
		return true;
	}
}
