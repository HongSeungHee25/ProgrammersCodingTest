package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 중복된 숫자 개수 - 정답률 89%
public class NumberOfDuplicateDigits {

	public static void main(String[] args) {

		/*
		 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때
		 * array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
		 * 
		 * 제한 사항
		 * - 1 ≤ array의 길이 ≤ 100
		 * - 0 ≤ array의 원소 ≤ 1,000
		 * - 0 ≤ n ≤ 1,000
		 */
		
		System.out.println("[문제 Lv.0 : 중복된 숫자 개수(정답률 89%)]");
		System.out.print("중복 확인할 숫자를 입력해주세요 >> ");
		Scanner sc = new Scanner(System.in);
		int[] array = {1,1,2,3,4,5};
		int n = sc.nextInt();
		int answer = 0;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] == n) {
				answer += 1;
			}
		}
		System.out.println("array 배열 값 중 선택한 '"+n+"' 중복된 숫자는 '"+answer+"' 개 입니다."); 
		
		
		
	}

}
