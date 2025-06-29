import java.util.Scanner;


public class a11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get item details from the user
        System.out.print("What would you like to buy? ");
        String item = scanner.nextLine();

        System.out.print("What is the price? ");
        double price = scanner.nextDouble();

        System.out.print("What amount of " + item + " do you want? ");
        int quantity = scanner.nextInt();

        double subtotal = price * quantity;

        
        double discount = 0;
        if (quantity > 5) {
            discount = subtotal * 0.05;  
            System.out.println("You received a 5% discount of " + discount);
        }

        
        double taxRate = 0.10;
        double tax = (subtotal - discount) * taxRate;

       
        double total = subtotal - discount + tax;


        System.out.println("\n BILL SUMMARY ");
        System.out.println("Item: " + item);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Tax : " + tax);
        System.out.println("Total Payable: " + total);

        scanner.close();
    }
}
