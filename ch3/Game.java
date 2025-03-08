package ntou.cs.java2025;

public class Game {
    public static void main(String[] args) {
        // 創建兩名玩家
        Player player1 = new Player();
        Player player2 = new Player();

        // 顯示初始 HP 和 攻擊力
        System.out.printf("Player1 -> HP: %,d, attack points: %,d%n", player1.getHp(), player1.getAttackPoints());
        System.out.printf("Player2 -> HP: %,d, attack points: %,d%n", player2.getHp(), player2.getAttackPoints());

        int round = 1;
        while (true) {
            System.out.println("\n=== Round " + round + " ===");

            // 玩家 1 攻擊
            player1.attack(player2);
            System.out.printf("Player1 attacks! Player2's HP becomes %,d%n", player2.getHp());

            // 判斷玩家 2 是否死亡
            if (player2.getHp() <= 0) {
                System.out.println("\n🎉 Player1 wins! 🎉");
                break;
            }

            // 玩家 2 攻擊
            player2.attack(player1);
            System.out.printf("Player2 attacks! Player1's HP becomes %,d%n", player1.getHp());

            // 判斷玩家 1 是否死亡
            if (player1.getHp() <= 0) {
                System.out.println("\n🎉 Player2 wins! 🎉");
                break;
            }

            round++;
        }
    }
}
// run:java ntou.cs.java2025.Game