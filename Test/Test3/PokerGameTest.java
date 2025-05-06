package ntou.cs.java2023.t3.chianyih;
import java.util.Scanner;

public class PokerGameTest {
	public static void main(String[] args) {
		PokerGame game = new PokerGame();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input your choice (0: quit, 1: play, 2: restart): ");
		int choice = input.nextInt();

		while (choice != 0) {
			if (choice == 2) {
				game = new PokerGame();
				game.dealFiveCards();
			} else if (choice == 1) {
				game.dealFiveCards();
			}
			System.out.print("Please input your choice (0: quit, 1: play, 2: restart): ");
			choice = input.nextInt();
		}
		System.out.print("Game over!!");
		input.close();
	}
} // end class PokerGame
