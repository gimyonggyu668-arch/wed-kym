package ex1_set.HashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;



//Set 인터페이스가 제공하는 메서드
//void add(E e): 데이터를 삽입
//void remove(Object o): 선택된 데이터를 삭제
//void clear(): 모든 데이터를 삭제
//int size(): 저장된 데이터의 개수를 반환
//contains(E e): 셋에 해당 데이터가 저장되어있는지 확인

public class HashSetExample {
	public static void main(String[] args) {
		//HashSet 클래스는 Set인터페이스에서 가장 많이 사용되는 구현 클래스이다.
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("Spring");
		set.add("React");
		set.add("java");
		
		System.out.println(set);
		System.err.println("개수 : "+ set.size());
		
		//HeshSet(Collection<? extends E> c)
		//Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,5,2,3));
		
		
		Set<Integer> set2 = new HashSet<Integer>();
		int i = 0;
		while(set2.size() != 6) {
			int randomNum = (int) (Math.random() * 45) + 1;
				set2.add(randomNum);
		}
		System.out.println(set2);
		
		List<Integer> lotto = new ArrayList<Integer>(set2);
		
		
		for(int e : set2) {
			System.out.println(e);
		}
		//set을 배열로 만들기
		//new Integer[0] -> 배열의 방 개수를 0으로 하면 set이 add해둔 개수만큼
		//자동으로 배열의 index가 만들어진다.
		//toArray()
		Integer[] arr = lotto.toArray(new Integer[0]);
		
		
		
		
	}
}
