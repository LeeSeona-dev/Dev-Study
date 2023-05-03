
public class Ex09비트시프트 {

	public static void main(String[] args) {
		//비트 연산자, 시프트연산자 -> 연산을 빠르게 하고싶을때 ex)은행
		
		int a = 9;  //10진수 -> 2진수
		
		//비트연산 : & (and) |(or) ^(xor) ~(not)
		int b = 9;  //1001
		int c = 11;  //1011
		
		System.out.println(b&c); // 1001 과 1011을 and 연산
		System.out.println(b|c); //1001 1011 or 연산
		System.out.println(b^c); //xor: 같은자리수 두개가 같으면 false 다르면 true
		
		int d = 6; //0110
		//0110 -> 반전 1001(맨 앞 1은 음수) -> 1의 보수를 취함 0110 -> 0110+1 =0111 
		System.out.println(~d);
		
		//시프트 연산 : 비트(0,1)를 옮겨주는 연산
		// <<(비트가 왼쪽으로 옮겨짐) , >> (비트가 오른쪽으로 옮겨짐)
		System.out.println(3<<2);
		//3(0011) 비트를 왼쪽으로 2칸씩 움직인다.
		
		

	}

}
