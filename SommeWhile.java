import java.util.Scanner;
public class SommeWhile {    
    public static void main( String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier positif n: ");
        int n = sc.nextInt();
        int somme = 0;
        int i = 1;
        while( i<=n){
            somme += i;
            i++;
        }
        System.out.println("La somme des entiers de 1 à "+n+" est : "+somme);
        sc.close();
    }
    
}
