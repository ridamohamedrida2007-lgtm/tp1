import java.util.Scanner
;public class AnnéeBissextille {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une année: ");
        int annee = sc.nextInt();
        if((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)){
            System.out.println("L'année "+annee+" est bissextile.");
    }
    else{
        System.out.println("L'année "+annee+" n'est pas bissextile.");
    }
    sc.close();
}
}
