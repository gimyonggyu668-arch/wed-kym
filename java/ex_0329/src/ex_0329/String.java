package ex_0329;

public class String {
	public String com(String input) {
		// 마지막 글자 비교를 위해 뒤에 '가짜 공간' 하나를 더해줍니다 (에러 방지 꿀팁!)
        input = input + " "; 
        
        String result = ""; // 결과물을 담을 빈 상자
        int count = 1;      // 연속된 글자 수를 셀 바구니 (기본 1개부터 시작)

        // 문자열 길이만큼 반복 (마지막 가짜 공간 전까지만!)
        for (int i = 0; i < input.length() - 1; i++) {
            
            // 핵심 logic: 현재 글자(i)와 다음 글자(i+1)를 비교합니다.
            if (input.charAt(i) == input.charAt(i + 1)) {
                // 1. 같다면? 카운트만 올리고 다음으로 넘어감
                count++;
            } else {
                // 2. 다르다면? (글자가 바뀌는 순간!)
                // 지금까지 쌓인 '글자'와 '숫자'를 상자에 담습니다.
                result += input.charAt(i) + "" + count;
                
                // 새로운 글자를 세야 하니 카운트를 다시 1로 초기화!
                count = 1;
            }
        }
        return result; // 완성된 압축 문자열을 던져줌
    }
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
	}

