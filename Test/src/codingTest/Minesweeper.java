package codingTest;

public class Minesweeper {
	
    private static final int SIZE = 5; 				// 보드의 크기를 정의하는 상수 
    private char[][] board = new char[SIZE][SIZE]; 	// 게임 보드 배열 5*5
    private char[][] mines = {						// 고정된 지뢰 위치 배열
        {'.', '*', '.', '.', '.'},
        {'.', '.', '.', '*', '.'},
        {'.', '.', '*', '.', '.'},
        {'.', '.', '.', '.', '*'},
        {'.', '*', '.', '.', '.'}
    }; 

    // 생성자
    public Minesweeper() {
    	// board 배열을 초기화하여 빈 칸 설정
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '_'; 
            }
        }
    }

    // 지뢰찾기 보드 출력 메서드
    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (mines[i][j] == '*') {
                    System.out.print('*' + " "); 			  // 지뢰는 * 으로 출력
                } else {
                    System.out.print(countMines(i, j) + " "); // 주변 지뢰의 수를 계산하여 출력(countMines 메서드 호출)
                }
            }
            System.out.println();	
        }
    }

    // 주변 지뢰 수 계산 메서드
    private int countMines(int row, int col) {
    	// 현재 위치를 기준으로 주변 8방향(상하좌우, 대각선)을 확인 후, 지뢰가 있으면 주변 지뢰의 수를 카운트
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < SIZE && j >= 0 && j < SIZE && mines[i][j] == '*') {
                    count++; // 지뢰가 있는 경우 카운트 증가
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Minesweeper mine = new Minesweeper(); // 해당 클래스 객체 생성
        mine.printBoard(); 					  // 지뢰찾기 보드 출력 메서드 호출
    }
}
