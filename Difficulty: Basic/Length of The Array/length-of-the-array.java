//{ Driver Code Starts
// Initial Template for Java

import java.util.Scanner;

class Main {
    
// } Driver Code Ends

// User function Template for Java

public static int arrayLength(int[] numbers) {
 int ans =0;
 ans =numbers.length; // nameofArray.length is used to calculate the length of an array.
 return ans;
}



//{ Driver Code Starts.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println(arrayLength(arr));

            System.out.println("~");
        }
        scn.close();
    }
}
// } Driver Code Ends