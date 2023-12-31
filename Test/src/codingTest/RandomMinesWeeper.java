package codingTest;

import java.util.Random;

public class RandomMinesWeeper {
	 private static final int SIZE = 5; // 보드의 크기를 정의하는 상수
	    private char[][] board = new char[SIZE][SIZE]; // 게임 보드 배열
	    private boolean[][] mines = new boolean[SIZE][SIZE]; // 지뢰의 위치를 저장하는 배열

	    public RandomMinesWeeper() {
	        // 보드 초기화
	        for (int i = 0; i < SIZE; i++) {
	            for (int j = 0; j < SIZE; j++) {
	                board[i][j] = '_'; // 모든 칸을 빈 칸('_')으로 초기화
	                mines[i][j] = false; // 지뢰가 없음으로 초기화
	            }
	        }

	        // 지뢰 무작위 배치
	        Random random = new Random();
	        int mineCount = 5; // 지뢰의 수
	        for (int i = 0; i < mineCount; i++) {
	            int x, y;
	            do {
	                x = random.nextInt(SIZE);
	                y = random.nextInt(SIZE);
	            } while (mines[x][y]); // 이미 지뢰가 있는 위치라면 다시 뽑기
	            mines[x][y] = true; // 지뢰 배치
	        }
	    }

	    public void printBoard() {
	        // 보드 출력
	        for (int i = 0; i < SIZE; i++) {
	            for (int j = 0; j < SIZE; j++) {
	                if (mines[i][j]) {
	                    System.out.print('M' + " "); // 지뢰가 있는 경우 'M'으로 표시
	                } else {
	                    System.out.print(countAdjacentMines(i, j) + " "); // 주변 지뢰 수 출력
	                }
	            }
	            System.out.println();
	        }
	    }

	    private int countAdjacentMines(int row, int col) {
	        // 주변 지뢰 수 계산
	        int count = 0;
	        for (int i = row - 1; i <= row + 1; i++) {
	            for (int j = col - 1; j <= col + 1; j++) {
	                if (i >= 0 && i < SIZE && j >= 0 && j < SIZE && mines[i][j]) {
	                    count++; // 지뢰가 있는 경우 카운트 증가
	                }
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	    	RandomMinesWeeper game = new RandomMinesWeeper(); // 게임 인스턴스 생성
	        game.printBoard(); // 보드 출력
	    }
	}