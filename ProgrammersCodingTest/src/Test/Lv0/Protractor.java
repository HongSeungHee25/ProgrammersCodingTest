package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 각도기 - 정답률 90%
public class Protractor {

	public static void main(String[] args) {

		/*
		 * 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 
		 * 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다
		 * 각 angle이 매개변수로 주어질 때 예각일 때 1,직각일 때 2, 둔각일 때 3, 평각일 때 4를
		 * return하도록 solution 함수를 완성해주세요.
		 * 
		 * - 예각 : 0 < angle < 90 (1)
		 * - 직각 : angle = 90 (2)
		 * - 둔각 : 90 < angle < 180	(3)
		 * - 평각 : angle = 180 (4)
		 */
		/*
		 * 제한 사항
		 * - 0 < angle ≤ 180
		 * - angle은 정수입니다.
		 */

		System.out.println("[문제 Lv.0 : 각도기 (정답률 90%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("각도를 입력해주세요 >> ");
		int angle = sc.nextInt();
		
		int answer = 0;
		
		if(angle < 90) {
			answer = 1;
			System.out.println("각도 '"+angle+"' 도는 예각이므로 '"+answer+"' 입니다.");
		}else if(angle == 90) {
			answer = 2;
			System.out.println("각도 '"+angle+"' 도는 직각이므로 '"+answer+"' 입니다.");
		}else if(angle < 180 && angle > 90) {
			answer = 3;
			System.out.println("각도 '"+angle+"' 도는 둔각이므로 '"+answer+"' 입니다.");
		}else if(angle == 180) {
			answer = 4;
			System.out.println("각도 '"+angle+"' 도는 평각이므로 '"+answer+"' 입니다.");
		}
		
		
		
	}

}
