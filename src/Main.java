
// Girilen sayıdan küçük, 4 ve 5'in kuvvetlerini ekrana yazdıran program.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        x = input.nextInt();

        System.out.println("4'ün Kuvvetleri");
        for (int i = 1; i < x; i *= 4) {
            // 4^0 dahil olduğundan ve 4^0 = 1 olduğundan, 1 den başlattık
            System.out.println(i);
        }

        System.out.println("5'in Kuvvetleri");
        for (int i = 1; i < x; i *= 5) {
            // 5^0 dahil olduğundan ve 5^0 = 1 olduğundan, 1 den başlattık
            System.out.println(i);
        }
    }
}