import java.util.Locale;

public class concat {
    public static void main(String [] args){
        Double x = 12.2345;
        System.out.println(x);
        System.out.printf("%.3f%n", x);
        Locale.setDefault(Locale.US);

        System.out.printf("RESULTADO = %.2f METROS%n ", x);



    }


}
