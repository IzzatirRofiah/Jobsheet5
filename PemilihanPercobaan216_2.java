import java.util.Scanner;

public class PemilihanPercobaan216_2 {
    public static void main (String[] args) {
        Scanner input16 = new Scanner(System.in);
        String nilai_huruf;

        System.out.print("Nilai UAS   :");
        float UAS = input16.nextFloat();
        System.out.print("Nilai UTS   :");
        float UTS = input16.nextFloat();
        System.out.print("Nilai Kuis  :");
        float Kuis = input16.nextFloat();
        System.out.print("Nilai Tugas :");
        float Tugas = input16.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi"; 
        System.out.println("Nilai Akhir = " + total + " Sehingga " + message);

        if (total >=80){
            nilai_huruf = "A";
        }
        else if (total >73){
            nilai_huruf = "B+";
        }
        else if (total >65){
            nilai_huruf = "B";
        }
         else if (total >60){
            nilai_huruf = "C+";
        }
        else if (total >50){
            nilai_huruf = "C";
        }
         else if (total >39){
            nilai_huruf = "D";
        }
        else {
            nilai_huruf = "E";
        }

        System.out.println("Kamu Mendapatkan Gradin akhir yaitu: " + nilai_huruf);
    }
}