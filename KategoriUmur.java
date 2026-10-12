package TugasJava;
import java.util.Scanner;

    public class KategoriUmur {
        public static void main(String[] args) throws Exception {
            Scanner inputan = new Scanner(System.in);
            System.out.print("Berapa umur anda?");
            int umur = inputan.nextInt();

            if (umur >= 0 && umur <= 5)
                System.out.print("Balita");
            else if (umur >= 6 && umur <= 12)
                System.out.print("Anak-anak");
            else if (umur >= 13 && umur <= 17)
                System.out.print("Remaja");
            else if (umur >= 18 && umur <= 59)
                System.out.print("Dewasa");
            else if (umur >= 60)
                System.out.print("Lansia");

            inputan.close();

        }
}