package PCCP.TEST;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

//[PCCP 기출문제] : 2번/석유 시추
public class Question2_OilDrilling {
		/*
		 * 세로길이가 n 가로길이가 m인 격자 모양의 땅 속에서 석유가 발견되었습니다.
		 * 석유는 여러 덩어리로 나누어 묻혀있습니다. 
		 * 당신이 시추관을 수직으로 단 하나만 뚫을 수 있을 때, 가장 많은 석유를 뽑을 수 있는 시추관의 위치를 찾으려고 합니다. 
		 * 시추관은 열 하나를 관통하는 형태여야 하며, 열과 열 사이에 시추관을 뚫을 수 없습니다.
		 * 
		 * 예를 들어 가로가 8, 세로가 5인 격자 모양의 땅 속에 위 그림처럼 석유가 발견되었다고 가정하겠습니다. 
		 * 상, 하, 좌, 우로 연결된 석유는 하나의 덩어리이며, 석유 덩어리의 크기는 덩어리에 포함된 칸의 수입니다.
		 *  
		 * 석유가 묻힌 땅과 석유 덩어리를 나타내는 2차원 정수 배열 land가 매개변수로 주어집니다. 
		 * 이때 시추관 하나를 설치해 뽑을 수 있는 가장 많은 석유량을 return 하도록 solution 함수를 완성해 주세요.
		 */
		
	static int rSize, cSize;
    static int[][] fragments;
    static int fragmentIdx = 1;
    static Map<Integer, Integer> fragmentsInfo = new HashMap<>();
    static boolean[][] visited;
    static int[] dirR = {-1, 1, 0, 0};
    static int[] dirC = {0, 0, -1, 1};
	
    public int solution(int[][] land) {
    	int answer = 0;
        rSize = land.length;
        cSize = land[0].length;
        fragments = new int[rSize][cSize];
        visited = new boolean[rSize][cSize];

        for (int r = 0; r < rSize; r++) {
            for (int c = 0; c < cSize; c++) {
                if (visited[r][c] || land[r][c] == 0) {
                    continue;
                }

                initFragment(land, r, c);
            }
        }

        for (int c = 0; c < cSize; c++) {
            Set<Integer> fragmentTypes = new HashSet<>();
            int tmpMaxAmount = 0;
            for (int r = 0; r < rSize; r++) {
                if (fragments[r][c] > 0) {
                    fragmentTypes.add(fragments[r][c]);
                }
            }

            for (Integer frg : fragmentTypes) {
                tmpMaxAmount += fragmentsInfo.get(frg);
            }

            answer = Math.max(answer, tmpMaxAmount);
        }

        return answer;
    }

    static void initFragment(int[][] land, int r, int c) {
        visited[r][c] = true;
        fragments[r][c] = fragmentIdx;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c});
        int size = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            size++;

            for (int d = 0; d < 4; d++) {
                int nxtR = cur[0] + dirR[d];
                int nxtC = cur[1] + dirC[d];

                if (nxtR < 0 || nxtR >= rSize || nxtC < 0 || nxtC >= cSize || visited[nxtR][nxtC]
                        || land[nxtR][nxtC] == 0) {
                    continue;
                }

                visited[nxtR][nxtC] = true;
                fragments[nxtR][nxtC] = fragmentIdx;
                q.add(new int[]{nxtR, nxtC});
            }
        }

        fragmentsInfo.put(fragmentIdx++, size);
    }
}