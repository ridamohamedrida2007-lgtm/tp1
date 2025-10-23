import java.util.Scanner;
public class SommeFor {
    public static void main( String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier positif n: ");
        int n = sc.nextInt();
        int somme = 0;
        for(int i=1; i<=n; i++){
            somme += i;
        }
        System.out.println("La somme des entiers de 1 à "+n+" est : "+somme);
        sc.close();
    }
    
}
