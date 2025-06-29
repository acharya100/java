import java.util.Scanner;

public class a1{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("enter your grade: ");
        float grade = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("are you student? ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("my grade is "+grade);
        if(isStudent){
            System.out.println("you are a student.");
        }
        else{
            System.out.println("you are not a student");
        }
        scanner.close();
    }
}
