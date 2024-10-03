import java.util.Scanner;

public class Pemilihan2Percobaan107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //...........deklarsi................//

        int tahun;

        System.out.print("Masukkan tahun: ");
        tahun = sc.nextInt();

        //..........switch-case.............//
        
        if ((tahun % 4)==0) 
        {
            if ((tahun % 100)!= 0)
                System.out.println("Tahun kabisat");
        else 
            System.out.println("Bukan tahun kabisat");
        }
    }
}
