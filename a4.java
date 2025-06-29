import java.util.Scanner;

public class a4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What would you like to buy?: ");
        String item = scanner.nextLine();

        System.out.print("What is the the price? ");
        double price= scanner.nextDouble();

        System.out.print("What amount of "+item+ " you want? ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        double total = price * quantity;
        
        System.out.println("\nYou have bought "+quantity+" "+item+"/s");
        System.out.println("your total for "+item+" is "+total +" rupees");

        scanner.close();
    }
}