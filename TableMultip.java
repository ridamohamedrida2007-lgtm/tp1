import java.util.Scanner;
public class TableMultip {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Entrez un entier n : ");
         int n = sc.nextInt();
         System.out.println("Table de multiplication de " + n + " :");
       for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        sc.close();
    }
}
