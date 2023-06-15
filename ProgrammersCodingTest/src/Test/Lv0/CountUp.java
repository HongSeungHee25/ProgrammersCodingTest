package Test.Lv0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//코딩 테스트 : Lv.0 카운트 업 - 정답률 89%
public class CountUp {

	public static void main(String[] args) {
		
		/*
		 * 정수 start와 end가 주어질 때, start부터 end까지의 
		 * 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한 사항
		 * - 0 ≤ start ≤ end ≤ 50
		 */
		
		System.out.println("[문제 Lv.0 : 카운트 업 (정답률 89%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("시작할 숫자를 입력해주세요 >> ");
		int start = sc.nextInt();
		System.out.print("끝날 숫자를 입력해주세요 >> ");
		int end = sc.nextInt();
		
		List<Integer> answer = new ArrayList<>();
		
		for (int i = start; i <= end; i++) {
			answer.add(i);
		}
		System.out.println("시작하는 숫자 '"+start+"' 끝나는 숫자 '"+end+"' 까지의 숫자를 차례로 담은 \nlist '"+answer+"' 입니다.");
	}
}
