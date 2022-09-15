/*-----------------------------------
Challenge Chapter 1
Nama  : Muhammad Leon Alfahrezi
Kelas : Back End Java B
------------------------------------*/

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        double p, l, t, a, r, s, hasil; //deklarasi variabel komponen bidang untuk menghitung luas dan volume
        final double phi = 3.14; //nilai phi dengan final menunjukkan nilai tidak berubah (akhir)
        String memilih, pilihanSatu, pilihanDua; //deklarasi untuk kondisional switch case nanti
        Scanner input = new Scanner(System.in); //untuk input nilai

        //menggunakan boolean untuk memanfaatkan perulangan do while
        boolean loop = false; //loop = false agar pemeriksaan kondisi di akhir dapat dijalankan dengan bernilai true
        do {

            //pembuatan menu
            System.out.println("\n--------------------------------------\nKalkulator Penghitung Luas dan Volume\n--------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Hitung Luas Bidang");
            System.out.println("2. Hitung Volume");
            System.out.println("0. Tutup Aplikasi");
            System.out.println("--------------------------------------");

            System.out.print("Masukkan Pilihan Anda: \n");
            memilih = input.next();

            //logika kondisi dengan switch case
            switch (memilih) {
                case "1":
                    System.out.println("-----------------------------------\nPilih bidang yang akan dihitung\n-----------------------------------");
                    System.out.println("1. Persegi");
                    System.out.println("2. Lingkaran");
                    System.out.println("3. Segitiga");
                    System.out.println("4. Persegi Panjang");
                    System.out.println("0. Kembali ke menu sebelumnya");
                    System.out.println("-----------------------------------");

                    System.out.print("Masukkan Pilihan Anda : ");
                    pilihanSatu = input.next();

                    //nested pertama
                    switch (pilihanSatu) {
                        case "1":
                            System.out.println("Masukkan nilai sisi : ");
                            s = input.nextDouble();

                            hasil = s * s;
                            System.out.println("Sedang diproses...");
                            System.out.println("\nLuas dari persegi adalah " + hasil + " satuan persegi");
                            break;

                        case "2":
                            System.out.println("Masukkan nilai jari-jari : ");
                            r = input.nextDouble();

                            hasil = phi * r * r;
                            System.out.println("Sedang diproses...");
                            System.out.println("\nLuas dari lingkaran adalah " + hasil + " satuan persegi");
                            break;

                        case "3":
                            System.out.println("Masukkan nilai alas : ");
                            a = input.nextDouble();
                            System.out.println("Masukkan nilai tinggi : ");
                            t = input.nextDouble();

                            hasil = 0.5 * a * t;
                            System.out.println("Sedang diproses...");
                            System.out.println("\nLuas dari segitiga adalah " + hasil + " satuan persegi");
                            break;

                        case "4":
                            System.out.println("Masukkan nilai panjang : ");
                            p = input.nextDouble();
                            System.out.println("Masukkan nilai lebar : ");
                            l = input.nextDouble();

                            hasil = p * l;
                            System.out.println("Sedang diproses...");
                            System.out.println("\nLuas dari persegi panjang adalah " + hasil + " satuan persegi");
                            break;

                        case "0":
                            loop = true; //akan dijalankan jika while (loop == true)
                            break;
                        default:
                            System.out.println("Tolong pilih sesuai pilihan yaa :)");
                            System.exit(0); //exit(0) untuk keluar dari program
                            break;
                    }
                    break;

                case "2":
                    System.out.println("-----------------------------------\nPilih bidang yang akan dihitung\n-----------------------------------");
                    System.out.println("1. Kubus");
                    System.out.println("2. Balok");
                    System.out.println("3. Tabung");
                    System.out.println("0. Kembali ke menu sebelumnya");
                    System.out.println("-----------------------------------");

                    System.out.print("Masukkan Pilihan Anda : ");
                    pilihanDua = input.next();

                    //nested kedua
                    switch (pilihanDua) {
                        case "1":
                            System.out.println("Masukkan nilai sisi : ");
                            s = input.nextDouble();

                            hasil = s * s * s;
                            System.out.println("Sedang diproses...");
                            System.out.println("\nVolume dari kubus adalah " + hasil + " satuan perkubik");
                            break;

                        case "2":
                            System.out.println("Masukkan nilai panjang : ");
                            p = input.nextDouble();
                            System.out.println("Masukkan nilai lebar : ");
                            l = input.nextDouble();
                            System.out.println("Masukkan nilai tinggi : ");
                            t = input.nextDouble();

                            hasil = p * l * t;
                            System.out.println("Sedang diproses...");
                            System.out.println("\nVolume dari balok adalah " + hasil + " satuan perkubik");
                            break;

                        case "3":
                            System.out.println("Masukkan nilai jari-jari : ");
                            r = input.nextDouble();
                            System.out.println("Masukkan nilai tinggi : ");
                            t = input.nextDouble();

                            hasil = phi * r * r * t;
                            System.out.println("Sedang diproses...");
                            System.out.println("\nVolume dari tabung adalah " + hasil + " satuan perkubik");
                            break;

                        case "0":
                            loop = true; //akan dijalankan jika while (loop == true)
                            break;
                        default:
                            System.out.println("Tolong pilih sesuai pilihan yaa :)");
                            System.exit(0); //exit(0) untuk keluar dari program
                            break;
                    }
                    break;

                case "0":
                    System.out.println("Menutup Aplikasi, Loading...");
                    System.out.println("Selesai");
                    System.exit(0); //exit(0) untuk keluar dari program
                    break;

                default:
                    System.out.println("Tolong pilih sesuai pilihan yaa :)");
                    System.exit(0); //exit(0) untuk keluar dari program
                    break;

            }
        }
        while (loop == true); //persyaratan loop = true dapat dijalankan untuk kembali ke perulangan do
    }
}