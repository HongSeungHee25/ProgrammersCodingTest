package Test.Lv0;

import java.util.Arrays;

//코딩 테스트 : Lv.0 배열 뒤집기 - 정답률 89%
public class FlipArray {

	public static void main(String[] args) {

		/*
		 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
		 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한 사항
		 * - 1 ≤ num_list의 길이 ≤ 1,000
		 * - 0 ≤ num_list의 원소 ≤ 1,000
		 * 
		 */
		System.out.println("[문제 Lv.0 : 배열 뒤집기(정답률 89%)]");
		
		int[] num_list = {1,2,3,4,5};
		
		int[] answer = new int[num_list.length];
		
		for (int i = 0; i < num_list.length; i++) {
			answer[num_list.length-1-i]=num_list[i];
		}
		
		System.out.println("배열 뒤집기 : "+Arrays.toString(answer));
		
	}
}
