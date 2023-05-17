package Controller;

import java.util.Scanner;

import Model.Turtle;
import View.Main_display;

public class Main {

	public static void main(String[] args) {
		
//		Turtle gobuk = new Turtle(10, 1, 200);
//		gobuk.attack();
		
		Main_display mdp = new Main_display();
		
		Scanner sc = new Scanner(System.in);
		AllSelectItem allSelect = new AllSelectItem();
		
		
		while(true) {
			mdp.render();
			int select = sc.nextInt();
			if(select==1) {
				System.out.print("1. 전체아이템 조회 2. 검 아이템 조회 3. 활 아이템 조회 >>");
				select = sc.nextInt();
				allSelect.rangeAll(select);
			}else if(select==2) {
				
			}else if(select==3) {
				
			}else {
				System.out.println("게임 종료");
				break;
			}
		}
		

	}

}
