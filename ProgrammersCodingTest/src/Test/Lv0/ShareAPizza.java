package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 피자 나눠 먹기 - 정답률 89%
public class ShareAPizza {

	public static void main(String[] args) {

		/*
		 * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 
		 * 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를
		 * 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
		 * 
		 * 제한 사항
		 * - 1 ≤ n ≤ 100
		 */
		
		System.out.println("[문제 Lv.0 : 피자 나눠 먹기(정답률 89%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("피자를 나눠먹을 사람의 수를 입력해주세요 >> ");
		int n = sc.nextInt();
		
		int answer = 0;
		if(n % 7 == 0) answer = n / 7;
		else answer = n / 7 + 1;
		System.out.println("피자 나눠먹을 사람이 총 '"+n+"' 명이기에 최소 한조각씩 먹을려면 피자가 최소 '"+answer+"' 판은 있어야 합니다.");
		
		
	}
}
