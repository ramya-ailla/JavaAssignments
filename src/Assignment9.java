import java.util.Scanner;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String sentence = sc.nextLine();
        String pattern = "^[A-Z].*[.]$";

        if(Pattern.matches(pattern,sentence)){
            System.out.println("Given Sentence starts with Capital letter and ends with .");
        }
        else
            System.out.println("Given Sentence doesn't start with Capital letter and ends with .");

    }
}
