import java.util.Locale;

public class TextFormmating {
    public static void main(String[] args) {
        Locale BRAZIL = new Locale("pt","BR");
        String product1 = "Computer";
        String product2 = "Office desk";
        char gender = 'F';
        int age = 30;
        int code = 5290;
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s which price is $%.2f.\n", product1, price1);
        System.out.printf("%s which price is $%.2f.\n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s\n", age, code, gender);
        System.out.printf("Measure with 8 decimal places: %.8f.\n", measure);
        System.out.printf("Measure with 3 decimal places: %.3f.\n", measure);
        Locale.setDefault(BRAZIL);
        System.out.printf("Medidas com 3 casas decimais: %.3f.\n", measure);
    }
}
