import java.util.Scanner;

public class Pemilihan2Percobaan107 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        //...........deklarsi................//

        int tahun;

        System.out.print("Masukkan tahun: ");
        tahun = input07.nextInt();

        //............kondisi.............//

        if (tahun % 4==0) {
            if ((tahun % 100 ) != 0) {
                System.out.println("Tahun kabisat");
            }else{
                if ((tahun % 400) == 0) 
                System.out.println("Tahun kabinet");
                else
                System.out.println("Bukan tahun kabinet");
            }
        } else {
            System.out.println("Bukan tahun kabinet");
        }
    }
}
