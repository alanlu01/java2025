package ntou.cs.java2025;

import java.util.Random;

public class Player {
    private long hp;
    private int attackPoints;
    private static final Random random = new Random();

    // 無參數建構子
    public Player() {
        this.hp = 9000000000L + (long) (random.nextFloat() * (1000000000L));  // 9,000,000,000 ~ 10,000,000,000
        this.attackPoints = 100000000 + (int) (random.nextFloat() * (100000000)); // 100,000,000 ~ 200,000,000
    }

    // 取得血量
    public long getHp() {
        return hp;
    }

    // 取得攻擊力
    public int getAttackPoints() {
        return attackPoints;
    }

    // 設定血量，確保不會低於 0
    public void setHp(long newHp) {
        this.hp = Math.max(newHp, 0);
    }

    // 攻擊對手
    public void attack(Player enemy) {
        enemy.setHp(enemy.getHp() - this.attackPoints);
    }
}