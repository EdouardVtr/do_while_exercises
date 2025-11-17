import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double val= 0;
        double somme = 1;
        int count = -1;

        do {
            System.out.println("Entrez votre valeur :");
            val = scan.nextInt();
            somme += val;
            ++count;
        } while (val != -1);
        double moyenne = somme / count;
        System.out.println("La somme de ces " + count + " nombres est : " + moyenne);
    }
}
