package com.rezanop.chapters.chapter1.section1;

public class Exercise16 {

    public static void main(String[] args) {
        /*
          For n = 6:
               exR1(3) + 6 + exR1(4) + 6
               (exR1(0) + 3 + exR1(1) + 3) + 6 + (exR1(1) + 4 + exR1(2) + 4) + 6
                   -> exR1(0) = ""
                   -> exR1(1) = exR1(-2) + 1 + exR1(-1) + 1 = "11"
                   -> exR1(2) = exR1(-1) + 2 + exR1(0) + 2 =  "22"
               ("" + 3 + "11" + 3) + 6 + ("11" + 4 + "22" + 4) + 6
               "311361142246"
         */
        System.out.println("The value of exR1(6): " + exR1(6));
    }

    public static String exR1(int n ) {
        if( n <= 0 ) return "";
        return exR1(n - 3) +  n + exR1(n - 2) + n;
    }
}
