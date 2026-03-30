package ex1_final;

import java.util.Scanner;

public class Parking {
	//기본요금 :10000원
	//추가요금 :시간당 2000원 
	
	
	static final int BASE = 10000;
	static final int PLUS = 2000;
	
	//요금 계산 메서드
	public int CalculateFee(int time) {
		return BASE + (time * PLUS);
	}
	
	
	
	
	
	
	
	
}
