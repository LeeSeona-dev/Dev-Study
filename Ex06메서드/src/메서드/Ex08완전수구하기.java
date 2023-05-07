package 메서드;

public class Ex08완전수구하기 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		boolean divisor = isDivisor(num1,num2);
		System.out.println(divisor);
		//num2가 num1의 약수인지 아닌지? 
		//num1이 num2의 배수인지 아닌지?
		//num2가 num1을 나누어 떨어지게 하는지? 셋중하나!
		
		//2.getDivisor -> 약수 출력하는 기능 (void) -> return값 x!
		getDivisor(10);	
		getDivisor(16);
		getDivisor(24);
		
		//3.getSumOfDivisors
		int num = 10;
		int result = getSumOfDivisors(num);	//매개변수 1개, 결과값이 int(리턴타입이 int)
		System.out.println(num+"의 약수의 합 : "+ result);
		getDivisor(10);
		
		//4.완전수인지 아닌지 판단해주는 isPerfectNumber()
		//완전수: 자기자신을 제외한 약수의 합이 자기 자신과 같은 수
		// 6 : 1 2 3 6-->6 (완전수)
		//10 : 1 2 5 10-->8 (완전수 x)
		//28 : 1 2 4 7 14--> 28 (완전수)
		//true, false
		int num3 = 6;
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2);
		
		//5. 
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
		
		
	}
	//1.isDivisor() : 매개변수 int 2개, 리턴타입 boolean(true, false) 
	
	public static boolean isDivisor(int num1, int num2) {

		if(num1%num2==0) {
			return true;
		}else {		//메소드 안 if 문의 마지막은 항상 else로 모든경우 반환!
			return false;
		}
		// is라는 키워드가 붙은 메서드는 결과값이 (리턴타입이) boolean
	}


	//2.getDivisor() : 약수 출력하는 기능이므로 (void) -> return값 x!, 매개변수 int 1개
	public static void getDivisor (int num1) {
		System.out.print(num1+"의 약수 : ");
		
		//i가 num1의 약수인지 아닌지? --> true / false
		//isDivisor() --> true/false
		
		for(int i=1; i<=num1; i++) {
			if (isDivisor(num1,i)) {
				System.out.print(i+ " ");
			}
		}System.out.println();
		
	}
	
	
	//3.getSumOfDivisors
	public static int getSumOfDivisors(int num1) {
			//num1의 약수들의 합/ 약수인지 아닌지 판단 -> 누적
		int sum =0; //약수들의 합 누적
		for (int i = 1; i<=num1/2; i++) {
			if(isDivisor(num1,i)) {
				sum +=i;
			}
	
		 }
		return sum+num1;
	}
	
	//4.isPerfectNumber : 매개변수 int 1개, 리턴타입 boolean
	public static boolean isPerfectNumber(int num3) {
		
		//num3가 완전수인지 아닌지?
		//자기자신을 제외한 약수의 합 == 자기자신
		//약수의 합 = 자기자신*2
		if(getSumOfDivisors(num3)-num3==num3) {
			
		return true;
		}else {
			return false;
		}
		
	}
	
	
	//5. getPerfectNumber : 매개변수 int 2개, 출력하는 기능을 가짐->리턴타입:void
	public static void getPerfectNumber(int startValue, int endValue ) {
		//2부터 1000까지 -> 완전수인지 아닌지 판단
		
		System.out.print(startValue+"에서부터 " + endValue+" 까지의 완전수 : ");
		for(int i =startValue; i<=endValue; i++) {
			if(isPerfectNumber(i)) {
				System.out.print(i+" ");
			}
		}	
	}
} 	
	
