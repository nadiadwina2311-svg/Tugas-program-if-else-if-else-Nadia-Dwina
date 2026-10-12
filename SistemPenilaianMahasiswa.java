package TugasJava;
import java.util.Scanner;

public class SistemPenilaianMahasiswa {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nilai akhir: ");
        Double nilai = inputan.nextDouble();

        System.out.print("Masukkan persentase kehadiran: ");
        Double kehadiran = inputan.nextDouble();

        System.out.print("Masukkan persentase tugas selesai: ");
        Double tugasSelesai = inputan.nextDouble();

        boolean lulusNilai = nilai >= 60;
        boolean lulusKehadiran = kehadiran >= 75;
        boolean lulusTugas = tugasSelesai >= 80;

        if (lulusNilai && lulusKehadiran && lulusTugas) {
            System.out.print("LULUS ");
            System.out.print("Selamat, semua karakter penilaian telah terpenuhi");
        } else {
            System.out.print("TIDAK LULUS ");
            
            if (!lulusNilai) {
                System.out.print("- Nilai (" + nilai + ") kurang dari standar minimal 60% ");
            }
            if (!lulusKehadiran) {
                System.out.print("- Kehadiran (" + kehadiran + " %) kurang dari standar minimal 75% ");
            }
            if (!lulusTugas) {
                System.out.print("- Tugas selesai (" + tugasSelesai + " %) kurang dari standar minimal 80% ");
            }
            inputan.close();
        }
    }

}
