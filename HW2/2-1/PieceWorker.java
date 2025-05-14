package ntou.cs.java2025;
import java.util.Scanner;

public class PieceWorker extends Employee {
    private int wage;
    private int piece;

    @Override
    public void inputData(Scanner input) {
        System.out.print("Please input wage: ");
        wage = input.nextInt();
        System.out.print("Please input piece: ");
        piece = input.nextInt();
    }

    @Override
    public int getEarnings() {
        return wage * piece;
    }

    public int getWage() {
        return wage;
    }

    public int getPiece() {
        return piece;
    }
}
