import java.util.Scanner;
public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre entier positif n : ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Veuillez entrer un entier positif !");
        } else {
            int étapes = 0;
            System.out.print("Suite de Collatz : " + n);

            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;  
                }
                étapes++;
                System.out.print(" → " + n);
            }

            System.out.println("\nNombre total d'étapes : " + étapes);
        }

        sc.close();
    }
}

