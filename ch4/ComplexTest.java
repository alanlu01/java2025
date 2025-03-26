package ntou.cs.java2025;
public class ComplexTest {

    public static void main(String[] args) {
        Complex a = new Complex(1.1, 2.2);
        Complex b = new Complex(3.3, -4.4);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a + b = " + a.add(b));
        System.out.println("a - b = " + a.subtract(b));
        System.out.println("a × b = " + a.multiply(b));

        System.out.println();

        Complex c = new Complex();
        Complex d = new Complex();

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println("c + d = " + c.add(d));
        System.out.println("c - d = " + c.subtract(d));
        System.out.println("c × d = " + c.multiply(d));

        System.out.println();

        Complex[][] matrix1 = {
                {a, b},
                {new Complex(0, -1.1), new Complex(-2.2, 3.3)}
        };

        Complex result1 = ComplexNumberCalculator.calculate(matrix1);
        System.out.println("Simulation result: " + result1);

        Complex[][] matrix2 = {};
        try {
            Complex result2 = ComplexNumberCalculator.calculate(matrix2);
            System.out.println("Simulation result: " + result2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }

}