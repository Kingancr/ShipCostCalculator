import java.util.Scanner;

public class Main {
    static void main() {
        /*
        class ShippingCalculator
            main()
            // Declare variables
            num itemPrice
            num shippingCost
            num totalPrice
            // Input section
            output "Enter Item Price: "
            input itemPrice


            // Conditional logic (If Then Else)
            if itemPrice >= 100 then
                shippingCost = 0
            else
                shippingCost = itemPrice * 0.02
            end if
            // Process total
            totalPrice = itemPrice + shippingCost
            // Output section
            output "Total price is: $" + totalPrice
            return
        end class
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Item Price: ");
        double itemPrice = scanner.nextDouble();
        double totalPrice;
        if (itemPrice >= 100) {
            totalPrice = itemPrice;
            System.out.println("Your shipping is free!");
        }
        else {
            totalPrice = itemPrice * 1.02;
        }
        System.out.println("Total price is: $" + totalPrice);
    }
}
