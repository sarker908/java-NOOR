import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Grade = new Scanner(System.in);
        String letterGrade ="";
                Double gradePoints;
        boolean error = true;
        System.out.println("Enter Letter Grade: ");
        letterGrade = Grade.next();





        if( letterGrade == "A+")
        {
            System.out.println("Enter Grade Points: ");
        }
        else if ( letterGrade == "A")
        {
            gradePoints = 4.0;
        }
        else if( letterGrade == "A-")
        {
            gradePoints = 3.67;
        }
        else if ( letterGrade == "B+")
        {
            gradePoints = 3.33;
        }
        else if( letterGrade == "B")
        {
            gradePoints = 3.0;
        }
        else if ( letterGrade == "B-")
        {
            gradePoints = 2.67;
        }
        else if( letterGrade == "C+")
        {
            gradePoints = 2.33;
        }
        else if ( letterGrade == "C")
        {
            gradePoints = 2.0;
        }
        else if( letterGrade == "F")
        {
            gradePoints = 0.0;
        }

    }
}