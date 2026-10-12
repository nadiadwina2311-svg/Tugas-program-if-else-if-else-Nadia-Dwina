package TugasJava;
import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa nilai anda?");
        Double nilai = inputan.nextDouble();
        char kategori = 'F';


        if (nilai > 80 && nilai <= 100)
            kategori = 'A';
        else if (nilai > 70 && nilai <= 79)
            kategori = 'B';
        else if (nilai > 60 && nilai <= 69)
            kategori = 'C';
        else if (nilai > 50 && nilai <= 59)
            kategori = 'D';
        else if (nilai < 50)
            kategori = 'E';

        System.out.print("Kategori nilai anda adalah: " + kategori);
        inputan.close();
    }
    
}
