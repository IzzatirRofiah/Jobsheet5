import java.util.Scanner;

public class LatihanIndividu216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int username = 2904;
        int password = 2005;
        System.out.println("Masukkan Username dan Password");
        System.out.print("Username    : ");
        int user = input.nextInt();
        System.out.print("Password    : ");
        int pw = input.nextInt();
        if (user == username && pw == password){
            System.out.println("Selamat Datang!");
        }
        else{
            System.out.println("Username atau Password yang anda masukkan salah");
        }
    }
}
