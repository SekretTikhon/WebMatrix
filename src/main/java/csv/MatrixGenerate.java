package csv;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MatrixGenerate {

    public static void main(String[] args) {
        String filename = "matrixs/sincos_4_6.csv";
        int n = 4, m = 6;
        double[][] matrix = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Math.sin(i) * Math.cos(j);
            }
        }
        CSV.toCSV(matrix, n, m, filename);

    }
}
