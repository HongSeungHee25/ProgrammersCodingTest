package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 문자열 뒤집기 - 정답률 89%
public class ReverseString {

	public static void main(String[] args) {

		/*
		 * 문자열 my_string이 매개변수로 주어집니다. 
		 * my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한 사항
		 * - 1 ≤ my_string의 길이 ≤ 1,000
		 */
		
		System.out.println("[문제 Lv.0 : 문자열 뒤집기(정답률 89%)]");
		System.out.print("문자열을 입력해주세요 >> ");
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		
		String answer = "";
		
		for(int i = my_string.length()-1; i >= 0; i--) {
			answer = answer + my_string.charAt(i);
		}
		System.out.println("문자열 '"+my_string+"'을 뒤집어서 출력하면 '"+answer+"' 입니다.");
	}

}
