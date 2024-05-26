package Praktikum02;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class no06 {

    public static void main(String[] args) {
        try {
            // Membaca File
            String namaFile = "src/Praktikum02/transkrip.csv";
            File file = new File(namaFile);
            Scanner scanner = new Scanner(file);

            // Membuat ArrayList
            ArrayList arrayList = new ArrayList<>();

            // Mencetak File
            scanner.nextLine(); // Melangkahi 1 Baris
            while (scanner.hasNextLine()) {
                String baris = scanner.nextLine();
                String[] kolom = baris.split(";");
                String kode = kolom[0];
                String nama = kolom[1];
                int sks = Integer.parseInt(kolom[2]);
                String nilai = kolom[3];
                MataKuliah mataKuliah = new MataKuliah(kode, nama, sks, nilai);
                arrayList.add(mataKuliah);
                System.out.println(mataKuliah.kodeMK + " | " + mataKuliah.mataKuliah + " | " + mataKuliah.sks + " | " + mataKuliah.nilai);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}