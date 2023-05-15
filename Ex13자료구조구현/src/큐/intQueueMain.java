package 큐;

import java.util.Scanner;


public class intQueueMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		intQueue q = new intQueue(10);
		
		int menu;
		while(true) {
			System.out.print("[1]인큐 [2]디큐 [3]피크 [4]덤프 [5]종료 ");
			menu = sc.nextInt();
			
			if(menu==1) {
				if(!q.isFull()) {
					System.out.print("추가할 값 입력 : ");
					int num = sc.nextInt();
					q.enque(num);
				}else {
					System.out.println("큐가 가득 찼습니다.");
				}
				
			}else if(menu==2) {
				if(!q.isEmpty()) {
					System.out.print("삭제할 값 : ");
					int num = sc.nextInt();
					q.deque(num);
				}else {
					System.out.println("큐가 비어있습니다.");
				}
				
				
			}else if(menu==3) {
				System.out.println(q.peek()); 
				
			}else if(menu==4) {
				q.dump();
				
			}else if(menu==5) {
				break;
			}
			
			
		}
		

	}

}
