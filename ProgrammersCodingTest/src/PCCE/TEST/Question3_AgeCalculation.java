package PCCE.TEST;

import java.util.Scanner;

//[PCCE 기출문제] : 3번/나이계산
public class Question3_AgeCalculation {
	public static void main(String[] args) {
		/*
		 * 빈칸채우기 문제
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        }
        else if (age_type.equals("Year")) {
        	answer = 2030 - year;
        }

        System.out.println(answer);
    }
}
