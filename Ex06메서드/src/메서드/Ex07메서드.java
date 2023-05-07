package 메서드;

public class Ex07메서드 {

	public static void main(String[] args) {
		// 
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰 수 확인 : "+result);

	}
	
	
	//largerNumber 메서드 만들기 
	//전달인자 int  num1 , num2 2개, 매개변수 int 2개 
	//리턴타입 int
	//전달인자 이름, 매개변수에 사용하는 이름을 일치시켜준다.
	//모든 경우에 대해서 return값이 있어야 한다.!!!
	
	public static int largerNumber(int num1, int num2) {
		if(num1==num2) {
			return 0;
		}else if(num1>num2) {
			return num1;
		}else {
			return num2;
		} 
		
	}
}
