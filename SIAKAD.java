import java.util.Scanner;

public class SIAKAD {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //..........deklarasi................//

    char kelas;
    String nama;
    int nim, noAbsen;
    double nKuis, nTugas, nUjian;

    System.out.print("Masukkan nama: ");
    nama = sc.nextLine();
    System.out.print("Masukkan NIM: ");
    nim = sc.nextInt();
    System.out.print("Masukkan kelas: ");
    kelas = sc.next().charAt(0);
    System.out.print("Masukkan nomer absen: ");
    noAbsen = sc.nextInt();
    System.out.print("Masukkan nilai kuis: ");
    nKuis = sc.nextDouble();
    System.out.print("Masukkan nilai tugas: ");
    nTugas = sc.nextDouble();
    System.out.print("Masukkan nilai ujian: ");
    nUjian = sc.nextDouble();

    //.............penghituhan.................//

    double nAkhir = (nKuis+nTugas+nKuis) / 3;

    System.out.println("Mahasiswa dengan nama " + nama + "(nim " + nim + ") Kelas " + kelas + " nomor absen " + noAbsen);
    System.out.println("Nilai akhir: " + nAkhir);

    //............swicth-case..................//

    double nSetara = 0;
    String nHuruf = "";
    String kualifikasi = "";

    if (nAkhir <= 100 && nAkhir > 80) 
    {
           nHuruf = "A";
           nSetara = 4;
           kualifikasi = "Sangat Baik";
    }
    else if (nAkhir <= 80 && nAkhir > 73) 
    {
            nHuruf = "B+";
            nSetara = 3.5;
            kualifikasi = "Lebih dari Baik";   
    }
    else if (nAkhir <= 73 && nAkhir > 65) 
    {
            nHuruf = "B";
            nSetara = 3;
            kualifikasi = "Baik";   
    }
    else if (nAkhir <= 65 && nAkhir > 60) 
    {
            nHuruf = "C+";
            nSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
    }
    else if (nAkhir <= 60 && nAkhir > 50) 
    {
            nHuruf = "C";
            nSetara = 2;
            kualifikasi = "Cukup";   
    }
    else if (nAkhir <= 50 && nAkhir > 39) 
    {
            nHuruf = "D";
            nSetara = 1;
            kualifikasi = "Kurang";   
    }
    else if (nAkhir <= 39) 
    {
            nHuruf = "E";
            nSetara = 0;
            kualifikasi = "Gagal";   
    }

    //...............output..............//

    System.out.println("Nilai akhir huruf: " + nHuruf);
    System.out.println("Kualifikasi: " + kualifikasi);
    
    }
}
