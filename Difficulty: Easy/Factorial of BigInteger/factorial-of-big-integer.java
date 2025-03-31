//{ Driver Code Starts
// Initial Template for Java

import java.math.BigInteger;
import java.util.Scanner;

// Driver class with main function
class Main {

    
// } Driver Code Ends

// User function Template for Java

public static BigInteger factorial(int x) {

    // write your code here
    // return factorial of n as datatype of BigInteger
    if(x==0 || x==1){
        return BigInteger.ONE;
    }
   
    return BigInteger.valueOf(x).multiply(factorial(x-1));
}


//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            // Taking input x
            int x = sc.nextInt();

            System.out.println(factorial(x));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends