package Praktikum02;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class no07 {

    public ArrayList<MataKuliah> arrayList;
    public String namaFile = "src/Pratikum02/transkrip.csv";

    public ArrayList<MataKuliah> open() {
        try {
            File file = new File(namaFile);
            Scanner scanner = new Scanner(file);

            arrayList = new ArrayList<>();

            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String baris = scanner.nextLine();
                String[] kolom = baris.split(";");
                String kode = kolom[0];
                String nama = kolom[1];
                int sks = Integer.parseInt(kolom[2]);
                String nilai = kolom[3];
                MataKuliah mataKuliah = new MataKuliah(kode, nama, sks, nilai);
                arrayList.add(mataKuliah);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public String toString() {
        if (arrayList != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("KODE MK | MATAKULIAH | SKS | NILAI\n");
            for (MataKuliah mk : arrayList) {
                stringBuffer.append(mk.kodeMK + " | " + mk.mataKuliah + " | " + mk.sks + " | " + mk.nilai + "\n");

            }
            return stringBuffer.toString();
        } else {
            return "[]";
        }
    }

    public void print() {
        System.out.println(toString());
    }

    public boolean insert(String kodeMK, String mataKuliah, int sks, String nilai) {
        boolean cek = false;
        try {
            MataKuliah mk = new MataKuliah(kodeMK, mataKuliah, sks, nilai);
            arrayList.add(mk);
            cek = true;
        } catch (Exception e) {
            cek = false;
        }
        return cek;
    }
    public boolean update(int index , String kodeMK, String mataKuliah, int sks, String nilai) {
        boolean cek = false;
        try {
            MataKuliah mk = new MataKuliah(kodeMK, mataKuliah, sks, nilai);
            arrayList.add(mk);
            cek = true;
        } catch (Exception e) {
            cek = false;
        }
        return cek;
    }

    public static void main(String[] args) {
        no07 n7 = new no07();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("----------------------");
            System.out.println("Pilih : ");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. ToString");
            System.out.println("5. SetFile");
            System.out.println("6. Reset");
            System.out.println("7. Open");
            System.out.println("8. SaveToFile");
            System.out.println("0. Keluar");
            System.out.println("----------------------");
            System.out.print("Pilihan : ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("INSERT");
                    System.out.print("Kode MK       :  ");
                    scanner.nextLine();
                    String kode = scanner.nextLine();
                    System.out.print("Mata Kuliah   :  ");
                    String nama = scanner.nextLine();
                    System.out.print("SKS           :  ");
                    int sks = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nilai         :  ");
                    String nilai = scanner.nextLine();
                    boolean status = n7.insert(kode, nama, sks, nilai);
                    if (status) {
                        System.out.println("Insert Berhasil");
                    } else {
                        System.out.println("Insert Gagal");
                    }
                    break;
                case 2:
                    System.out.println("UPDATE");

                    break;
                case 3:
                    System.out.println("DELETE");
                    break;
                case 4:
                    System.out.println("TO STRING");
                    n7.print();
                    break;
                case 5:
                    System.out.println("SET FILE");
                    break;
                case 6:
                    System.out.println("RESET");
                    n7.arrayList.clear();
                    break;
                case 7:
                    System.out.println("OPEN");
                    n7.open();
                    break;
                case 8:
                    System.out.println("SAVE TO FILE");
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    break;
                default:
            }
        } while (pilihan != 0);

    }
}
