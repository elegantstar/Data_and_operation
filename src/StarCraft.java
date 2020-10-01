
public class StarCraft {

	public static void main(String[] args) {
		Marine marine1 = new Marine();
		Marine marine2 = new Marine();
		
		//marine1의 방어력 확인(고정값)
		System.out.println(marine1.getDefense());
		System.out.println(Marine.defense);
		
		//공업, 방업
		Marine.upgradeDefense();
		Marine.upgradeDamage();
		
		//방업 확인(객체, 클래스)
		System.out.println(marine1.getDefense());
		System.out.println(Marine.defense);
		
		//marine1이 attack Method로 marine2 공격
		marine1.attack(marine2);
		
		//피격 후 marine2 체력 확인
		System.out.println(marine2.getHp());
		
		//marine1 스팀팩 사용(안 배웠을 시)
		marine1.activateSteamPack();
		System.out.println(marine1.getHp());
		
		//스팀팩 배우기
		Marine.learnSteamPack();
		
		//marine1 스팀팩 기능 활성화 확인
		System.out.println(marine1.isActiveSteamPack);
		
		//marine1 스팀팩 사용 및 hp 확인
		marine1.activateSteamPack();
		System.out.println(marine1.getHp());
		
		//marine1 스팀팩 100번 클릭 후 체력 확인(생존 확인)
		for(int i = 0; i < 100; i++) {
			marine1.activateSteamPack();
		}
		System.out.println(marine1.getHp());
		
		//marine1으로 marine2 100번 공격
		for(int i = 0; i < 100; i++) {
			marine1.attack(marine2);
		}
		//marine2 체력 확인, 생존 확인
		System.out.println(marine2.getHp());
		System.out.println(marine2.isSurvival());				
	}
}
