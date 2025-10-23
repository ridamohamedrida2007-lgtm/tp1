import java.util.Scanner;
public class TestPrimalite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier n : ");
        int n = sc.nextInt();
        boolean estPremier = true; 
        if (n <= 1) {
            estPremier = false; 
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    estPremier = false;
                    break; 
            }
        }

        if (estPremier) {
            System.out.println(n + " est un nombre premier.");
        } else {
            System.out.println(n + " n'est pas un nombre premier.");
        }
}
        sc.close();
    
}
}

