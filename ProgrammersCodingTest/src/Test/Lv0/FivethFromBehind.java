package Test.Lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//코딩 테스트 : Lv.0 뒤에서 5등 위로 - 정답률 89%
public class FivethFromBehind {

	public static void main(String[] args) {

		/*
		 * 정수로 이루어진 리스트 num_list가 주어집니다. 
		 * num_list에서 가장 작은 5개의 수를 제외한 수들을 
		 * 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
		 * 
		 *	제한사항
		 *- 6 ≤ num_list의 길이 ≤ 30
		 *- 1 ≤ num_list의 원소 ≤ 100
		 */
		
		System.out.println("[문제 Lv.0 : 뒤에서 5등 위로(정답률 89%)]");
		int[] num_list = {12,4,15,46,38,1,14,56,32,10};
		
		List<Integer> answer = new ArrayList<Integer>();
		Arrays.sort(num_list);
		for(int i = 5; i < num_list.length; i++) {
			answer.add(num_list[i]);
		}
		System.out.println(answer);
	}
}
