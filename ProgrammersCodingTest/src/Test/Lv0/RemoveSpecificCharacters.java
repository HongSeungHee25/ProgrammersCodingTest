package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 특정 문자 제거하기 - 정답률 89%
public class RemoveSpecificCharacters {

	public static void main(String[] args) {

		/*
		 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
		 * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한 사항
		 * - 1 ≤ my_string의 길이 ≤ 100
		 * - letter은 길이가 1인 영문자입니다.
		 * - my_string과 letter은 알파벳 대소문자로 이루어져 있습니다.
		 * - 대문자와 소문자를 구분합니다.
		 * 
		 */
		
		System.out.println("[문제 Lv.0 : 특정 문자 제거하기(정답률 89%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요 >> ");
		String my_string = sc.nextLine();
		System.out.print("제거할 문자 1개를 입력해주세요 >>");
		String letter = sc.nextLine();
		letter.charAt(0);
		String answer = "";
		answer = my_string.replaceAll(letter, "");
		System.out.println("문자열 '"+my_string+"' 에서 제거할 문자 '"+letter+"' 를 제거한 후 남은 문자 '"+answer+"' 입니다.");
		
		
		
	}
}
