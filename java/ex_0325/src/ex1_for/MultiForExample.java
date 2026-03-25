package ex1_for;



public class MultiForExample {
	public static void main(String[] args) {
		
		//기준이 되는 숫자와 겹치는 숫자가 있는지 사용
		//주로 검사할 때 많이 쓰임
		
		for(int i = 1; i <= 3; i++) {
			
			for(int j = 1; j <=3; j++) {
				System.out.println(i+ " " +j);
				
				
				}
			
			
			
			
			
		}
		
		
		
		//두 개의 주사위를 던졌을 때, 두 눈의 합이 6이되는 모든 경우의 수 출력하기
		//1 5
		//2 4
		//3 3
		//4 2
		//5 1
		
		
		for(int b = 1; b <= 6; b++) {
			for(int t = 1; t <= 6; t++) {
				if(b+t==6) {
					System.out.println(b+" "+t);
				}
			}
		}
		
		
		//1 2 3 4 
		//1 2 3 4 
		//1 2 3 4 
		
		// y는 3이될 때 종료해라
		//오늘 헷갈린 거 
		//for문은 결과 값이 아닌 실행하는 조건이다.
		for(int y = 1; y <= 3; y++ ) { //행의 개수 만큼 반복(가로)
			
			for(int s = 1; s <= 4; s++) {//열의 개수 만큼 반복(세로)
			
				System.out.print(s+" ");
			}
			
			System.out.println();
		}
		
		//1  2  3  4 
		//5  6  7  8
		//9 10 11 12
		
		//for(int u = 1; u <= 3; u++) {
			//for(int a = 1; a <= 12; a++) {
			//System.out.print(a+" ");
			//}
			
		//	System.out.println();
		//}
		int count = 1;
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j<=4; j++) {
				System.out.printf("%02d ",count++);
			}
			System.out.println();
		}
		
		
		
		
		//A B C D
		//E F G H
		//I J K L
		//아스키 코드 활용하기  !!
		
		char a = 'A'; //아스키 코드로 사용 65 그 다음 >>>66 67 등등으로 출력
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j<=4; j++) {
				System.out.printf("%c ", a++);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
