package Test.Lv0;

import java.util.Arrays;
import java.util.Scanner;

//코딩 테스트 : Lv.0 배열의 평균값 - 정답률 90%
public class AverageOfArray {

	public static void main(String[] args) {

		/*
		 * 정수 배열 numbers가 매개변수로 주어집니다.
		 *  numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
		 *  
		 *  제한 사항
		 *  - 0 ≤ numbers의 원소 ≤ 1,000
		 *  - 1 ≤ numbers의 길이 ≤ 100
		 *  - 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
		 */
		
		System.out.println("[문제 Lv.0 : 배열의 평균값 (정답률 90%)]");
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		double answer = 0;
		
		int result = 0;
		System.out.print("배열의 요소 "+Arrays.toString(numbers)+"에 평균값은 '");
		for (int i = 0; i < numbers.length; i++) {
			result += numbers[i];
		}
		answer = (double)result / numbers.length;
		System.out.println(answer+"' 입니다.");
	}
}
