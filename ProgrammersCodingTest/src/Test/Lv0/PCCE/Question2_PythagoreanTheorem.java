package Test.Lv0.PCCE;

import java.util.Scanner;

//[PCCE 기출문제] : 2번/피타고라스의 정리
public class Question2_PythagoreanTheorem {
	public static void main(String[] args) {
		/*
		 * 디버깅(Debugging) 문제
		 * 이미 완성된 코드에서 버그를 찾아 수정하는 문제 타입입니다.
		 * 1줄만 수정하여 버그를 고치세요.
		 * 2줄 이상 수정할 경우, 실행 결과에 에러 메시지가 표시됩니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("입력 : ");
		int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int) ((int)(Math.pow(c, 2))-(Math.pow(a, 2)));

        System.out.println(b_square);
    }
}