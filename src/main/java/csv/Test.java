package csv;

public class Test {
    public static void main(String[] args) {
        String filename = "matrixs/sincos_4_6.csv";
        double[][] matrix = CSV.fromCSV(filename);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
