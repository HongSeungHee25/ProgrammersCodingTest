package Test.Lv0;

import java.util.Scanner;

//코딩 테스트 : Lv.0 옷 가게 할인받기 - 정답률 89%
public class GetADiscountAtAClothingStore {

	public static void main(String[] args) {

		/*
		 * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
		 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
		 * 
		 * 제한 사항
		 * - 10 ≤ price ≤ 1,000,000
		 * 		- price는 10원 단위로(1의 자리가 0) 주어집니다.
		 * - 소수점 이하를 버린 정수를 return합니다.
		 */
		System.out.println("[문제 Lv.0 : 옷 가게 할인받기 (정답률 89%)]");
		System.out.print("구매한 옷 가격을 입력해주세요 >> ");
		Scanner sc = new Scanner(System.in);
		int price= sc.nextInt();
		
		int answer = 0;
		if(price >= 500000) answer = (int) (price * 0.8);
		else if(price >= 300000) answer = (int) (price * 0.9);
		else if(price >= 100000) answer = (int) (price * 0.95);
		else answer = price;
		System.out.println(answer);
	}

}
