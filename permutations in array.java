class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        int n=arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
         int j=n-1;
         for(int i=0;i<n;i++){
             if(arr1[i]+arr2[j]<k){
                 return false;
             }
             j--;
         }
         return true;
    }
}
