package Praktikum02;

public class no01 {

    public static void main(String[] args) {
        double[][] data = {
            {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11},
            {27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4},
            {53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768}
        };

        double min = data[0][0];
        double max = data[0][0];
        double sum = 0;

        System.out.println("Data : ");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
                sum += data[i][j];
                if (min > data[i][j]) {
                    min = data[i][j];
                }
                if (max < data[i][j]) {
                    max = data[i][j];
                }
            }
            System.out.println("");
        }

        System.out.println("\nMIN : " + min);
        System.out.println("MAX : " + max);
        System.out.println("SUM : " + sum);
        System.out.println("AVR : " + sum / data.length);

    }

}