import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double alan, cevre;
        int r;
        Scanner yaricap = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını girin : ");
        r = yaricap.nextInt();

        alan = Math.PI * r * r;
        cevre = 2 * Math.PI * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.print("Dairenin çevresi : " + cevre);
    }
}