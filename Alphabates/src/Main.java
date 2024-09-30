import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");

        String s = sc.nextLine().toLowerCase();

        int string = s.length();
        int vowels =0;
        int consonants = 0;

        for (int i = 0; i < string; i++) {

            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'
            || s.charAt(i)=='o' || s.charAt(i)=='u') {

                vowels++;
            }
            else {
                consonants++;
            }

        }

        System.out.println("vowels: "+vowels);
        System.out.println("consonants: "+consonants);
    }
}