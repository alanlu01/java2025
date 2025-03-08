package ntou.cs.java2025;

public class BMICalculator
{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Welcome to the BMI (Body Mass Index) calculator");
        System.out.print("Please enter your weight (kilograms): ");
        double weight = sc.nextDouble();
        System.out.print("Please enter your height (centimeters): ");
        double height = sc.nextDouble();
        double bmi = weight / Math.pow(height / 100, 2);
        System.out.printf("Your BMI is %.1f ", bmi);
        if (bmi < 18.5) {
            System.out.println("(Underweight)");
        } else if (bmi < 25) {
            System.out.println("(Normal)");
        } else if (bmi < 30) {
            System.out.println("(Overweight)");
        } else {
            System.out.println("(Obese)");
        }
        sc.close();
    }
}