import java.util.Scanner;


public class a20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("enter number of columns: ");
        int columns = scanner.nextInt();

        System.out.print("enter symbol to use: ");
        String symbol = scanner.next();

        for(int i = 1; i<=rows; i++){
            System.out.println();
        
        for(int j = 1; j<= columns; j++){
            System.out.print(symbol);

            scanner.close();
        }
    }
    }
}