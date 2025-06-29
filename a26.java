import java.util.Scanner;

public class a26 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        String ageInput = scanner.nextLine().trim();

       
        int age;
        if (ageInput.isEmpty()) {
            System.out.println("You did not enter your age! Assuming '0'.");
            age = 0; 
        } else {
            age = Integer.parseInt(ageInput);
        }

        System.out.print("Are you eligible (true/false)?: ");
        String eligibilityInput = scanner.nextLine().trim();

        
        boolean isEligible;
        if (eligibilityInput.isEmpty()) {
            System.out.println("You did not enter eligibility status! Assuming 'false'.");
            isEligible = false;
        } else {
            isEligible = Boolean.parseBoolean(eligibilityInput);
        }

        
        if (name.isEmpty()) {
            System.out.println("You have not entered your name.");
        } else {
            System.out.println("Hello " + name);
        }


        if (age < 0) {
            System.out.println("You have not been born yet!");
        } else if (age == 0) {
            System.out.println("You are a newborn baby.");
        } else if (age > 0 && age < 18) {
            System.out.println("You are a child.");
        } else if (age >= 18 && age <= 80) {
            System.out.println("You are an adult.");
        } else if (age > 80 && age <= 100) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You have lived a long life!");
        }

       
        if (isEligible) {
            System.out.println("You are eligible.");
        } else {
            System.out.println("You are not eligible.");
        }

        scanner.close();
    }
}
