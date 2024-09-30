import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Import the name of employee and password");
        System.out.println("2. Login");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                save();
                break;
            case 2:
                login();
                break;

        }
    }

    public static void save() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        String line = name + "," + password + "\n";
        writeofficer(line);
    }

    public static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        if (readofficer(name, password)) {
            System.out.println("Login Successful");
            System.out.println("1. Add student information");
            System.out.println("2. View student information");
            System.out.println("3. add course with id");
            System.out.println("4. search course by id ");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Student();
                    break;
                case 2:
                    System.out.print("Search with id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    searchStudentinfo(String.valueOf(id));
                    break;
                default:
                    System.out.println("Invalid choice");
                case 3:
                    addcourse();
                    break;
                case 4:
                    System.out.println("Enter id to find course");
                    int id1 = sc.nextInt();
                    searchadvisedcourse(String.valueOf(id1));
            }
        } else {
            System.out.println("Password Incorrect, please try again");
            login();
        }
    }

    public static void writeofficer(String line) {
        try {
            RandomAccessFile raf = new RandomAccessFile("officer.txt", "rw");
            raf.seek(raf.length());
            raf.writeBytes(line);
            raf.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Failed to write file");
        }
    }

    public static boolean readofficer(String name, String password) {
        try {
            RandomAccessFile raf = new RandomAccessFile("officer.txt", "r");
            String line;
            while ((line = raf.readLine()) != null) {
                String[] arr = line.split(",");
                if (arr.length == 2 && arr[0].equals(name) && arr[1].equals(password)) {
                    raf.close();
                    return true;
                }
            }
            raf.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static void Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.print("Enter program: ");
        String program = sc.nextLine();
        System.out.print("Enter cgpa: ");
        double cgpa = sc.nextDouble();
        System.out.print("Enter batch: ");
        int batch = sc.nextInt();

        Student student = new Student(id, name, batch, password, program, cgpa);
        String line = student.getId() + "," + student.getName() + "," + student.getBatch() + "," +
                student.getProgram() + "," + student.getCgpa() + "," + "\n";
        writeStudentinfo(line);
    }

    public static void writeStudentinfo(String line) {
        try {
            RandomAccessFile raf = new RandomAccessFile("student.txt", "rw");
            raf.seek(raf.length());
            raf.writeBytes(line);
            raf.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Failed to write file");
        }
    }

    public static void searchStudentinfo(String id) {
        try {
            RandomAccessFile raf = new RandomAccessFile("student.txt", "r");
            String line;
            while ((line = raf.readLine()) != null) {
                if (line.startsWith(id)) {
                    System.out.println(line);
                }
            }
            raf.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void addcourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course: ");
        String course = sc.nextLine();
        String line = id + "," + course + "\n";
        writeadvisedcourse(line);
    }

    public static void writeadvisedcourse(String line) {
        try {
            RandomAccessFile raf = new RandomAccessFile("advisedcourse.txt", "rw");
            raf.seek(raf.length());
            raf.writeBytes(line);
            raf.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Failed to write file");
        }
    }

    public static void searchadvisedcourse(String id) {
        try {
            RandomAccessFile raf = new RandomAccessFile("advisedcourse.txt", "r");
            String line;
            while ((line = raf.readLine()) != null) {
                if (line.startsWith(id)) {
                    System.out.println(line);
                }
            }
            raf.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
