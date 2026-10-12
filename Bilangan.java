package TugasJava;
import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Apa bilangan dari angka tersebut?");
        int angka = inputan.nextInt();
    
        if (angka % 2 == 0){
            System.out.print("Bilangan genap");
        }else {
            System.out.print("Bilangan ganjil");
        }
        inputan.close();

    } 

}
