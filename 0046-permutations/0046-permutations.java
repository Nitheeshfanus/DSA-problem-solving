class Solution {
    public List<List<Integer>> permute(int[] nums)
    {
        List<List<Integer>> list= new ArrayList<>();
        rec(list, new ArrayList<>(), nums);
        
        return list;
    }
    
    public void rec(List<List<Integer>> res,List<Integer> temp, int[] nums)
    {
        if(temp.size() == nums.length)
        {
            res.add(new ArrayList<>(temp));
        }
        else
        {
        for(int i=0; i< nums.length; i++)
        {
            if(temp.contains(nums[i])) 
            continue;

            temp.add(nums[i]);
            rec(res, temp, nums);
            temp.remove(temp.size() -1 );
        }
        }
    }
}