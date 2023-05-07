package 메서드;

public class Ex06메서드 {

	public static void main(String[] args) {
		// main 안에 코드는 손대지 않기!!
		// 8, -2, 15, 0 출력되게끔 (출력하는 기능을 가지고 있어야 함)
		// 기능 -> 리턴타입이 없다!!!! void!!
		add(3,5);
		sub(3,5);
		mul(3,5);
		div(3,5);

	}
	
	//리턴타입에 void, 전달인자 2개 -> 매개변수 2개,int 자료형 2개-> 매개변수 int2개
	public static  void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}
	public static void mul(int a, int b ) {
		System.out.println(a*b);
	}
	public static void div(int a, int b ) {
		System.out.println(a/b);
	}
}
