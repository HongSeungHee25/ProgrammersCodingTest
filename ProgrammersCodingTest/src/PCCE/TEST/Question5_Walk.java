package PCCE.TEST;

import java.util.Scanner;

//[PCCE 기출문제] : 5번/산책
public class Question5_Walk {
	public int[] solution(String route) {
		/*
		 * 빈칸채우기 문제
		 * 
		 */
		
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                	north++;
                    break;
                case 'S':
                	north--;
                    break;
                case 'E':
                	east++;
                    break;
                case 'W':
                	east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}