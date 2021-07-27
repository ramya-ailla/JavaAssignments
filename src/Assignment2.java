import java.util.HashSet;
import java.util.Scanner;

public class Assignment2 {
    boolean containsAllLettersInAlphabet(String input){
        input = input.toLowerCase();
        HashSet<Character> letters = new HashSet<>();
        for(char c:input.toCharArray()){
            if(Character.isAlphabetic(c)){
                letters.add(c);
            }
        }
        if(letters.size()==26){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Assignment2 o = new Assignment2();
        System.out.println("enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(o.containsAllLettersInAlphabet(input));
    }
}
