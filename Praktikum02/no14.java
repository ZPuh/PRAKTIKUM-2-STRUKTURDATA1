package Praktikum02;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class no14 {

    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        try {
            String namaFile = "src/Praktikum02/newfile.txt";
            File file = new File(namaFile);
            Scanner scanner = new Scanner(file);

            //scanner.nextLine();
            while (scanner.hasNext()) {
                arraylist.add(scanner.nextLine());
            }
        } catch (Exception e) {
        }
        for (String value : arraylist) {
            System.out.println(value);
        }
    }

}