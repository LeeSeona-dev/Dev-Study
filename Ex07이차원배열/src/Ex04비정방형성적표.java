import java.util.Scanner;

public class Ex04비정방형성적표 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][];
		
		arr[0] = new int[4];
		arr[1] = new int[6];
		arr[2] = new int[5];
		arr[3] = new int[7];
		int num=1;
		int num2=1;
		int sum = 0;
		int avg =0;
		for(int i=0; i<arr.length; i++) {
			for(int j = 0; j<=0; j++) {
				arr[i][j] = num;
			}num++;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println((i+1)+"반 점수 입력");
			num2 = 1;
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print((i+1)+"반 " +"번째 학생 점수 >>");
				arr[i][j] = sc.nextInt();
				num2++;
				sum+=arr[i][j];
				
			}avg=sum/arr[i].length;
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println((i+1)+"반 >> ");
			for(int j = 0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]+"\t");
				System.out.println("총 점 : "+sum);
				System.out.println("평균 : "+avg);
			}System.out.println();
		}

	}

}
