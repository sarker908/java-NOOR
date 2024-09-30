import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6,7,8,9,10};
        String[] countries = {"USA", "Canada", "France", "Japan", "Australia"};
        double [] salary = {1000.00,2000.00,30000.00,40000.00,50000.00,60000.00};


        System.out.println(Arrays.stream(number).sum());
        System.out.println(Arrays.stream(number).min());
        System.out.println(Arrays.stream(number).max());
        System.out.println(Arrays.stream(number).average());

        HashSet<String> coutries = new HashSet<>();
        coutries.add("USA");
        coutries.add("Canada");
        coutries.add("France");
        coutries.add("Japan");
        coutries.add("Australia");


        for(String country : countries)
        {
            System.out.println(country);
        }

HashMap<Integer,Double> map = new HashMap<>();
        map.put(1,1000.00);
        map.put(2,2000.00);
        map.put(3,30000.00);
        map.put(4,40000.00);
        map.put(5,50000.00);
        for(Integer key: map.keySet())
        {
            System.out.println(map);
        }

        System.out.println(Arrays.stream(salary).average());









    }
}