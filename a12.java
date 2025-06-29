// using printf

public class a12{
    public static void main(String[] args){
        String name = "drabesh";
        System.out.printf("Your name is %s\n",name);

        char lastLetter = 'h';
        System.out.printf("your name ends with %c\n",lastLetter);

        boolean isStudent = true;
        System.out.printf("is he/she student: %b\n",isStudent);

        int age = 22;
        System.out.printf("your age is %d years\n",age);

        float height = 5.10f;
        System.out.printf("your height is %f feet\n",height);

        double weight = 67.125;
        System.out.printf("your weight is %f kg\n",weight); 

        System.out.printf("%s has %c in his last letter and it is %b\n",name,lastLetter,isStudent);


        
        double price1 = 12000.2345;
        double price2 = -1234.2344;
        double price3 = 12000000.1;
        double price4 = 123456.888;

        System.out.printf("%+.1f\n", price1); 
        //+ le agadi + vaera dekhaucha positive chha vane ani - dekhauchha negative chha vane

        System.out.printf("%(.2f\n", price2);
        // , le 1,000,000 yesto banera dekhauchha

        System.out.printf("%,.3f\n",price3);
        //( yesle negative chha vane oripari () yesto le gherauchha postive chha vane kei change hudaina 

        System.out.printf("% .4f\n",price4);
        // .f ko agadi space aayo vane postive chha vane space aaucha euta negative chha vane change aaudaina



        int id1 = 9;
        int id2 = 99;
        int id3 = 999;
        int id4 = 9999;

        System.out.printf("%05d\n",id1); 
        //yesle 5 ota digit pugauchha like 4 chha vane 00004 banauchha ani 3.4 chha vane 3.4000 banauchha
        System.out.printf("%5d\n",id2);//yesle like 3 digit ko no. chha tara 5d diyeko le agadi 2 ota space dinxa
        System.out.printf("%-5d\n",id3);//yesle like 3 digit ko no. chha tara 5d diyeko le paxadi 2 ota space dinxa
        System.out.printf("%d\n",id4);
    }
}
