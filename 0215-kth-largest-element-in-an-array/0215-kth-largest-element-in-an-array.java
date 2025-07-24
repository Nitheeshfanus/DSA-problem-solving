class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> example=new PriorityQueue(Collections.reverseOrder());
        int result=0;
        for(int num:nums){
            example.add(num);
        }
        for(int str=0;str<k;str++){
           result=example.poll();
        }

        
    
    return result;
    }
}