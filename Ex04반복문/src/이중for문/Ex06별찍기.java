package 이중for문;

public class Ex06별찍기 {

	public static void main(String[] args) {
		// 띄어쓰기 4 별 1
		// 띄어쓰기 3 별 2
		// 띄어쓰기 2 별 3
		// 띄어쓰기 1 별 4
		// 띄어쓰기 0 별 5
		
		for(int i=1; i<=5; i++) {	//i = 1 2 3 4 5
			for(int j=1; j<=5-i; i++) {
		    	System.out.print(" ");
		    }
		    for(int j=1; j<=i; j++) {
		    	System.out.print("*");
		    }
		    System.out.println();
		}
		
	}

}

