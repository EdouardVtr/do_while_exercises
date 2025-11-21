import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrer 2 nbs. entiers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        do {
          a *= 2;
          b += a;
        } while (b <= 20);
        System.out.println(a + " " + b);
    }
}
// a = 5, b = 2
// 01) a = 10 / b = 12
// 02) a = 20 / b = 32
// réponse : 20 32

// a = 5, b = -2
// 01) a = 10 / b = 8
// 02) a = 20 / b = 28
// réponse : 20 28

// a = 5, b = 0
// 01) a = 10 / b = 10
// 02) a = 20 / b = 30
// réponse : 20 30

// a = -5, b = 0
// 01) a = -10 / b = -10
// 02) a = -20 / b = -20
// ...
// La variable b ne sera jamais plus grande ou égale à 20.
// Le programme va donc boucler à l'infini.
