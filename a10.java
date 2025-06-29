
import java.util.Scanner;

public class a10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for radius: ");
        double radius = scanner.nextDouble();

        double c = 2*Math.PI*radius;
        System.out.println("The circumference of circle is: "+c);

        double A = Math.PI*Math.pow(radius, 2);
        System.out.printf("The area of circle is %.3f\n",A);

        double v = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        System.out.printf("The volume of circle is %.2f",v);

        scanner.close();
    }
}

