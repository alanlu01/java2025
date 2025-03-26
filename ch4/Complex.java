package ntou.cs.java2025;

import java.security.SecureRandom;
import java.text.DecimalFormat;

public class Complex {
    private double real;
    private double imaginary;
    
    // 建構子：設定實部與虛部
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // 無參數建構子：使用 SecureRandom 產生 0~1 的隨機正數
    public Complex() {
        SecureRandom random = new SecureRandom();
        this.real = random.nextDouble();
        this.imaginary = random.nextDouble();
    }
    
    // 加法：this + other
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
    
    // 減法：this - other
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }
    
    // 乘法：this × other
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }
    
    // toString 方法：顯示至小數點後兩位，格式 a + bi 或 a - bi
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String realStr = df.format(real);
        String imaginaryStr = df.format(Math.abs(imaginary));
        String sign = (imaginary >= 0) ? " + " : " - ";
        return realStr + sign + imaginaryStr + "i";
    }
}