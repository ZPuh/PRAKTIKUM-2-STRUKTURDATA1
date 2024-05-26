package Praktikum02;

import java.util.Arrays;

public class no11 {

    public static void main(String[] args) {
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

        for (int[][] array2d : arrayRGB) {
            for (int[] array1d : array2d) {
                for (int print : array1d) {
                    System.out.print(print + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }

    }

}