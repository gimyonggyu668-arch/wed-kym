package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        list.add(new Member("김철수", 25));
        list.add(new Member("이영희", 18));
        list.add(new Member("김민수", 30));

      
        Predicate<Member> isAdult = ms -> ms.getAge() >= 20;

        //  필터링 실행
        System.out.println("--- 성인 명단 ---");
        for (Member s : list) {
            if (isAdult.test(s)) { // Predicate의 test 메소드로 검사
                System.out.println(s.getName() + " (" + s.getAge() + "세)");
            }
        }
    }
}