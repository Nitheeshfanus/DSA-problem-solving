class Solution {
    public int[] rearrangeArray(int[] arr) {
        int[] ans  = new int[arr.length];

        int posIndex =0;
        int negIndex =1;
        for(int i=0;i<ans.length;i++){
            if(arr[i]>0){
                    ans[posIndex]=arr[i];
                    posIndex = posIndex+2;
            }else{
                ans[negIndex] = arr[i];
                negIndex = negIndex+2;
                
            }
           
        }
         return ans;
    }
}