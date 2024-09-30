import java.io.RandomAccessFile;
import java.util.RandomAccess;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.import Employee name and password");
        System.out.println("log in ");
        System.out.println("choice");
        int choice = input.nextInt();

    }

    public static void save ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your password");
        String password = input.nextLine();
        String line = name + " " + password+"\n";



    }
    public static void writeofficer(String line)
    {
        try{

            RandomAccess raf = new RandomAccessFile("officer.txt","rw");
            raf.seek(raf.length());
            raf.wrm wlk wlk v

        }



    }

}