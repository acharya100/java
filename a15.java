import java.util.Scanner;

public class a15 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("if you want to quit the game press Q or q: ");
        String response = scanner.nextLine();

        if(response.equals ("q") || response.equals ("Q")){

            System.out.println("are you sure you want to quit.");
        }
        else{
            System.out.println("user wants to play");
        }
        scanner.close();
    }
}



// public class a15{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Do you want to play cricket?: ");
//         String response = scanner.nextLine();

//         if(!response.equals("yes") && !response.equals("YES") && !response.equals("Yes")){
//             System.out.println("he doesn't want to play");
//         }else{
//             System.out.println("he wants to play");
//         }
//     }
// }