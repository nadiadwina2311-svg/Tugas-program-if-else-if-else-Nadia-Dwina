package TugasJava;
import java.util.Scanner;

public class PositifNegatif {
    public static void main(String[] agrs) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa angka anda?");
    int angka = inputan.nextInt();

    if (angka >0)
        System.out.print("Positif");
    else if (angka <0)
        System.out.print("Negatif");

    inputan.close();
    }
    
}
