
public class Ex01for문 {

	public static void main(String[] args) {
		
		// for문을 사용해서 21에서 57까지 출력
		
//		for(int i=21; i<=57; i++ ) {
//			System.out.print(i+" ");
//		}
		
		//96에서 53까지 출력
//		for(int i=96; i>=53; i--) {
//			System.out.print(i+ " ");
//		}
//		
		//21에서 57까지 홀수만 출력
		for(int i=21; i<=57; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		
		/*
		 * for(int i=21; i<=57; i+=2) { System.out.println(i); }
		 */
	}

}
