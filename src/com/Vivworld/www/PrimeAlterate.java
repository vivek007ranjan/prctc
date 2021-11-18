package com.Vivworld.www;

import java.util.Scanner;

public class PrimeAlterate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean[] prime = new boolean[n+1];
        for (int i=2; i<=n;i++)
            prime[i]= true;

        for (int divisor =2; divisor*divisor <=n; divisor++)
            if (prime[divisor])
                for(int j= 2*divisor; j<=n; j=j+divisor )
                    prime[j]= false;

        for(int k=2;k<=n;k++)
            if (prime[k])
                System.out.println(" "+k);

    }
}
