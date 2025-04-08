//{ Driver Code Starts

// } Driver Code Ends

//Back-end complete function Template for Java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        // Perform all the operations and print in a single line
         int d=a^a;
        int e=~c^b;
        int f=a&b;
        int g=c|(a^a);
        System.out.print(d+" "+e+" "+f+" "+g+" ");
    }
}


//{ Driver Code Starts.
// } Driver Code Ends