//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {
            int N = scn.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> sum = ob.getSum(N);
            System.out.println(sum.get(0)+" "+sum.get(1));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> getSum(int N){
        // code here
        int evenSum = 0;
       int oddSum = 0;
       
       for(int i = 0; i<=N; i++){
           if(i%2 == 0){
               evenSum += i;
           }
           else{
               oddSum += i;
           }
       }
       ArrayList<Integer> result = new ArrayList<>();
       result.add(evenSum);
       result.add(oddSum);
       return result;
    }
    public static void main(String[] args){
        ArrayList<Integer> result1 = getSum(1);
        System.out.println(result1);
        
        ArrayList<Integer> result2 = getSum(6);
        System.out.println(result2);

    }
}