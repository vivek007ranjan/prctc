import java.math.BigInteger;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        BigInteger fact = new BigInteger("1");

        for(int i =2; i<=num;i++){
            fact= fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(fact);

    }


}
