public class Car {
    String name;
    String color;
    int year;

    Car(String name,String color,int year){
        this.name = name;
        this.color = color;
        this.year = year;
    }
    void drive(){
        System.out.println("in year "+this.year+ " you drive the "+ this.color +" "+ this.name);
    }

}
