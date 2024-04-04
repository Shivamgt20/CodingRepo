package com.shivam;

public class BitwiseOperator {
    
    public static void main(String[] args) {
        
        /*
         * There are 6 total bit wise Operators
         * 1. AND (&) --> 1-1 --> 1 other are 0 if we and any number with 1 it will give us that number only. 0-1 --> 0 1-1-->1 And(&) with 0 is always 0
         * 
         * 2. OR (|) --> 
         * 
         * 
         * 3. XOR exclusive OR --> only result in 1 if and only is there is one 1. 0-1 --> 1 1-0--> 1 1-1-->0 0-0-->0   x^x --> 0 
         * 
         *   1 0 0 1
         * ^ 1 1 1 1
         * ----------
         *   0 1 1 0 --> completemet of a    (XOR with 1 will give you the a compliment)
         * 
         * 4. complement ~ Bitwise opposite of a number
         * 
         *
         * 5. << Shift left operator --> shift's bits to left. each operatoion multiplies by 2 ==> a<<b = a * 2^b
         * 
         * 6. >> Right shift operator --> shift a bit to right. each operation divides by 2 ==> a>>b = a/ (2^b) 
         */

         int a = 18; 
         int b = 19; 


         // to find if a numer is even or odd just do a Bitwise AND (&) with 1
         System.out.println( a & 1);  // even 
         System.out.println( b & 1 ); // odd


        //  int[] arr = {1,0,1,1,0,1,1,0};


        // Nth magic number ---> Asked in Amazon interview
         int n = 5; 
         int sum = 0;
         int base = 5;

         while(n>0){
            int last = n&1;
            n=n>>1;
            sum += last*base;
            base *=5;
         }

         System.out.println(sum);

         System.out.println(31&32);





    }
}
