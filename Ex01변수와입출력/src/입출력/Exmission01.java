package 입출력;

import java.util.Scanner;

public class Exmission01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름 : ");
		
		String name=sc.next();
		
		
		System.out.print("나이 : ");
		int age=sc.nextInt();
		
		System.out.println("이름은 "+name+"이고 나이는 "+age+" 입니다.");
		System.out.printf("이름은 %s이고 나이는 %d 입니다.",name,age);

	}

}
