import java.util.Scanner;

public class PemilihanPercobaan216 {
    public static void main (String[] args) {
        Scanner input16 = new Scanner(System.in);

        System.out.println("Nilai UAS   :");
        float UAS = input16.nextFloat();
        System.out.println("Nilai UTS   :");
        float UTS = input16.nextFloat();
        System.out.println("Nilai Kuis  :");
        float Kuis = input16.nextFloat();
        System.out.println("Nilai Tugas :");
        float Tugas = input16.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi"; 
        System.out.println("Nilai Akhir = " + total + " Sehingga " + message);
    }
}