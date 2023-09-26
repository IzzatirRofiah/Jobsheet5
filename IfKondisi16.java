import java.util.Scanner;

public class IfKondisi16 {
    public static void main (String[] args) {
        Scanner sc16 = new Scanner(System.in);

        System.out.print("Masukkan Suhu :");
        int Suhu = sc16.nextInt();

        if (Suhu<16){
            System.out.println("Silahkan Menggunakan Jaket");
        }
        if (Suhu<20){
            System.out.println("Silahkan Pakai Baju Tebal");
        }
        else{
            System.out.println("Silahkan Pakai Topi");
        }
    }
}