import java.math.BigInteger;
import java.util.Scanner;


public class Modulo  {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        BigInteger fact = new BigInteger("1");
        BigInteger modi = new BigInteger("1000000007");

        for(int i =1; i<=num;i++){
            long ans=10;
           fact = fact.multiply(BigInteger.valueOf(ans));
        }

        fact = fact.mod(modi);

        System.out.println(fact);

    }


}