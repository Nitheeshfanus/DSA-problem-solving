class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n= nums.length;

        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        
        HashSet<Integer> hs= new HashSet<>();

        for(int i=0; i<n; i++){
            min= Math.min(min, nums[i]);
            max= Math.max(max, nums[i]);
            hs.add(nums[i]);
        }
        ArrayList<Integer> lis= new ArrayList<>();

        int l= min+1;
        int r= max;
        for(int i= l; i< r; i++){
            if(!hs.contains(i)){
                lis.add(i);
            }
        }
        return lis;
    }
}