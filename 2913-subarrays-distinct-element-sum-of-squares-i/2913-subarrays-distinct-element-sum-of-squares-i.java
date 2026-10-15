class Solution {
    public int sumCounts(List<Integer> nums) {
        
        int n= nums.size();
        int sum= 0;

        for(int i=0; i<n; i++)
        {
            HashSet<Integer> hs= new HashSet<>();
            for(int j= i; j< n; j++)
            {
                int temp= nums.get(j);
                hs.add(temp);
                sum += Math.pow(hs.size(), 2);
            }
            
            System.out.println(sum);
        }
        return sum;
    }
}