
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Assignment4 {
    public static void kycFormDuration(String signupDate,String currDate){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signUpDate = LocalDate.parse(signupDate,format);
        LocalDate presentDate = LocalDate.parse(currDate,format);
        LocalDate anniversaryDate = LocalDate.parse(signupDate.substring(0,6)+currDate.substring(6),format);

        LocalDate upperLimit = anniversaryDate.plusDays(30);
        LocalDate lowerLimit = anniversaryDate.minusDays(30);

        String result;
        if(presentDate.compareTo(signUpDate.minusDays(30))<=0){
            result = "No range";
        }
        else if(presentDate.compareTo(upperLimit)>0){
            result = lowerLimit.format(format)+" "+upperLimit.format(format);
        }
        else if(presentDate.compareTo(upperLimit)<=0 & presentDate.compareTo(lowerLimit)>0){
            result = lowerLimit.format(format)+" "+presentDate.format(format);
        }
        else {
            anniversaryDate = anniversaryDate.minusYears(1);
            lowerLimit=anniversaryDate.minusDays(30);
            upperLimit=anniversaryDate.plusDays(30);
            result = lowerLimit.format(format)+" "+upperLimit.format(format);
        }
        System.out.println(result);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int noOftestInputs = sc.nextInt();
        String[][] inputs = new String[noOftestInputs][2];

        for(int i =0;i<noOftestInputs;i++){
            for(int j=0;j<2;j++){
                String date = sc.next();
                inputs[i][j]=date;
            }
        }
        for(int i =0;i<noOftestInputs;i++){
            kycFormDuration(inputs[i][0],inputs[i][1]);
        }

    }
}
