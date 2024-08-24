import java.util.Locale;
import java.util.Scanner;

import static java.time.temporal.TemporalAdjusters.next;

public class LerChar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int x;
        String S1,S2,S3;
        char y;


        x = scanner.nextInt();
        scanner.nextLine();   //next line adicionado para a "quebra de linha"
        S1 = scanner.nextLine();
        S2 = scanner.nextLine();
        S3 = scanner.nextLine();
        y = scanner.next().charAt(0); //usado para identificar char 0 = 1 letra



        System.out.println("Dados cadastrados: ");
        System.out.println(x);
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(y);




    }


}
