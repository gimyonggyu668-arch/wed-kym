package ex3_bufferedstream.exam;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 급여: " + salary);
    }
}

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("김철수", 3500));
        employees.add(new Employee("이영희", 4500));
        employees.add(new Employee("박지성", 3000));
        employees.add(new Employee("최수연", 5000));

        // 1. 급여 높은 순 (내림차순) 정렬
        Collections.sort(employees, (e1, e2) -> e2.salary - e1.salary);
        System.out.println("--- 급여 높은 순 정렬 ---");
        for (Employee e : employees) e.printInfo();

        // 2. 이름 오름차순 정렬
        Collections.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("\n--- 이름 오름차순 정렬 ---");
        for (Employee e : employees) e.printInfo();
    }
	
	}

