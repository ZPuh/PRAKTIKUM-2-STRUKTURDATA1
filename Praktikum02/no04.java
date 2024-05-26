package Praktikum02;

import java.util.ArrayList;

public class no04 {

    public static void main(String[] args) {
        ArrayList<Double> data = new ArrayList<>();
        data.add(91.35);
        data.add(4.72);
        data.add(26.0);
        data.add(3.5);
        data.add(8.0);
        data.add(61.0);
        data.add(65.36);
        data.add(12.0);
        data.add(5.6);
        data.add(7.11);

        data.add(27.0);
        data.add(9.53);
        data.add(549.0);
        data.add(2.23);
        data.add(17.31);
        data.add(4.25);
        data.add(2.13);
        data.add(83.0);
        data.add(7.0);
        data.add(102.4);

        data.add(53.21);
        data.add(3.42);
        data.add(0.21);
        data.add(70.02);
        data.add(819.4);
        data.add(6173.0);
        data.add(4.25);
        data.add(19.8);
        data.add(17.35);
        data.add(5.768);
        System.out.println("DATA : \n" + data);
        double min = data.get(0);
        double max = data.get(0);
        double sum = 0.0;

        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i);
            if (min > data.get(i)) {
                min = data.get(i);
            }
            if (max < data.get(i)) {
                max = data.get(i);
            }
        }
        System.out.println("\nMIN : " + min);
        System.out.println("MAX : " + max);
        System.out.println("SUM : " + sum);
        System.out.println("AVR : " + sum / data.size());

    }

}
