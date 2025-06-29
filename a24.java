import java.util.*;


public class a24 {
    public static void main(String[] args){

        ArrayList<ArrayList<String>> grocerySupplies = new ArrayList<>();

        ArrayList<String> teaSupplies = new ArrayList<String>();

        teaSupplies.add("tea leaves");
        teaSupplies.add("milk");
        teaSupplies.add("sugar");
        //System.out.println(teaSupplies.get(2));

        ArrayList<String> drinkSupplies = new ArrayList<>();

        drinkSupplies.add("pepsi");
        drinkSupplies.add("cola");
        drinkSupplies.add("fanta");
       // System.out.println(drinkSupplies);

        grocerySupplies.add(teaSupplies);
        grocerySupplies.add(drinkSupplies);

        System.out.println(grocerySupplies);
        System.out.println(grocerySupplies.get(1));
        System.out.println(grocerySupplies.get(1).get(2));
    
    }
}
