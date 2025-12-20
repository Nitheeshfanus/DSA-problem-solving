class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return recur(arr, arr.length-1, sum);
    }
    static boolean recur(int arr[], int i,int k){
        if(k==0){
            return true;
        }
        if(i<0){
            return false;
        }
        if(k>=arr[i]){
            return recur(arr, i-1, k-arr[i]) ||
                   recur(arr, i-1, k);
        }
        return recur(arr, i-1, k);
    }
}