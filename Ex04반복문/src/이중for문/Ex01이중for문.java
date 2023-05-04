package 이중for문;

public class Ex01이중for문 {

	public static void main(String[] args) {
		
		//패키지를 구분하는 이유:하나의 프로젝트 안에서 클래스 이름 중복 가능, 협업을 위해
		
		//구구단 2단~9단 출력 (이중 for문 사용)
		
		for(int i=2; i<=9; i++) {
			System.out.print(i+"단 : ");
			for(int j=1; j<=9; j++) {
				System.out.print(" ");
				System.out.print(i+" * "+ j+ " = "+i*j);
			}
			System.out.println();
		}
		//지역변수 vs 전역변수
		//지역변수 : 특정 영역(scope)에서만 사용할 수 있는 변수 
		//전역변수 : 클래서 전체에서 사용할 수 있는 변수
		//특정영역을 구분하는 방법 {영역}
	}

}
