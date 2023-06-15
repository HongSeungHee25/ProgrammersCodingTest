package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 나이 출력 - 정답률 92%
public class Age {

	public static void main(String[] args) {

		/*
		 * 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 
		 *  나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 
		 *  solution 함수를 완성해주세요.
		 *  
		 *  제한 사항
		 *  - 0 < age ≤ 120
		 *  - 나이는 태어난 연도에 1살이며 1년마다 1씩 증가합니다.
		 *  
		 */
		
		System.out.println("[문제 Lv.0 : 나이 출력 (정답률 92%)]");
		//입력받을 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//나이로 출생년도 출력하기
		System.out.print("나이를 입력하세요 >> ");
		int age = sc.nextInt();
		
		int answer = 0;
		int year = 2023;
		answer = year - age + 1;
		System.out.println("'"+year+"' 년 기준으로 나이 '"+age+"' 살은 출생년도 '"+answer+"' 년생입니다.");
	
		System.out.println("━".repeat(100));
		
		//출생년도로 나이 출력하기
		System.out.print("출생년도를 입력하세요 >> ");
		int years = sc.nextInt();
		answer = year - years + 1;
		System.out.println("'"+year+"' 년 기준으로 출생년도 '"+years+"' 년생은 나이 '"+answer+"' 살입니다.");
	
	
		
	
	
	
	
	
	
	}
}