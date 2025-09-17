// User function Template for Java

class Solution {
    public static ArrayList<Integer> uniqueSorted(int arr[]) {
        // Your code here
         TreeSet<Integer>ans = new TreeSet<>();
        for(int num : arr){
            ans.add(num);
        }
        return new ArrayList<>(ans);
    }
}