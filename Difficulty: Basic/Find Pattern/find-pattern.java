//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
class GFG{
    
    
// } Driver Code Ends

//User function Template for Java


// function should find if the string p is
// in the string s. Return the starting index
// of the string p in s. Return -1 if the
// string doesnot exists in s.
public static int findPattern(String s, String p){
    // code here
    return s.indexOf(p);
}



//{ Driver Code Starts.
    
    
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while( t-- > 0){
            
            String s = read.readLine().trim();
            String p = read.readLine().trim();
            
            int index = findPattern(s, p);
            System.out.println(index);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends