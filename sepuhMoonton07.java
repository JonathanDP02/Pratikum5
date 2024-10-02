import java.util.Scanner;

public class sepuhMoonton07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //...................deklarasi....................//

    int bintang;
    String kategori = "";

    System.out.print("Masukkan jumlah bintang: ");
    bintang = sc.nextInt();

    //................switch-case....................//

        if (bintang <= 0 && bintang > 24) 
        {
            kategori = "romawi";
            System.out.println("Kategori mitik " + kategori);
        }
        else if (bintang <= 25 && bintang > 49) 
        {
            kategori = "honor";
            System.out.println("Kategori mitik " + kategori);   
        }
        else if (bintang <= 50 && bintang > 99) 
        {
            kategori = "glory";
            System.out.println("Kategori mitik " + kategori);   
        }
        else if (bintang <= 100 ) 
        {
            kategori = "immortal";
            System.out.println("Kategori mitik " + kategori + " ajarin dong puh");    
        }
    }
}
