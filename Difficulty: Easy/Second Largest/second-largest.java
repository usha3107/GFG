class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int largest = arr[0];
        int smallest =-1;
        for(int  i=0;i<n;i++){
            if(arr[i]>largest){
                smallest = largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>smallest){
                smallest = arr[i];
            }
        }
        if(largest == smallest){
            return -1;
        }
        return sm;
    }
}