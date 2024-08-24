import java.util.Locale;

public class Resultado {
    public static void main(String[] args) {

        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b;

        Locale.setDefault(Locale.US);
        System.out.printf("o valor foi: %.1f ",resultado);

    }




}
