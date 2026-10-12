package TugasJava;
import java.util.Scanner;

public class GratisOngkir {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa total belanja?");
        Double totalBelanja = inputan.nextDouble();

        System.out.print("Apakah ada member? (trus/false): ");
        boolean Member = inputan.nextBoolean();

        if (totalBelanja >= 100000 || Member)
            System.out.print("Gratis ongkir");
        else if (totalBelanja >= 100000)
            System.out.print("Bayar ongkir");
        else if (totalBelanja <= 100000)
            System.out.print("Bayar ongkir");

        inputan.close();
    }
    
}
