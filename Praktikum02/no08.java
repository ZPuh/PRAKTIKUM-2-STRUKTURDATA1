package Praktikum02;

import java.io.File;
import java.util.Scanner;

class mahasiswa {

    String KodeMK;
    String Matakuliah;
    int SKS;
    String Nilai;
}

public class no08 {

    public static void main(String[] args) {
        mahasiswa ms = new mahasiswa();
        try {
            String namaFile = "src/Pratikum02/transkrip.json";
            File file = new File(namaFile);
            Scanner scanner = new Scanner(file);

            mahasiswa[][] array;
            while (scanner.hasNextLine()) {
                String baris = scanner.nextLine();
                String[] kolom = baris.split(";");
                String kode = kolom[0];
                String nama = kolom[1];
                int sks = Integer.parseInt(kolom[2]);
                String nilai = kolom[3];
                MataKuliah mataKuliah = new MataKuliah(kode, nama, sks, nilai);
                
                System.out.println(mataKuliah.kodeMK + " | " + mataKuliah.mataKuliah + " | " + mataKuliah.sks + " | " + mataKuliah.nilai);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
