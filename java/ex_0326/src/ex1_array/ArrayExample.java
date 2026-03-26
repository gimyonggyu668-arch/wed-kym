package ex1_array;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		//String result = "";
		//char[] cards = {'1','L','O','2','V','3','E'};
		//배열에서 문자만 뽑아서 단어 만들기
		///아스키 코드 활용하기
		//for(int i = 0; i < cards.length; i++) {
			
		//	if(cards[i] >= 'A' && cards[i] <= 'Z') {
			//	result += cards[i];
				
			//}
		//}
		
		//System.out.println(result);
		
		
		
		//int[] coin = {500,100,50,10};
		
		
		//int coins = (int)(Math.random()*500) + 1;
		//coins = coins*10;
		
		
		//발생된 난수를 큰 동전부터 나누기
	//	System.out.println("잔돈:"+ coins);
	//	for(int i = 0; i < coin.length; i++) {
		//	int res = coins / coin[i];
		//	System.out.println(coin[i]+"원 : "+ res);
		//}
		
		//키보드에서 배열의 길이를 입력받는다.
		//입력받은 배열의 길이만큼 알파벳을 요소로 넣는다 
		//배열의 모든 요소를 출력한다.
		//배열의 길이: 5
		//ABCDEFGHIJ
		
		//배열의 선언과 생성
		//배열의 길이 만큼 반복하여 요소에 알파벳 넣기
		//아스키코드 활용하기
		
		//Scanner sc = new Scanner(System.in);
		//int sstr;
		
		//System.out.println("배열의 길이: ");
		
		//int charStart = 65;
		//sstr = sc.nextInt();
		//char[] arr1 = new char[sstr];
		//for(int i = 0; i < arr1.length; i++) {
		//		arr1[i] = (char)charStart;
		//		charStart++;
		//}
		
		//System.out.println(arr1);
		
		
		
		//로또번호 구하기
		//1~45사이의 난수를 발생시켜 로또번호 6자리를 만드는 코드 작성하기
		//입력까지 받아서 맞는지 확인
		//번호가 중복되는지 비교하기
		int num;
		int i = 0;
		int[] arr2 = new int[6]; // 6개의 공간 확보

		do {
		    // 1. 일단 랜덤 숫자 하나 추출
		    num = (int)(Math.random() * 45) + 1;
		    
		    // 2. 중복인지 확인하기 위한 '신호등' 변수 (매번 false로 초기화)
		    boolean isDuplicate = false;
		    
		    // 3. 현재까지 배열에 들어있는 숫자들과 방금 뽑은 num을 비교
		    for (int j = 0; j < i; j++) {
		        if (arr2[j] == num) {
		            isDuplicate = true; // 같은 게 있으면 신호등을 true로 바꿈
		            break; // 중복인 걸 알았으니 더 비교할 필요 없음
		        }
		    }
		    
		    // 4. 중복이 아닐 때만 배열에 넣고 다음 칸(i)으로 이동
		    if (isDuplicate == false) { // 또는 !isDuplicate
		        arr2[i] = num;
		        i++; // 여기서 i가 늘어나야만 다음 칸으로 가고, 결국 6이 되면 탈출함
		    }
		    
		    // 중복이라면 i가 늘어나지 않으므로, while 조건(i < 6)이 계속 참이라 다시 위로 올라감

		} while (i < arr2.length); 

		// 결과 확인을 위한 출력
		for (int k = 0; k < arr2.length; k++) {
		    System.out.print(arr2[k] + " ");
		}
		
		//로또번호를 담을 배열
	      int [] lotto = new int[6];
	      
	      //배열의 길이만큼 반복
	    outer:for(int y = 0; y < lotto.length;) {
	         
	         //난수를 하나 뽑아 배열에 저장
	    lotto[y] = (int)(Math.random()*45+1);
	         
	         //중복이 있는지 검사
	     for(int j = 0; j < y; j++) {
	            //같은게 있다면
	    if(lotto[y] == lotto[j]) {
	               //다시 뽑아야한다.
	     continue outer;
	            }
	         }
	         System.out.println(lotto[y]+" ");
	         i++;
	      }//outer
		}
		
	
		
		
		
		
			 
		}

	
