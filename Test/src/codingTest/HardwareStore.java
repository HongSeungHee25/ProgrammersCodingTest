package codingTest;

import java.util.HashSet;
import java.util.Scanner;

public class HardwareStore {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("가게의 부품 개수를 입력하세요: ");
	        int n = scanner.nextInt();
	        int[] storeParts = new int[n];
	        System.out.println("가게의 부품 번호를 입력하세요: ");
	        for (int i = 0; i < n; i++) {
	            storeParts[i] = scanner.nextInt();
	        }

	        System.out.print("손님이 요청한 부품 종류 수를 입력하세요: ");
	        int m = scanner.nextInt();
	        int[] customerParts = new int[m];
	        System.out.println("손님이 요청한 부품 번호를 입력하세요: ");
	        for (int i = 0; i < m; i++) {
	            customerParts[i] = scanner.nextInt();
	        }

	        HashSet<Integer> storeSet = new HashSet<>();

	        // 가게의 부품 번호를 HashSet에 추가
	        for (int part : storeParts) {
	            storeSet.add(part);
	        }

	        // 손님이 요청한 부품 번호를 하나씩 확인하여 가게에 있는지 여부를 출력
	        for (int part : customerParts) {
	            if (storeSet.contains(part)) {
	                System.out.println("yes");
	            } else {
	                System.out.println("no");
	            }
	        }

	        scanner.close();
	    }
	}