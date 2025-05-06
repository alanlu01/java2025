package ntou.cs.java2023.t1.chianyih;

import java.util.Scanner;

class Sales {
    Scanner input = new Scanner(System.in);
    int[] money = new int[5];
    int[] price = { 0, 100, 200, 500, 1000 };
    int sum = 0;

    public void calculateSales() {
        while (true) {
            System.out.printf("([1]-[4])\n");
            int num = input.nextInt();
            if (num == 0)
                break;
            else {
                System.out.println("Please input the quantity:");
                int salesNum = input.nextInt();
                money[num] += salesNum * price[num];
            }
        }
        for (int i = 1; i < 5; i++) {
            System.out.printf("Product#%,d:  $%,d\n", i, money[i]);
            sum += money[i];
        }
        System.out.printf("Total amount: $%,d\n", sum);
    }
}