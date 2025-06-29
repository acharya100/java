
// public class a9 {
//         public static void main(String[] args) {
//            double p = 3;
//            double b = 4;
//            double h = Math.pow((p*p+b*b), 0.5);
//            System.out.println(h);
//         }
// }


import java.util.Scanner;


public class a9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for perpendicular: ");
        double p = scanner.nextDouble();

        System.out.print("Enter value for base: ");
        double b = scanner.nextDouble();

       double h = Math.sqrt(Math.pow(p, 2)+Math.pow(b, 2));
        System.out.println("The hypotenus is: "+h);

        scanner.close();
    }
}