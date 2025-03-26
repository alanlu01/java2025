package ntou.cs.java2025;

public class ComplexNumberCalculator {

    // 計算給定二維 Complex 陣列的「行加總」後乘積
    public static Complex calculate(Complex[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Input matrix cannot be null or empty");
        }
        
        Complex result = null;
        
        // 對每一行計算所有元素的加總，再將各行加總結果相乘
        for (int i = 0; i < matrix.length; i++) {
            // 假設每一列都有至少一個元素
            Complex rowSum = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                rowSum = rowSum.add(matrix[i][j]);
            }
            
            if (result == null) {
                result = rowSum;
            } else {
                result = result.multiply(rowSum);
            }
        }
        return result;
    }
}