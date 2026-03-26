
# 제어문
## \#\# : 반복문
### \#\#\# : for,while

--- : while을 사용해 만든 자릿수 + 계산기


- while은 조건이 맞는지 먼저 확인 아니면 반복
- !=같지 않음 수 일때 
### 이게 실행 
     b += a % 10;//a%10한 계산 값은 a에게
     저장되는 것이 아니므로 b = b + a % 10; 
	 b에 저장 된 값은 a의 나머지 이기에 따로 
     저장됨

	 여기서 a를 또 따로 저장해서 나눈뒤 
     서로  더해서 10진수로 10을 이용해
     다음 자리 
     수를 더하게끔 도움	

	 a = a/10;//a는 그대로이다.
        

``` : 코드 작성가능 ```
``` java 

	Scanner sc = new Scanner(System.in);
	System.out.println("숫자를 입력하시오: ");
	int a = sc.nextInt();
	int b = 0;
	while(a != 0) {
		b += a % 10;
			
			a = a/10;
			
			
			
		}
			
			System.out.println(b);
			
```

``` c
printf("%d" 100);
```