package ntou.cs.java2025;
import java.util.Scanner;

public class PokerGameTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PokerGame game = new PokerGame();  // 先建立一副新牌

        while (true) {
            System.out.print("Please input your choice (0: quit, 1: play, 2: restart, 3: repeat): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Game over!!");
                break;
            } else if (choice == 1) {
                game.dealFiveCards();
            } else if (choice == 2) {
                // 重新建立一副新牌 (洗過)
                game = new PokerGame();
                game.dealFiveCards();
            } else if (choice == 3) {
                // 用複製建構子，指向同一個 deck，但重設指標
                game = new PokerGame(game);
                game.dealFiveCards();
            } else {
                // 看你的需求，可加可不加
                // 不在範例輸出中，所以通常可以省略
                System.out.println("Invalid choice, please try again.\n");
            }
        }
        sc.close();
    }
}