import java.util.Scanner;

public class Currency {
    public static class Menu {
        public void displayMenu() {
            System.out.println("Select your current currency.");
            System.out.println("1. India\t\tIndian Rupee\tINR");
            System.out.println("2. United States\tUS Dollar\tUSD");
            System.out.println("3. Eurozone\t\tEuro\t\tEUR");
            System.out.println("4. Japan\t\tJapanese Yen\tJPY");
            System.out.println("5. Canada\t\tCanadian Dollar\tCAD");
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        menu.displayMenu();
        System.out.print("Enter the value from 1-5: ");
        int option1 = sc.nextInt();
        System.out.print("Now select in which currency you want to convert (1-5): ");
        int option2 = sc.nextInt();
        System.out.print("Enter amount you want to convert: ");
        double amount = sc.nextDouble();

        double[][] conversionRates = {
            {1.0, 0.012, 0.011, 0.0074, 0.014},  // INR
            {82.62, 1.0, 0.91, 0.067, 0.095},   // USD
            {90.48, 1.1, 1.0, 0.074, 0.104},    // EUR
            {135.56, 14.93, 13.48, 1.0, 1.41},  // JPY
            {74.18, 10.53, 9.62, 0.71, 1.0}     // CAD
        };

        if (option1 < 1 || option1 > 5 || option2 < 1 || option2 > 5) {
            System.out.println("Selected option is incorrect. Please enter a number between 1 and 5.");
            return;
        }


        int fromCurrency = option1 - 1;
        int toCurrency = option2 - 1;


        double convertedAmount = amount * conversionRates[fromCurrency][toCurrency];


        System.out.printf("Converted amount: %.2f\n", convertedAmount);

        sc.close();
    }
}
