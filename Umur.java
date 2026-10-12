package TugasJava;
import java.util.Scanner;

public class Umur {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa umur anda?");
        int umur = inputan.nextInt();

        if (umur <= 17)
            System.out.print("Belum boleh memiliki KTP");
        else if (umur >17)
            System.out.print("Boleh memiliki KTP");


        inputan.close();
    }
    
}
