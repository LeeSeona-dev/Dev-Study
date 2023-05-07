package 메서드;

public class Ex10메서드들 {

	public static void main(String[] args) {
		// 자바페스티벌 응용할수있는 메서드들!!
		
		//String 관련된 Method 모음
		// 1. indexOf() : 특정 문자열의 위치를 반환하는 
		String data = "여러분 안녕?";
		// "안"의 위치 알아보기		
		data.indexOf("안");  	//리턴타입 : int
		System.out.println(data.indexOf("러"));
		// 만약 포함하고 있지 않은 단어라면 -1을 반환한다.
		
		
		// 2.contains(String s)
		//매개변수로 받은 문자열의 포함 여부를 boolean으로 반환
		
		if(data.contains("안녕?")==true) {
			System.out.println("포함하고 있습니다.");
		}
		
		// 3.charAt(int i)
		// String data에서 i번째 문자를 반환!
		data.charAt(2);
		System.out.println(data.charAt(2));
		
		//4. split(String s)
		// String 변수를 s 변수기준으로 잘라 배열로 반환
		String data2="010-3420-5636";
		String[] arr = data2.split("-");
		// 0 : 010
		// 1 : 3420
		// 2 : 5636
		System.out.println(arr[1]);
		
		
	}

}
