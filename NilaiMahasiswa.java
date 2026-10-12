package TugasJava;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Berapa nilai anda?");
    Double nilai = inputan.nextDouble();

    if (nilai < 60)
        System.out.print("Tidak Lulus");
    else if (nilai > 60)
        System.out.print("Lulus");
        
    inputan.close();
    }    
}