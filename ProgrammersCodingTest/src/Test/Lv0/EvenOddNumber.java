package Test.Lv0;

//코딩 테스트 : Lv.0 짝수 홀수 개수 - 정답률 89%
public class EvenOddNumber {
	
	public int[] solution(int[] num_list) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] answer = {evenCount, oddCount};
        return answer;
    }
	
	public static void main(String[] args) {
		
		/*
		 * 정수가 담긴 리스트 num_list가 주어질 때, 
		 * num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		 * 
		 * 제한사항
		 * - 1 ≤ num_list의 길이 ≤ 100
		 * - 0 ≤ num_list의 원소 ≤ 1,000
		 * 
		 */
		
		
		System.out.println("[문제 Lv.0 : 짝수 홀수 개수(정답률 89%)]");
		
		int[] numbers = {1, 2, 3, 4, 5, 6};
		EvenOddNumber solution = new EvenOddNumber();
        int[] result = solution.solution(numbers);

        System.out.println("짝수의 개수: " + result[0]);
        System.out.println("홀수의 개수: " + result[1]);

	}

}
