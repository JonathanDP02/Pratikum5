import java.util.Scanner;

public class DiskonToko07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

//....................deklasi..........................//

        String jenisBuku = "";
        int jumlahBuku;
        double diskon,harga = 0;

        System.out.print("Jenis buku yang akan dibeli = ");
        jenisBuku = input07.nextLine();

        System.out.print("Masukkan jumlah buku yang akan dibeli = ");
        jumlahBuku = input07.nextInt();

//.....................kondisi........................//

        if (jenisBuku.equalsIgnoreCase("komik")) {
            if (jumlahBuku > 2) {
                diskon = 0.12;
                harga = 10000 - (10000*diskon);
             }else{
                diskon = 0.10;
                harga = 10000 - (10000*diskon);
             }
        }
        else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.7;
            if (jumlahBuku > 3) {
                diskon = 0.02;
                harga = 15000 - (15000*diskon);
            }else{ 
                diskon = diskon + 0.1;
                harga = 15000 - (15000*diskon);
            }
        }
        else if (jenisBuku.equalsIgnoreCase("lainya")) {
            if (jumlahBuku > 3){
            diskon = 0.05;
            harga = 13000-( 13000 * diskon );
            }
        }else
        System.out.println("Input tidak valid");

        System.out.println("jumlah bayar = " + harga);
        }

        
    }


