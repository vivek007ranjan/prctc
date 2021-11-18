
import java.util.*;

class CrioTest {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {


        int l = 1;
        int r = 10;
        int ans = numberOfPrimesInARange(l, r);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int numberOfPrimesInARange(int l, int r) {

        int ans=0,prime =0;
        if (l<2 && r<2)
            return 0;

        for(int i=l; i<=r;i++ )
        {
            if (i<2 && r>=2)
                i=2;
             System.out.println(" first loop : i = " + i);
            if (i>=2) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0)
                        prime = prime + 1;
                    System.out.println(" 2nd  loop : i = " + i);
                }

            }
            if (prime==0)
                ans = ans+1;
            System.out.println(" ans : i = " + ans);
            prime=0;
        }
        return ans+1;
    }

}
