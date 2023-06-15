package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 양꼬치 - 정답률 90%
public class LambSkewers {

	public static void main(String[] args) {

		/*
		 * 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
		 * 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
		 * 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면
		 * 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
		 * 
		 */
		
		/*
		 * 제한 사항
		 * - 0 < n < 1,000
		 * - n / 10 ≤ k < 1,000
		 * - 서비스로 받은 음료수는 모두 마십니다.
		 * 
		 */
		System.out.println("[문제 Lv.0 : 양꼬치 (정답률 90%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("양꼬치 몇인분을 먹었는지 입력해주세요 >> ");
		int n = sc.nextInt();		//n인분 (몇인분)
		System.out.print("음료수 몇개를 먹었는지 입력해주세요 >> ");
		int k = sc.nextInt();		//음료수 갯수
		
		int answer = 0;
		int answers = 0; 
		answer = (n*12000)+((k-(n/10))*2000);
		answers = (n*12000)+(k*2000);
		System.out.println("양꼬치 '"+n+"' 인분 음료수 '"+k+"' 개 드셔서 원래 총 결제할 금액 '"+answers+"' 원 인데");
		System.out.println("양꼬치 10인분 드시면 음료수 하나 서비스로 나가서 지불하실 금액 총 '"+answer+"' 원 입니다.");
		
		
		
	}
}
