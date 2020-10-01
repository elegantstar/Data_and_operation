
public class StarCraft {

	public static void main(String[] args) {
		Marine marine1 = new Marine();
		Marine marine2 = new Marine();
		
		//marine1�� ���� Ȯ��(������)
		System.out.println(marine1.getDefense());
		System.out.println(Marine.defense);
		
		//����, ���
		Marine.upgradeDefense();
		Marine.upgradeDamage();
		
		//��� Ȯ��(��ü, Ŭ����)
		System.out.println(marine1.getDefense());
		System.out.println(Marine.defense);
		
		//marine1�� attack Method�� marine2 ����
		marine1.attack(marine2);
		
		//�ǰ� �� marine2 ü�� Ȯ��
		System.out.println(marine2.getHp());
		
		//marine1 ������ ���(�� ����� ��)
		marine1.activateSteamPack();
		System.out.println(marine1.getHp());
		
		//������ ����
		Marine.learnSteamPack();
		
		//marine1 ������ ��� Ȱ��ȭ Ȯ��
		System.out.println(marine1.isActiveSteamPack);
		
		//marine1 ������ ��� �� hp Ȯ��
		marine1.activateSteamPack();
		System.out.println(marine1.getHp());
		
		//marine1 ������ 100�� Ŭ�� �� ü�� Ȯ��(���� Ȯ��)
		for(int i = 0; i < 100; i++) {
			marine1.activateSteamPack();
		}
		System.out.println(marine1.getHp());
		
		//marine1���� marine2 100�� ����
		for(int i = 0; i < 100; i++) {
			marine1.attack(marine2);
		}
		//marine2 ü�� Ȯ��, ���� Ȯ��
		System.out.println(marine2.getHp());
		System.out.println(marine2.isSurvival());				
	}
}
