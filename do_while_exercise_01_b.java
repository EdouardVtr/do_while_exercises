import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 nbs. entiers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > 0)
            do {
                a -= b;
            } while (a >= 0);
        System.out.println(a + " " + b);
    }
}

// a = 5, b = 2
// 01) a =  3 / b = 2
// 02) a =  1 / b = 2
// 03) a = -1 / b = 2
// réponse : -1 2

// a = 5, b = -2
// 01) a = 7, b = -2
// 02) a = 9, b = -2
// 03) a = 11, b = -2
// La variable a ne sera jamais plus petite ou égale à 0.
// Le programme va donc boucler à l'infini.

// a = 5, b = 0
// 01) a = 5, b = 0
// 02) a = 5, b = 0
// 03) a = 5, b = 0
// La variable a ne sera jamais plus petite ou égale à 0.
// Le programme va donc boucler à l'infini.

// a = -5, b = 0
// La variable a ne permet pas de rentrer dans le "if"
// réponse : -5 0
