import java.util.Scanner;

public class a3{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();

        System.out.print("enter a verb: ");
        String verb1 = scanner.nextLine();

        System.out.println("Today i went to a "+adjective1 + " zoo.");
        System.out.println("In that "+adjective1+" zoo I saw a "+noun1);
        System.out.println("That "+noun1 + " was "+verb1);
        scanner.close();
    }
}