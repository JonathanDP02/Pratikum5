import java.time.format.SignStyle;
import java.util.Scanner;

public class Pemilihan2Percobaan307 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
    
//...........................deklarasi............................//

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan Kategori : ");
        kategori = input07.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input07.nextInt();

//...........................kondisi............................//

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) 
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
        gajiBersih = (int) (penghasilan - (pajak*penghasilan));
        System.out.print("Penghasilan Bersih : " + gajiBersih);
        } 
        else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2000000) 
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
                pajak = 0.2;
        gajiBersih = (int) (penghasilan - (pajak*penghasilan));
        System.out.print("Penghasilan Bersih : " + gajiBersih);
        }
        
        else 
            System.out.println("Masukan Kategori salah ");
    }
}
