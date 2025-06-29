import java.util.ArrayList;

public class a25 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("elephant");
        animals.add("lion");
        animals.add("rhino");
        animals.add("tiger");

        for(String i : animals){
            System.out.println(i);
        }
    }
}
