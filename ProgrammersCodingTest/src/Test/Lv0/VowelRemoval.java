package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 모음 제거 - 정답률 89%
public class VowelRemoval {

	public static void main(String[] args) {

		/*
		 * 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
		 * 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한 사항
		 * - my_string은 소문자와 공백으로 이루어져 있습니다.
		 * - 1 ≤ my_string의 길이 ≤ 1,000
		 * 
		 */
		
		System.out.println("[문제 Lv.0 : 모음 제거(정답률 89%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요 >> ");
		String my_string = sc.nextLine();
		
		char[] c = my_string.toCharArray();
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				answer += "";
			}else {
				answer += c[i];
			}
		}
		System.out.println(answer);
		
		answer = my_string.replaceAll("[aeiou]", ""); //매개변수로 들어온 string에 [aeiou]패턴 중 하나에 포함되면 삭제
		
	}
}
