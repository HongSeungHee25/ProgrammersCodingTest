package Test.Lv0;

//코딩 테스트 : Lv.0 점의 위치 구하기 - 정답률 89%
public class FindingTheLocationOfPoint {
	
	public int findQuadrant(int[] dot) {
        // x와 y 좌표를 추출
        int x = dot[0];
        int y = dot[1];

        // 사분면 판별
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            // (0, 0)의 경우에는 어느 사분면에도 속하지 않음
            return 0;
        }
    }

	public static void main(String[] args) {
		
		/*
		 * 사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 
		 * 사분면은 아래와 같이 1부터 4까지 번호를매깁니다.
		 * 
		 * - x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
		 * - x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
		 * - x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
		 * - x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
		 * 
		 */
		
		
		System.out.println("[문제 Lv.0 : 점의 위치 구하기(정답률 89%)]");
		FindingTheLocationOfPoint solution = new FindingTheLocationOfPoint();
        int[] dot1 = {3, 5}; // 예시 좌표
        int[] dot2 = {-2, 4}; // 예시 좌표

        System.out.println("점 (3, 5)는 " + solution.findQuadrant(dot1) + "사분면에 속합니다.");
        System.out.println("점 (-2, 4)는 " + solution.findQuadrant(dot2) + "사분면에 속합니다.");

	}

}
