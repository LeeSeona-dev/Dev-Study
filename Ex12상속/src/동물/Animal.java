package 동물;

public abstract class Animal {	//추상클래스
	
	
	// 추상 키워드 : abstract
	// 추상 메서드를 포함하려면 추상 클래스로 바뀌어야함
	// 추상 메서드를 포함하고 있지 않아도 추상 클래스가 될 수 있음
	//+ 추상 메서드는 설계만 되어있다(선언만 되어있다, {body}가 없는 메서드를 추상 메서드라 함)
	
	public abstract void eat();	//추상메서드
		
	
	
	// 동물 class
	// 먹고 eat()
	// 자고 sleep()
	public abstract void sleep(); 
	// 움직이다 move()
	public abstract void move(); 
	
	
	
	
}
