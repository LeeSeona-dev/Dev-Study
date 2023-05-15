package 게임캐릭터;

public class Warrior extends Charac{
	
	
	//전진,점프, 공격 --->Charac
	//추상클래스 Charac 상속받아 메서드 구현
	//추상클래스 상속받을시 추상클래스 안의 추상메서드를 반드시 구현해야한다.
	
	@Override
	public void run() {
		System.out.println("뚜벅뚜벅.. ");
		
	}

	@Override
	public void jump() {
		System.out.println("호잇쨔 !");
		
	}

	@Override
	public void atk() {
		System.out.println("스윽!");
		
	}
	
}
