import java.util.Scanner;

public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
    
    //...................deklarasi.......................//

    int pilihMenu, harga;
    String member;
    double diskon = 0.10;

    System.out.println("-----------------------------------");
    System.out.println("========== MENU KAFE JTI ==========");
    System.out.println("1. Kopi");
    System.out.println("2. Teh");
    System.out.println("3. Roti");
    System.out.println("-----------------------------------");
    System.out.print("Masukkan angka dari menu yang dipilih = ");
    pilihMenu = input07.nextInt();
    input07.nextLine();
    System.out.print("Apakah punya member (y/n) ? = ");
    member = input07.nextLine();
    System.out.println("-----------------------------------");

    //..................kondisi.........................//

    if (member.equalsIgnoreCase("y")) {
        System.out.println("Besar diskon = 10%");
        if (pilihMenu == 1) {
            harga = 14000;
            System.out.println("Harga kopi = " + harga);
        }else if (pilihMenu == 2) {
            harga = 3000;
            System.out.println("Harga teh = " + harga);
        }else if (pilihMenu == 3) {
            harga = 15000;
            System.out.println("Harga roti = " + harga);
        }else{
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }
        
        //...............perhitungan................//

        double total = harga - (harga*diskon);
        System.out.println("Total bayar setelah diskon = " + total);
    }
    //...................kondisi2.......................//

    else if (member.equalsIgnoreCase("n")) {
        if (pilihMenu == 1) {
            harga = 14000;
            System.out.println("Harga kopi = " + harga);
        }else if (pilihMenu == 2 ) {
            harga = 3000;
            System.out.println("Harga teh = " + harga);
        }else if (pilihMenu == 3 ) {
            harga = 15000;
            System.out.println("Harga roti = " + harga);
        }else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }
    //..................perhitungan....................//

    System.out.println("Total bayar = " + harga);

    }else{
        System.out.println("Member tidak valid");
    }

    System.out.println("------------------------------");
    
    }
}
