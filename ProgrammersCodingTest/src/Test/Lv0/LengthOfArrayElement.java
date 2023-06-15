package Test.Lv0;

//코딩 테스트 : Lv.0 배열 원소의 길이 - 정답률 89%
public class LengthOfArrayElement {

	public static void main(String[] args) {

		/*
		 *문자열 배열 strlist가 매개변수로 주어집니다.
		 *strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.
		 * 
		 * 제한 사항
		 * - 1 ≤ strlist 원소의 길이 ≤ 100
		 * - strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
		 */
		
		
		System.out.println("[문제 Lv.0 : 배열 원소의 길이(정답률 89%)]");
		String[] strlist = {"We", "are","the","world!"};
		int [] answer = new int [strlist.length];
		int length = strlist.length;
		
		for (int i = 0; i < length; i++) {
			answer[i] = strlist[i].length();
		}
		System.out.println(answer.length);
	}
}
