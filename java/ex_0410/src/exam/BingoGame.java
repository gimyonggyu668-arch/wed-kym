package exam;

import java.util.Scanner;

//빙고 게임 프로세스
//게임의 시작, 빙고 숫자 입력

//Bingo 객체를 필드로 선언하세요
//사용자에게 입력을 받기 위한 Scanner 객체를 필드로 선언하세요

//생성자에서 Bingo객체를 생성하세요
//Scanner객체도 생성하세요
public class BingoGame {

	Bingo bing = new Bingo();

	// start()메서드를 작성하여 게임 전체 흐름을 구현하세요
	// 게임 시작시 "빙고 게임을 시작합니다"라고 출력하기
	// 반복문을 사용하여 숫자를 계속 입력받을 수 있도록 합니다.
	public void start() {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("빙고 게임을 시작합니다.");

		}

	}

	// 1단계
	// 현재 빙고판을 출력합니다.

	// 2단계
	// 사용자에게 숫자를 입력받습니다.

	// 3단계
	// 입력한 숫자가 빙고판에 존재하면 체크처리

	// 4단계
	// 숫자가 존재한다면 "X를 체크했습니다." 라고 출력하기

	// 5단계
	// 숫자가 빙고판에 없으면 "빙고판에 없는 숫자입니다."라고 출력하기
	public int checkBoard() {
		int count = 0;
		boolean flag = false;

		// 1. 가로 빙고 : 0 1 2 3 4 / 5 6 7 8 9 / 10 11 12 13 14.. 5개씩 끊어서 전부 값이 0인지 확인
		// 2. 세로 빙고 : 0 5 10 15 20 / 1 6 11 16 21 / ... 5개씩 끊어서 전부 값이 0인지 확인
		// 3. 대각선 빙고 : 0 6 12 18 24 / 4

		// 가로

		for (int i = 0; i < 5; i++) {

			flag = true;
			for (int j = 0; j < 5; j++) {
				if (bingoList.get(5 * i + j) == 0) {
					continue;
				} else {
					flag = false;
					break;
				}
			}

			if (flag == false) {
				continue;
			} else {
				count++;
			}

		}

		// 가로 끝
		// 세로

		for (int i = 0; i < 5; i++) {
			flag = true;
			for (int j = 0; j < 5; j++) {
				if (bingoList.get(i + 5 * j) == 0) {
					continue;
				} else {
					flag = false;
					break;
				}
			}

			if (flag == false) {
				continue;
			} else {
				count++;
			}

		}

		// 세로 끝
		// 대각선 (6의 배수가 전부 0, or 4의 배수 전부 0)
		// 6의 배수
		for (int i = 0; i < 5; i++) {

			flag = true;

			if (bingoList.get(6 * i) == 0) {
				continue;
			} else {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			count++;
		}

		// 6의 배수 끝
		// 4의 배수

		for (int i = 0; i < 5; i++) {
			flag = true;
			if (bingoList.get(4 * i) == 0) {
				continue;
			} else {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			count++;
		}
		// 4의 배수 끝
		// count 반환하여 빙고 개수 알려주기
		return count;
	}

}
