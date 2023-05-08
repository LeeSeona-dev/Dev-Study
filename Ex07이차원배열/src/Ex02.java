
public class Ex02 {

	public static void main(String[] args) {
		// 5행5열 54321 , 109876...
		
		//변수이름 alt shift r
		int[][] arr = new int[5][5];
		int num =1;
		for(int i = 0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][4-j] = num++;
			}
			num+=10;
		}
		//출력
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ "\t");
			}System.out.println();
		}
		
		System.out.println();
		
		//5행 5열 12345 - 109876
		int[][] arr5 = new int[5][5];
		
		int num3 = 1;
		for(int i = 0; i<arr5.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(arr5.length%2==0) {
					arr5[i][j] = num3++;
				}else {
					arr5[i][4-j] = num3++;	//역방향 1,3
					num3+=5;
				}
			
//			if(arr5.length%2==1) {
//				for(int j = 0; j<arr5[i].length; j++) {
//					arr5[i][j] = num3++;	//순방향, 0,2,4
//				}
//			}
//			else {
//				for(i = arr5.length; i<arr5.length; i++) {
//					for(int j=0; j<arr5[i].length; j++) {
//					arr5[i][4-j] = num3++;	//역방향 1,3
//				}num3+=5;
//	      }
		}
	 }
		
		for(int i = 0; i<arr5.length; i++) {
			for(int j = 0; j<arr5[i].length; j++) {
				System.out.print(arr5[i][j]+ "\t");
			}System.out.println();
		}

	}

}
