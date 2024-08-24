import java.util.Locale;

public class doisF {
    public static void main(String [] args){

        Double x = 10.4394;
        System.out.println(x);
        System.out.printf("%.3f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);

    }




}
