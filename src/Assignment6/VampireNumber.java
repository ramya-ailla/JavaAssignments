package Assignment6;

import java.util.*;

public class VampireNumber {
    public static void main(String[] args) {
        HashSet<Long> vampireNumbers = new HashSet<>();
        char [] fangs,vampireCandidate;
        long product , x = 10;
        while (vampireNumbers.size()<100){
            for(long y = x;y<1000;y++){
                product = x*y;
                vampireCandidate = Long.toString(product).toCharArray();
                fangs = (Long.toString(x) + Long.toString(y)).toCharArray();

                Arrays.sort(vampireCandidate);
                Arrays.sort(fangs);

                if(Arrays.equals(vampireCandidate,fangs)){
                    vampireNumbers.add(product);
                }

            }
            x++;
        }
        ArrayList<Long> vampireList= new ArrayList<>(vampireNumbers);
        Collections.sort(vampireList);
        for(long i:vampireList){
            System.out.println(i);
        }
    }
}
