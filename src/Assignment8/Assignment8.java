package Assignment8;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Specialist Shooter job portal");
        int age;
        boolean isEyeSightGood;
        System.out.println("Enter your Age: ");
        age=sc.nextInt();
        System.out.println("Enter true or false\n You have good eyesight");
        isEyeSightGood = sc.nextBoolean();
        try{
            Application a = new Application();
            a.checkApplicantEligibitity(age,isEyeSightGood);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("In finally block");
            System.out.println("Memory is freed");
        }
    }
}
