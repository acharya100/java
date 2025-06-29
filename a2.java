import java.util.Scanner;

public class a2{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter length of rectangle: ");
        double length = scanner.nextDouble();
        // scanner.nextLine();
        System.out.print("enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        // scanner.nextLine();

        double area = length * breadth;
        System.out.println("the area of rectangle is "+area);
        scanner.close();
    }
}