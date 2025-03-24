//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.ListIterator;

class GFG {
    public static void main(String[] args) {

        // using Scanner class to take input
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();

        sc.nextLine();
        while (t-- > 0) {
            // taking the String
            String str = sc.nextLine();

            // calling the Sorted_Characters method
            // with String as parameter and printing
            // the result
            System.out.println(Sorted_Characters(str));

            System.out.println("~");
        }
    }

    
// } Driver Code Ends

// User function Template for Java

public static String Sorted_Characters(String str)
{
    TreeSet<String> s=new TreeSet<>();
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        String ss=""+c;
        s.add(ss);
    }
    String temp="";
    for(String c:s){
        temp=temp+c;
    }
    return temp;
}





//{ Driver Code Starts.
}

// } Driver Code Ends