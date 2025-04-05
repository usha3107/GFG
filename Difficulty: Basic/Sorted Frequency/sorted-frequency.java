//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            // taking total count of elements
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;
            //  sc.nextLine();
            // Declaring and Initializing a new ArrayList
            int arr[] = new int[n];

            // adding elements to the ArrayList
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(temp[i]);
            }
            Solution ob = new Solution();
            // calling freqSorted method
            // and passing ArrayList and size
            // as parameters
            ob.freqSorted(arr);

            // System.out.println();

            // System.out.println("~");
        }
    }
}
// } Driver Code Ends


//Back-end complete function Template for Java

class Solution {
    public static void freqSorted(int arr[]) {
        // Your Code Here
         
        HashMap<Integer,Integer> mp=new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            int key=arr[i];
            int freq=0;
            
            if(mp.containsKey(key)) freq=mp.get(key);
            
            freq++;
            mp.put(key,freq);
        }
        
        for(Map.Entry<Integer, Integer> it: mp.entrySet()){
            System.out.println(it.getKey() + " " + it.getValue());
        }

    }
}