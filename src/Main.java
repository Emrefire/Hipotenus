import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hosgeldiniz");
        System.out.println("Dik kenarların uzunluğunu giriniz: ");
        double k1,k2,k3,Alan,Cevre;
        k1 = input.nextDouble();
        k2 = input.nextDouble();
        k3 = input.nextDouble();
        Cevre = k1 + k2 + k3 ;
        Alan = (k1 + k2 + k3)/2;
        System.out.println("Üçgenin Çevresi: " + Cevre);
        System.out.println("Üçgenin Alanı: " + Alan);

        /*double k1,k2,hipotenus,k3;
        k1 = input.nextDouble();
        k2 = input.nextDouble();
        hipotenus = (k1 * k1) + (k2 * k2);
        System.out.print("Hipotenüs : " + hipotenus);*/


    }
}