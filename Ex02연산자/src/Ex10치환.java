
public class Ex10치환 {

	public static void main(String[] args) {
		//치환 
		
		String left = "red";
		String right = "blue";
		
		String temp; //임시저장공간 , 초기화 안함
		String temp1 = null; //초기화를 함
		//int temp2=null; XX 기본타입은 null로 초기화 x, 레퍼런스 타입만 가능
		temp=right;  //left : red, right : blue, temp : blue
		right=left;  //left : red, temp : blue , right : red
		left=temp;   //letf : blue, temp : blue, right : red
		
		
		System.out.println(left);  //blue
		System.out.println(right); //red

	}

}
