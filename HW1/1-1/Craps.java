package ntou.cs.java2025;
import java.security.SecureRandom;

public class Craps {
   // 建立 SecureRandom 物件供 rollDice 方法使用
   private static final SecureRandom randomNumbers = new SecureRandom();

   // 列舉類型，用來表示遊戲狀態
   private enum Status { CONTINUE, WON, LOST };

   // 骰子點數常數
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;

   // 主程式，模擬 1000 局遊戲
   public static void main(String[] args) {
      final int TOTAL_GAMES = 1000;
      // 利用陣列記錄各局遊戲擲骰次數的結果：
      // index 1~20 分別代表遊戲在第 1 至第 20 擲骰時結束，
      // index 21 則代表擲骰超過 20 次的遊戲
      int[] winsByRoll = new int[22];
      int[] lossesByRoll = new int[22];

      int totalWins = 0;   // 總獲勝局數
      int totalRolls = 0;  // 總擲骰次數

      // 模擬每一局遊戲
      for (int game = 0; game < TOTAL_GAMES; game++) {
         int myPoint = 0;  // 當首擲無勝負時，作為「點數」
         Status gameStatus; // 遊戲狀態
         int rollCount = 0; // 該局遊戲的擲骰次數

         int sumOfDice = rollDice(); // 第一次擲骰
         rollCount++;

         // 根據第一次擲骰的結果決定遊戲狀態
         switch (sumOfDice) {
            case SEVEN:      // 擲出 7 即獲勝
            case YO_LEVEN:   // 擲出 11 即獲勝
               gameStatus = Status.WON;
               break;
            case SNAKE_EYES: // 擲出 2 即失敗
            case TREY:       // 擲出 3 即失敗
            case BOX_CARS:   // 擲出 12 即失敗
               gameStatus = Status.LOST;
               break;
            default:         // 其他點數則建立「點數」並進入持續遊戲狀態
               gameStatus = Status.CONTINUE;
               myPoint = sumOfDice;
               // 保留原程式顯示 "Point is ..." 的輸出
               System.out.printf("Point is %d%n", myPoint);
               break;
         }

         // 當遊戲進入持續狀態時，不斷擲骰直到獲勝或失敗
         while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();
            rollCount++;
            if (sumOfDice == myPoint)
               gameStatus = Status.WON;
            else if (sumOfDice == SEVEN)
               gameStatus = Status.LOST;
         }

         // 統計該局遊戲的擲骰次數
         totalRolls += rollCount;
         // 如果擲骰次數在 20 次以內，就記錄該次數；超過 20 次的記錄在 index 21
         int index = (rollCount <= 20) ? rollCount : 21;
         if (gameStatus == Status.WON) {
            winsByRoll[index]++;
            totalWins++;
         } else {
            lossesByRoll[index]++;
         }
      }

      // 印出各擲骰次數（1~20）的獲勝與失敗統計
      for (int roll = 1; roll <= 20; roll++) {
         System.out.printf("%d games won and %d games lost on roll #%d%n",
                           winsByRoll[roll], lossesByRoll[roll], roll);
      }
      // 印出超過 20 次擲骰的統計
      System.out.printf("%d games won and %d games lost on rolls after the 20th roll%n",
                        winsByRoll[21], lossesByRoll[21]);

      // 計算並印出獲勝機率與平均每局遊戲的擲骰次數
      System.out.printf("The chances of winning are %d / %d = %.2f%%%n",
                        totalWins, TOTAL_GAMES, 100.0 * totalWins / TOTAL_GAMES);
      System.out.printf("The average game length is %.2f rolls.%n",
                        (double) totalRolls / TOTAL_GAMES);
   }

   // rollDice 方法：擲兩顆骰子，計算並回傳點數總和，並保留原本輸出的顯示
   public static int rollDice() {
      int die1 = 1 + randomNumbers.nextInt(6); // 第一顆骰子
      int die2 = 1 + randomNumbers.nextInt(6); // 第二顆骰子
      int sum = die1 + die2; // 點數和

      // 顯示每次擲骰的結果，與原本程式一致
      System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

      return sum;
   }
}