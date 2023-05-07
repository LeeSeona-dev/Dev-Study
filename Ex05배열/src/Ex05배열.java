import java.util.Scanner;

public class Ex05배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//이 배열안에 들어있는 값이 중복되지 않는다! (가정)
		String[] arrStr = {"김지은","박수현","정세연","이명훈","강예진","임명진","정형","채수민"};
		
		System.out.print("검색 할 이름 입력 >> ");
		String name = sc.next();
		
		for(int i=0; i<arrStr.length; i++) {
			// == : 기본 타입 비교시에만 사용, 문자열은 .equals ->반환은 같으면 true
			// int, char, byte, double, float, short,long, boolean
			if(name.equals(arrStr[i])) {
				System.out.println(name+"님은 "+i + "번째 저장되어있습니다.");
				break;	//가장 가까운 반복문 나가는 키워드!
			}
		}
	

	}

}
