import java.util.Scanner;

public class Ex04for문 {

	public static void main(String[] args) {
		// 입력 받은 정수의 약수를 구하세요
		//약수는 나머지가 0, 자기자신보다 큰 수는 가지고 있지 않음 
		//모든 숫자들의 가장 작은 약수는 1
		// + 약수는 두번째로 큰 수가 자기 자신의 절반 값
		// ex) 100의 약수 중 두번째로 큰 수는 50, 그다음은 100 자기자신
		//자기 자신의 절반~자기자신 사이에 약수는 존재하지않음
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		System.out.print(num+"의 약수:");
		for(int i=1; i<=num; i++)
			if(num%i==0) {
				
				System.out.print(i+" ");
			}
	}

}
