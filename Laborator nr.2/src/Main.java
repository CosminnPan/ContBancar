import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ContBancar cont= new ContBancar();
       cont.afisareSold();
       System.out.println("Cat doriti sa depuneti in prima depunere?");
        double num=sc.nextDouble();
       cont.depunere(num);
       cont.afisareSold();

        System.out.println("Cat doriti sa depuneti in a doua depunere?");
        num=sc.nextDouble();
        cont.depunere(num);
        cont.afisareSold();
    }

}