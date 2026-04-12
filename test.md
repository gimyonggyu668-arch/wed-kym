test.md

# 복습

## 배열 -변수명 [Index] = 값;
```c
int[] numbers = new int [5];
                  | 1 | 5 | 10 |   |   |
    index 인덱스 ->  0   1    2   3   4
          
numbers[0] = 1;
numbers[1] = 5;
numbers[2] = 10;
-----------------------------------------

자료형[] 변수명 = new 자료형 [] {값1, 값2, 값3} //자료형에다가 직접 공간을 확보 안해도 값을 쓰면 자동으로 그 자리를 확보


```

## new 생략 가능(초기화 일때만 가능)
```
int[] numbers = {초기화 값};
String[] char = {초기화 값};
```
.

## 배열 순회
```int[] numbers{1, 2, 3, 4, 5};
for(int i = 0; i < numbers.length; i++) {
    System.out.println(i);

}
```
## 다차원 배열 순회
```
int [][] numbers = new numbers[][]{
    {1,2,3,4},{5,6,7,8}
};
```

## 향상된 for문
```int[] numbers = {1, 5, 3, 6, 2};
for(int num : numbers) {
    System.out.println(num);
}
```


## 메소드 (method)

### 메소드는 특정 기능을 수행하는 코드 묶음이다./ 코드 재사용을 위한 | 기능을 담은 상자 + 상자를 부르는 이름

```
// add라는 이름의 메소드를 만든다   (함수 방)
// 두 개의 정수(a, b)를 받아서
// 더한 결과를 반환한다
static int add(int a, int b) {
    return a + b;
}
====================================== (실행될 방)
// add 메소드를 호출하면서 3과 5를 넣는다
// 반환된 결과를 result라는 변수에 저장한다
int result = add(3, 5);
```

## static (static은 계산 처럼 순간 처리 할 때만 쓴다.)
### 1.용민이가 헷갈리는 포인트 "객체가 왜 있을까?" 
### 2.객체는 내가 원하는 값을 저장하고 유지하고 싶을 때 쓴다. 
### 1. static 어떻게 쓰는지

 예: 계산 기능 
```(static)
class Calculator {                      (함수 방)

    static int add(int a, int b) {
        return a + b;
    }
}
```
 사용하는 쪽 (main 느낌):
```
int result1 = Calculator.add(3, 5);    (실행 방)
int result2 = Calculator.add(10, 20);
```
### 🔥 핵심 해석
```
=> Calculator.add()
= “Calculator라는 틀에 있는 공용 기능을 바로 쓴다”
```
### | 객체 생성 ❌
### | 그냥 바로 호출 ⭕

## 객체 생성
``` 
 class Person {            (함수 방)
    int age;
    String name;
}
```

## 객체 선언 후에  실행 방에 호출
```
Person p1 = new Person();            (실행 방)
p1.age = 20;
p1.name = "철수";

Person p2 = new Person();
p2.age = 30;
p2.name = "영희";
```