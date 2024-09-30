
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();


        rectangle1.setWidth(5.0);
        rectangle1. setWidth(4.5);

        Rectangle rectangle2 = new Rectangle();

        rectangle2.setWidth(3.4);
        rectangle2.setLength(2.5);

        Rectangle rectangle3 = new Rectangle();

        rectangle3.setLength(4.3);
        rectangle3.setWidth(5.5);

        Rectangle rectangle4 = new Rectangle();

        rectangle4.setLength(7.5);
        rectangle4.setWidth(1.5);

        Rectangle rectangle5 = new Rectangle();

        rectangle5.setWidth(3.4);
        rectangle5.setLength(2.5);

        System.out.println("Rectangle 1: " + rectangle1.getLength() + ", " + rectangle1.getWidth());

        Employee e1 = new Employee();

        e1.setName("A");
        e1.setId(1);
        e1.setSalary(2000);
        Employee e2 = new Employee();
         e2.setName("B");
         e2.setId(2);
         e2.setSalary(3000);
         Employee e3 = new Employee();

         e3.setName("C");
         e3.setId(3);
         e3.setSalary(4000);

         Employee e4 = new Employee();

         e4.setName("D");
         e4.setId(4);
         e4.setSalary(5000);

         Employee e5 = new Employee();
         e5.setName("E");
         e5.setId(5);
         e5.setSalary(6000);

        System.out.println(e1.getName()+" "+e1.getId()+" "+e1.getSalary());
        System.out.println(e2.getName()+" "+e2.getId()+" "+e2.getSalary());
        System.out.println(e3.getName()+" "+e3.getName()+" "+e3.getSalary());
        System.out.println(e4.getName()+" "+e4.getId()+" "+e4.getSalary());
        System.out.println(e5.getName()+" "+e5.getId()+" "+e5.getSalary());

        Circle c1 = new Circle();
        c1.setRadius(3);

        Circle c2 = new Circle();
        c2.setRadius(5);

        Circle c3 = new Circle();
        c3.setRadius(7);

        Circle c4 = new Circle();
        c4.setRadius(9);
        Circle c5 = new Circle();
        c5.setRadius(10);
        System.out.println(c1.getRadius() + " " + c2.getRadius() + " " + c3.getRadius() + " " + c4.getRadius()+ " " + c5.getRadius());


        Car car1 = new Car();
        car1.setBrand("BMW");
        car1.setModel("M4");
        car1.setYear(2005);

        Car car2 = new Car();
        car2.setBrand("Audi");
        car2.setModel("M4");
        car2.setYear(2006);

        Car car3 = new Car();
        car3.setBrand("BMW");
        car3.setModel("B");
        car3.setYear(2007);
        Car car4 = new Car();
        car4.setBrand("Toyota");
        car4.setModel("Mark II");
        car4.setYear(2002);
        Car car5 = new Car();
        car5.setBrand("Mercedes");
        car5.setModel("B");
        car5.setYear(2003);

        System.out.println(car1.getBrand() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println(car2.getBrand() + " " + car2.getModel() + " " + car2.getYear());
        System.out.println(car3.getBrand() + " " + car3.getModel() + " " + car3.getYear());
        System.out.println(car4.getBrand() + " " + car4.getModel() + " " + car4.getYear());
        System.out.println(car5.getBrand() + " " + car5.getModel() + " " + car5.getYear());
        Student s1 = new Student();
        s1.setName("A");
        s1.setRoll(30);
        s1.setProgram("CSE");
        s1.setBatch(61);
        Student s2 = new Student();
        s2.setName("B");
        s2.setRoll(40);
        s2.setProgram("CSE");
        s2.setBatch(61);
        Student s3 = new Student();
        s3.setName("C");
        s3.setRoll(50);
        s3.setProgram("CSE");
        s3.setBatch(61);
        Student s4 = new Student();
        s4.setName("D");
        s4.setRoll(60);
        s4.setProgram("CSE");
        s4.setBatch(61);
        Student s5 = new Student();
        s5.setName("E");
        s5.setRoll(70);
        s5.setProgram("CSE");
        s5.setBatch(61);

        System.out.println(s1.getName() + " " + s2.getName()+ " " + s3.getName()+ " " + s4.getName()+ " " + s5.getName());
        System.out.println(s1.getRoll()+" "+ s2.getRoll() + " "+ s3.getRoll() + " "+ s4.getRoll() + " "+ s5.getRoll());
        System.out.println(s1.getBatch()+ " " + s2.getBatch() + " "+ s3.getBatch() + " "+ s4.getBatch() + " "+ s5.getBatch());





    }
}