package com.Vivworld.www;
import java.util.Arrays;


public class ArraysBasics {
    public static void main(String[] args) {
        int[] arr= {100,101,120,140,155,166,197,208,209,210};
        int[] arr3 = new int[10];
        int[] arr2={1,2,3,4,5};
        char[] chararr= {'a', 'b','c'};
        short[] sarr;
        byte[] barr;
        long[] larr;
        boolean[] booarr = { true, false, false , 1==2, 1/10==2, true};
        String[] str= {"wewew","wewerer"};
        String[] aArray = new String[5];
        String[] bArray = {"a","b","c", "d", "e"};
        String[] cArray = new String[]{"a","b","c","d","e"};

        String stry = "text";

        for (int i : arr)
        {
            System.out.println("Value of i = " + i + " index is : " );
        }
        System.out.println(Arrays.toString(arr));


//        // System.out.println(str[0]);
//        /* to copy any Array of from any position*/
//       System.arraycopy(arr,0,arr3,0,10);
//
//       /* for each loop takes all values of array */
//    //    for(char x: chararr){
//           /* System.out.println(x +" = "+chararr[x-1]);--- Not required as x represents the value not index */
//     //       System.out.println(x);
//     //       if (x == 'c')
//    //        System.out.println(x);
//
//       // }
//
//        /* To print any array convert it to String  */
//        String stre = bArray.toString();
//        System.out.println(arr.toString());
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.binarySearch(arr,120));
//        System.out.println(Arrays.asList(arr3));
//        System.out.println(Arrays.binarySearch(arr,8, 9,130));
//        System.out.println(Arrays.compare(arr,arr3));
//        System.out.println(Arrays.compareUnsigned(arr,2,5,arr3,1,4));
//        int[] copy = Arrays.copyOf(arr3,15);
//        System.out.println(Arrays.toString(copy));
//        int[] copyr = Arrays.copyOfRange(arr3,2,8 );
//        System.out.println(Arrays.toString(copyr));
//        System.out.println(Arrays.hashCode(arr3));
//        System.out.println();
//
//
//
//        /*
//----------asList
//          binarySearch
//          compare
//          compareUnsigned
//          copyOf
//          copyOfRange
//          deepEquals
//deepHashCode----> Examples needed
//           deepToString
//           equals
//           fill
//hashCode-----> Examples needed
//            mismatch
//parallelPrefix-----> Examples needed
//parallelSetAll-----> Examples needed
//parallelSort-----> Examples needed
//setAll-----> Examples needed
//            sort
//spliterator-----> Examples needed
//stream-----> Examples needed
//            toString
//         */



    }
}
