package Praktikum02;

import java.util.Scanner;

public class no13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arrayRGB = {
            {
                {2, 7, 243, 28}, // Channel_R
                {6, 8, 9, 68},
                {92, 126, 211, 255},
                {0, 4, 83, 38}
            },
            {
                {8, 3, 254, 4}, // Channel_G
                {1, 9, 21, 32},
                {92, 42, 12, 6},
                {5, 2, 7, 58}
            },
            {
                {6, 5, 253, 3}, // Channel_B
                {2, 1, 3, 5},
                {7, 9, 11, 13},
                {15, 17, 19, 21}
            }
        };

        System.out.println("ARRAY RGB : ");
        for (int[][] array2d : arrayRGB) {
            for (int[] array1d : array2d) {
                for (int print : array1d) {
                    System.out.print(print + "\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }

        int[][] arrayGrayscale = new int[4][4];
        for (int i = 0; i < arrayGrayscale.length; i++) {
            for (int j = 0; j < arrayGrayscale[i].length; j++) {
                int r = arrayRGB[0][i][j];
                int g = arrayRGB[1][i][j];
                int b = arrayRGB[2][i][j];
                arrayGrayscale[i][j] = (int) Math.round((r + g + b) / 3.0);
            }
        }
        System.out.println("ARRAY GRAYSCALE :");
        for (int[] array1d : arrayGrayscale) {
            for (int array : array1d) {
                System.out.print(array + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        int[][] arrayBiner = new int[4][4];
        System.out.println("ARRAY BINER : ");
        System.out.print("threshold : ");
        int threshold = sc.nextInt();
        for (int i = 0; i < arrayBiner.length; i++) {
            for (int j = 0; j < arrayBiner[i].length; j++) {
                if (threshold <= arrayGrayscale[i][j]) {
                    arrayBiner[i][j] = 1;
                } else {
                    arrayBiner[i][j] = 0;
                }
            }
        }
        for (int[] array1d : arrayBiner) {
            for (int array : array1d) {
                System.out.print(array + "\t");
            }
            System.out.println("");
        }
    }
}