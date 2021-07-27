import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

class Filter implements FilenameFilter{
    String pattern;
    Filter(String input){
        this.pattern = input;
    }
    @Override
    public boolean accept(File file, String s) {
        return Pattern.matches(pattern,s);
    }
}
public class Assignment1 {
    public static ArrayList<String> getFiles(File directory,String pattern){
        ArrayList<String> list = new ArrayList<>();
        for (File file:directory.listFiles(new Filter(pattern))){
            list.add(file.getName());
        }
        return list;
    }
    public static void main(String[] args) {
        File homeDirectory = new File(System.getProperty("user.home"));
        Scanner sc = new Scanner(System.in);
        String pattern;

        while(true){
            System.out.println("Enter pattern or enter \"quit\" to exit");

            pattern = sc.next();
            if(pattern.equals("quit")){
                break;
            }
            ArrayList<String> matchedFiles = getFiles(homeDirectory,pattern);
            if(matchedFiles.size()==0){
                System.out.println("No files matched");
            }
            else{
                for(String fileName:matchedFiles){
                    System.out.println(fileName);
                }
            }
        }
    }
}
