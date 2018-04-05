import java.util.LinkedList;
import java.util.List;

public class SieveOfSundaram {

    public static void main(String[] args) {

        int maxNumber = 200;

        List<Integer> notPrimes = new LinkedList<>();

        int lead = 1;
        int lag = 1;

        while (lead + lag + 2 * lead * lag <= maxNumber/2+1) {

            while (lead + lag + 2 * lead * lag <= maxNumber/2+1) {
                notPrimes.add(lead+lag+2*lead*lag);
                lag++;
            }
            lead++;
            lag = lead;
        }

        System.out.println("Prime numbers found:");
        for (int i = 1; i <= maxNumber/2; i++) {
            if(!notPrimes.contains(i)) System.out.println(i + ": " + (2*i+1));
        }

    }

}
