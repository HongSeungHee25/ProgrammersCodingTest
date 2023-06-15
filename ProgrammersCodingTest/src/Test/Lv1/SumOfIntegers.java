package Test.Lv1;

import java.util.Scanner;

//작성자 : 홍승희

//코딩 테스트 : Lv.1 두 정수 사이의 합 - 정답률 85%
public class SumOfIntegers {

	public static void main(String[] args) {
		
		/*
		 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, 
		 * solution을 완성하세요.
		 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
		 * 
		 */
		
		/*
		 * 제한 조건
		 * - a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
		 * - a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
		 * - a와 b의 대소관계는 정해져있지 않습니다.
		 * 
		 */
		
		System.out.println("[문제 Lv.1 : 두 정수 사이의 합 (정답률 85%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 정수를 입력해주세요 >> ");
		int a = sc.nextInt();
		System.out.print("b의 정수를 입력해주세요 >> ");
		int b = sc.nextInt();
		
		long answer = 0;
		
		if(a<b) {
			for(int i = a; i <= b; i++) {
				answer += i;
			}
		}else if(a>b){
			for(int i = b; i <= a; i++) {
				answer += i;
			}
		}else {
			answer = a;
		}
		
		System.out.println("정수 '"+a+"' 와 정수 '"+b+"' 사이의 합은 '"+answer+"' 입니다.");
	}
}
