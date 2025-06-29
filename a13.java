import java.util.Scanner;

public class a13{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount for principal: ");
        double p = scanner.nextDouble();

        System.out.print("Enter the amount for rate: ");
        double r = scanner.nextDouble();

        System.out.print("Enter the number of times it is compounded: ");
        int n = scanner.nextInt();

        System.out.print("Enter time(in years) involved in this process: ");
        double t = scanner.nextDouble();

        double a = p * Math.pow((1+r/n), n*t);
        System.out.println("The amount generated from "+p+" in rate of "+ r + " which took " +
        t + " years for compounding " + n + " times is: " + a);

        scanner.close();
    }
}