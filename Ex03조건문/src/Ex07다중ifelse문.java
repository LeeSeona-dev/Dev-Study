import java.util.Scanner;

public class Ex07다중ifelse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A,B,C중 하나 입력 : ");
		
		String alpha =  sc.next();
		
		//== : 기본 타입(primitive) 비교시에만 사용
		//reference 타입은 비교하는 기능이 따로 있음
		//특히 String-> 비교할 때는 .equals() 기능(메서드)을 사용해야함!!
		//.equals->반환값이 true/false(boolean)타입으로 반환, 
		//  그러므로 if절 조건으로 사용가능!!
		if(alpha.equals("A")) {
			System.out.println("A 입력");
		}else if(alpha.equals("B")) {
			System.out.println("B 입력");
		}else if(alpha.equals("C")) {
			System.out.println("C 입력");
		}else {
			System.out.println("A,B,C 외 입력");
		}
		
	}

}
