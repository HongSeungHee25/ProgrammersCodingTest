package PCCE.TEST;

import java.util.Scanner;

//[PCCE 기출문제] : 4번/저축
public class Question4_Saving {
	public static void main(String[] args) {
		/*
		 * 빈칸채우기 문제
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();
        
        int money = start;
        int month = 1;

        while (money < 70) {
            money += before;
            month++;
        }
        while (money < 100) {
        	money += after;
            month++;
        }

        System.out.println(month);
    }
}
