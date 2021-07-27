import Assignment11.FileOperations;

import java.io.*;
import java.util.HashMap;

public class Assignment11 {
    public void countCharacters(String inputFile, String outputFile) throws IOException {
        HashMap<Character, Integer> counter = new HashMap<>();
        FileReader fr = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            for (char ch : line.toCharArray()) {
                if (!(counter.containsKey(ch))) {
                    counter.put(ch, 1);
                } else
                    counter.put(ch, counter.get(ch) + 1);
            }
        }
        FileWriter fw = new FileWriter(outputFile);
        PrintWriter pw = new PrintWriter(fw, true);
        for (char ch : counter.keySet()) {
            pw.println(ch + " : " + counter.get(ch));
        }
        System.out.println("character counts are written on to the output file");
    }
    public static void main(String [] args){
        if (args.length == 0) {
            System.out.println("Enter input and Output file names as arguments");
        } else {
            FileOperations countChars = new FileOperations();
            try {
                System.out.println(args[0] + " " + args[1] + " " + args);
                countChars.countCharacters(args[0], args[1]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

