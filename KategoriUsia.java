import java.util.Scanner;

public class KategoriUsia {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    //...............deklarasi..................//

    String kategori = "";
    int usia;

    System.out.print("Masukkan usia: ");
    usia = sc.nextInt();

    //..............switch-case..................//

    if (usia >= 0 && usia <= 12) 
    {
            kategori = "anak";
            System.out.println("Kategori usia: " + kategori);    
    }
    else if (usia >= 13 && usia <= 19) 
    {
            kategori = "remaja";
            System.out.println("Kategori usia: " + kategori);   
    }
    else if (usia >= 20 && usia <= 64) 
    {
            kategori = "Dewasa";
            System.out.println("Kategori usia: " + kategori);    
    }
    else if (usia >= 65) 
    {
            kategori = "lansia";
            System.out.println("Kategori usia: " + kategori);    
    }
    else {
        System.out.println("input tidak valid");
    }
    
    }
}
