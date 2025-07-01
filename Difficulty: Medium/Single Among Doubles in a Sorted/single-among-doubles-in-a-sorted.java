// User function Template for Java

class Solution {
    int findOnce(int[] arr) {
        // Complete this function
        int xor =0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        return xor;
    }
}