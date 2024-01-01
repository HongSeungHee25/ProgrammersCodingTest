package codingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Mines extends JFrame implements ActionListener {
    private static final int SIZE = 5;
    private JButton[][] buttons = new JButton[SIZE][SIZE];
    private boolean[][] mines = new boolean[SIZE][SIZE];
    private boolean gameOver = false; // 게임 종료 여부

    public Mines() {
        setTitle("Minesweeper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(SIZE, SIZE));

        // 랜덤 폭탄 배치
        placeMines();

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setPreferredSize(new Dimension(50, 50));
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 20)); // 폰트 설정
                buttons[i][j].addActionListener(this);
                add(buttons[i][j]);
            }
        }

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void placeMines() {
        Random random = new Random();
        int mineCount = 5; // 폭탄의 수 (원하는 수로 변경 가능)
        int count = 0;
        while (count < mineCount) {
            int x = random.nextInt(SIZE);
            int y = random.nextInt(SIZE);
            if (!mines[x][y]) {
                mines[x][y] = true;
                count++;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (gameOver) return; // 게임이 종료되었다면 동작하지 않음

        JButton clickedButton = (JButton) e.getSource();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (buttons[i][j] == clickedButton) {
                    if (mines[i][j]) {
                        showMines(); // 폭탄을 찾았을 때 게임 종료 후 폭탄 위치를 모두 보여줌
                        gameOver = true; // 게임 종료 처리
                    } else {
                        int adjacentMines = countAdjacentMines(i, j);
                        if (adjacentMines > 0) {
                            // 숫자에 따라 배경색 변경
                            switch (adjacentMines) {
                                case 1:
                                    buttons[i][j].setForeground(Color.BLACK);
                                    break;
                                case 2:
                                    buttons[i][j].setForeground(Color.BLUE);
                                    break;
                                case 3:
                                    buttons[i][j].setForeground(Color.GREEN);
                                    break;
                                default:
                                    break;
                            }
                            clickedButton.setText(Integer.toString(adjacentMines));
                        }
                        clickedButton.setEnabled(false); // 클릭된 버튼 비활성화
                    }
                }
            }
        }
    }

    private void showMines() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (mines[i][j]) {
                    buttons[i][j].setText("💣");
                    buttons[i][j].setForeground(Color.RED); // 폭탄은 빨간색으로 표시
                    buttons[i][j].setEnabled(false);
                }
            }
        }
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < SIZE && j >= 0 && j < SIZE && mines[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Mines();
        });
    }
}
