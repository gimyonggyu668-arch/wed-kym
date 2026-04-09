package ex1_List.ArrayList.exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayExam {
	public static void main(String[] args) {
		//Integer 차입의 리스트 객체 만들기
		List<Integer> num = new ArrayList<Integer>(); 
		//리스트에 (1~30사이의)난수 10개 넣기 
	for(int i = 0; i < 10; i++) {
		int ran = (int)(Math.random() * 30) + 1;
		num.add(ran);
	}
		//리스트에 담긴 데이터 중 홀수의 총합을 구하시오
	int sum = 0;
	for(int i = 0; i <= num.size() -1; i++) {
		if(num.get(i)%2==1){
			sum += num.get(i);
		}
	}
	System.out.println(sum);
	
	}
}
