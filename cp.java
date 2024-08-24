import java.util.Locale;

public class cp {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;


        System.out.println("Products:");
        System.out.printf("%s whick price is $ %.2f %n ", product1, price1);
        System.out.printf("%s whick price is $ %.2f %n ", product2, price2);

        System.out.printf("\nRecord: %s years old, code %s and gender: %s", age, code, gender);
        System.out.println("\n");
        System.out.printf("Measue eight decimal places:  %.8f ", measure);
        System.out.printf("\nrounded (three decimal places): %.3f",measure);
        Locale.setDefault(Locale.US);
        System.out.printf("\nUS secimal point: %.3f", measure);



    }




}
