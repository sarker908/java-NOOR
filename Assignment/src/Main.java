import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter infomation of students ");
        writestudentIformation(input.nextline());

    }

    public static void readstudentIformation(String line)
    {
        try {
            RandomAccessFile raf = new RandomAccessFile("student.txt" , "rw");
            raf.seek(raf.length());
            raf.writeBytes(line+ "\n");
        }
        catch (FileNotFoundException ex)
        {
            ex.printStackTrace();

            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }


    }
}