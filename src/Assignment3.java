import java.io.IOException;
import java.net.InetAddress;
import java.util.*;

public class Assignment3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter host name: ");
        String hostname=sc.nextLine();

        InetAddress inet = InetAddress.getByName(hostname);
        System.out.println("enter number of times to ping");
        int n = sc.nextInt();

        ArrayList<Long> time = new ArrayList<>();
        System.out.println("Sending Ping Request to " + hostname+" "+inet.getHostName()+" "+n+" times");
        for(int i =1;i<=n;i++){
            long finish = 0;
            long start = new GregorianCalendar().getTimeInMillis();
            try {

                if (inet.isReachable(5000)) {
                    finish = new GregorianCalendar().getTimeInMillis();
                    System.out.println("Ping RTT: " + (finish - start + "ms"));
                    time.add(finish-start);
                } else {
                    System.out.println(hostname + " NOT reachable.");
                }
            }catch (Exception e) {
                System.out.println("Exception:" + e.getMessage());
            }
        }
        Collections.sort(time);
        if(time.size()%2==0){
            int mid1 = time.size()/2;
            int mid2= mid1+1;
            long timeAtmid1 = time.get(mid1);
            long timeAtmid2 = time.get(mid2);
            System.out.println("Median of time taken to ping is "+(double)((timeAtmid1+timeAtmid2)/2)+" ms");
        }
        else{
            int mid = (time.size()/2)+1;
            long timeAtmid = time.get(mid);
            System.out.println("Median of time taken to ping is "+timeAtmid+" ms");

        }
    }
}




