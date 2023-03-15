import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i < 6; i++) {
            sum += getInputFromScanner(i);
        }

        System.out.println("The sum of the 5 numbers = " + sum);

    }

    public static double getInputFromScanner(int counter) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number #" + counter + ":");

        boolean validInput = false;
        double number = 0;
        do {
            try {
                number = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        } while (!validInput);

        return number;

    }
}
