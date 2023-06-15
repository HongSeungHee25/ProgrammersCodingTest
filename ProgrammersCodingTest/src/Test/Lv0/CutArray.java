package Test.Lv0;

import java.util.Arrays;
import java.util.Scanner;

//코딩 테스트 : Lv.0 배열 자르기 - 정답률 89%
public class CutArray {

	public static void main(String[] args) {
		/*
		 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때
		 *  numbers의 num1번 째 인덱스부터 num2번째 인덱스까지
		 *  자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
		 *  
		 *  제한 사항
		 *  - 2 ≤ numbers의 길이 ≤ 30
		 *  - 0 ≤ numbers의 원소 ≤ 1,000
		 *  - 0 ≤num1 < num2 < numbers의 길이
		 */
		
		System.out.println("[문제 Lv.0 : 배열 자르기(정답률 89%)]");
		int[] numbers = {1,2,3,4,5};
		int[] answer = new int[numbers.length];
		System.out.print("시작할 배열 num1 index를 입력해주세요 >> ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.print("시작할 배열 num2 index를 입력해주세요 >> ");
		int num2 = sc.nextInt();
		answer = Arrays.copyOfRange(numbers, num1, num2 +1);
		
		//Arrays.copyOfRange 메서드를 사용하여 배열을 자르고 그 결과를 반환하는 방식입니다. 
		//numbers 배열의 길이와 동일한 길이의 새로운 answer 배열을 생성한 후, 
		//Arrays.copyOfRange 메서드를 사용하여 numbers 배열의 num1부터 num2까지의
		//요소를 answer 배열에 복사합니다. 마지막으로 answer 배열을 반환합니다.
		System.out.print("[ ");
		for(int num : answer) {
			System.out.print(num + " ");
		}
		System.out.print("]");
	}
}