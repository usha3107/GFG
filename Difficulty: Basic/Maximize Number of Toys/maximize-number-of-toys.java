//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.ListIterator;

class GFG {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total number of testcases
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            // taking total number of elements
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;

            int arr[] = new int[n];

            // adding the elements to the ArrayList
            for (int i = 0; i < n; i++) {
                arr[i] = (Integer.parseInt(temp[i]));
            }

            // taking total amount
            int k = Integer.parseInt(sc.nextLine());
            Solution ob = new Solution();
            // calling max_toys method
            // and then printing the result
            System.out.println(ob.max_toys(arr, k));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int max_toys(int arr[], int k) {
        // Your code here
        Arrays.sort(arr);
        int sum =  0;
        int c = 0;
       
        for(int i = 0;i<arr.length;i++)
        {
          if(sum + arr[i]<=k)
          {
           sum +=arr[i];
              c++;
          }
         else
         break;
          
        }
        return c;
    }
}