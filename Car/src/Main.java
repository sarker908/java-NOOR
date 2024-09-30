import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        Car car1 = new Car();
        car1.setBrand("");
        car1.setModel("Axio");
        car1.setYear(2021);

        car1.honkHorn();
        System.out.println(car1.getBrand()+" "+car1.getModel()+" "+car1.getYear());


        Car car2 = new Car();
        car2.setBrand("BMW");
        car2.setModel("");
        car2.setYear(2011);
        System.out.println(car2.getBrand()+" "+car2.getModel()+" "+car2.getYear());

        Car car3 = new Car("HONDA","Civic");
        car3.setYear(2018);

        System.out.println(car3.getBrand()+" "+car3.getModel()+" "+car3.getYear());
    }
}
