import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] name = {"Abul" , "Babul" , "Kabul"  };

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);


        int[] ages = {20, 26 ,30, };
        int sum = 0;
        System.out.println("Size:" + ages.length);
        System.out.println(Arrays.stream(ages).sum());
        System.out.println(Arrays.stream(ages).max());
        System.out.println(Arrays.stream(ages).min());

        ArrayList <String> namelist = new ArrayList<String>();
        namelist.add ("Abul"); //0
        namelist.add ("Babul"); // 1

        namelist.add ("Abul");
        namelist.add ("Rabul");
         // 2

        System.out.println(namelist.get(0));
        System.out.println(namelist.get(1));
        System.out.println(namelist.get(2));
        System.out.println("Size:" + namelist.size());

        System.out.println(namelist.contains("Abul"));


        for (int i = 0; i< namelist.size(); i++)
        {
            System.out.println(namelist.get(i));
        }

        for(String n:namelist)
        {
            System.out.println("fromloop: " +n);
        }

        HashSet <String> nameset = new HashSet<>();

        nameset.add("Abul");
        nameset.add("Babul");
        nameset.add("Kabul");
        nameset.add("Abul");
        nameset.add("Rabul");
        System.out.println("Size:" + nameset.size());
        System.out.println("yo");

        for (String n:nameset)
        {
            System.out.println("Fromset: " + n);
        }

        HashMap<Integer, String> namemap = new HashMap<>();
        namemap.put(1,"Abul");
        namemap.put(2,"Babul");
        namemap.put(3,"Babul");
        System.out.println(namemap.get(1));
        System.out.println(namemap.get(2));
        System.out.println(namemap.get(3));
        System.out.println("Size:" + namemap.size());



    }
}