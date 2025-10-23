import java.util.Scanner;
public class PairImpair {
    public static void main(String[] arg){
Scanner sc = new Scanner(System.in);
System.out.print("Entrez un entier: ");
int n=sc.nextInt();
if(n%2 == 0){
    System.out.println("Le nombre "+n+" est pair.");
}else{
    System.out.println("Le nombre "+n+" est impair.");
    }
    sc.close();
    }
}