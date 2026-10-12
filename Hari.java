package TugasJava;
import java.util.Scanner;

public class Hari {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Hari apa sekarang?");
        int angkaHari = inputan.nextInt();

        if (angkaHari == 1)
            System.out.print("Senin");
        else if (angkaHari == 2)
            System.out.print("Selasa");
        else if (angkaHari == 3)
            System.out.print("Rabu");
        else if (angkaHari == 4)
            System.out.print("Kamis");
        else if (angkaHari == 5)
            System.out.print("Jum'at");
        else if (angkaHari == 6)
            System.out.print("Sabtu");
        else if (angkaHari == 7)
            System.out.print("Minggu");
        else if(angkaHari >= 8)
            System.out.print("Hari tidak valid!");

        inputan.close();

    }
    
}
