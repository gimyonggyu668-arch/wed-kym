package ex1_exception.customException;

// Converter2에 문자열 -> 정수 변환 로직이 있다고 가정하거나, Integer.parseInt를 직접 사용합니다.
public class OrderService {
	
	// 총 금액 계산
	public int calculateTotal(int price, int quantity) throws IllegalArgumentException {
		// 1. 예외 조건 검사 (오타 수정: IllegalArtgument -> IllegalArgument)
		if (price < 0) {
			throw new IllegalArgumentException("가격은 0원 이상이어야 합니다.");
		}
		
		if (quantity <= 0) {
			throw new IllegalArgumentException("수량은 1개 이상이어야 합니다.");
		}

		return price * quantity;
	}
}
