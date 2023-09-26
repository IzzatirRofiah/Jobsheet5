import java.util.Scanner;

public class PemilihanPercobaan116_1 {
    public static void main (String[] args) {
        Scanner input16 = new Scanner(System.in);
        System.out.println("Masukan Umur: ");
        int Umur = input16.nextInt();
       
        if (Umur <25) {
            System.out.println("umur " + Umur + " Adalah Muda");
        }
        else {
            System.out.println("umur " + Umur + " Adalah Tua");
        }
    }
}