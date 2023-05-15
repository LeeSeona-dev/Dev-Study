package 게임캐릭터;

public class Main {

	public static void main(String[] args) {
		
		//Charac c1 = new Charac();
		//추상 클래스는 객체 생성 불가능!!
		
		Wizard harry = new Wizard();
		harry.run();
		harry.jump();
		harry.atk();
		
		//전사
		//공격 ---> 스윽
		//점프--->호잇쨔
		//전진--->뚜벅뚜벅
		Warrior w1 = new Warrior();
		w1.atk();
		w1.jump();
		w1.run();
		
	}

}
