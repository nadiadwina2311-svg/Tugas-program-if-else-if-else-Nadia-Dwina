package TugasJava;
import java.util.Scanner;

public class Belanja {
    public static void main(String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa total belanja?");
        int harga = inputan.nextInt();

        if (harga > 100000)
            System.out.print("Gratik Ongkir");
        else if (harga < 100000)
            System.out.print("Bayar Ongkir");

        inputan.close();
    }
    
}
