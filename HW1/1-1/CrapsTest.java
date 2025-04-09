package ntou.cs.java2025;
// CrapsTest.java
// 模擬1000場Craps遊戲並分析結果
//01257117呂翰昇

public class CrapsTest {
    public static void main(String[] args) {
        // 創建兩個陣列來記錄每次擲骰子的獲勝和失敗次數
        // 索引0未使用，索引1代表第一次擲骰子，依此類推
        // 索引21代表第21次及之後的擲骰子
        int[] winsAtRoll = new int[22]; 
        int[] lossesAtRoll = new int[22];
        
        int totalGames = 1000;
        int totalRolls = 0; // 用於計算平均遊戲長度
        int gamesWon = 0; // 用於計算勝率
        
        System.out.println("模擬1000場Craps遊戲...\n");
        
        // 進行1000場遊戲
        for (int i = 0; i < totalGames; i++) {
            Craps.GameResult result = Craps.playCraps();
            
            // 更新統計數據
            totalRolls += result.rolls;
            
            if (result.won) {
                gamesWon++;
                // 記錄在第幾次擲骰子獲勝
                if (result.rolls <= 20) {
                    winsAtRoll[result.rolls]++;
                } else {
                    winsAtRoll[21]++; // 超過20次放在索引21
                }
            } else {
                // 記錄在第幾次擲骰子失敗
                if (result.rolls <= 20) {
                    lossesAtRoll[result.rolls]++;
                } else {
                    lossesAtRoll[21]++; // 超過20次放在索引21
                }
            }
            
            // 每100場遊戲顯示進度
            if ((i + 1) % 100 == 0) {
                System.out.printf("已完成 %d 場遊戲\n", i + 1);
            }
        }
        
        System.out.println("\n結果統計:");
        
        // 顯示每次擲骰子的獲勝和失敗次數
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d games won and %d games lost on roll #%d\n", 
                winsAtRoll[i], lossesAtRoll[i], i);
        }
        
        // 顯示第20次以後的結果
        System.out.printf("%d games won and %d games lost on rolls after the 20th roll\n", 
            winsAtRoll[21], lossesAtRoll[21]);
        
        // 計算並顯示勝率
        double winningPercentage = (double) gamesWon / totalGames * 100;
        System.out.printf("\nThe chances of winning are %d / %d = %.2f%%\n", 
            gamesWon, totalGames, winningPercentage);
        
        // 計算並顯示平均遊戲長度
        double averageGameLength = (double) totalRolls / totalGames;
        System.out.printf("The average game length is %.2f rolls.\n", 
            averageGameLength);
    }
}
