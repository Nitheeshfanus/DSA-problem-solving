class Solution {
    public int firstMissingPositive(int[] nums) {
        int N=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,1);
            }
        for(int ctr=1;;ctr++){
            if(!map.containsKey(ctr)){
                return ctr;
            }
        }
        }

    }
