import java.util.Scanner;

public class LatihanIndividu116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jarak;

        System.out.print("Masukkan Jarak Anda: ");
        jarak = sc.nextInt();
        
        if (jarak <= 5){
            System.out.println("Gunakan Melee Weapon");
        }
        else if (jarak > 5){
            System.out.println("Gunakan Ranged Weapon");
        }
    }
}