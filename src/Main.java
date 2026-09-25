import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Item Price: ");
        double input = scanner.nextDouble();
        if (input >= 100) {
            System.out.println("Your shipping is free!");
        }
        else {
            double priceWithTax = input * 1.02;
            System.out.println("Your price with shipping is: "+ priceWithTax);
        }
    }
}
