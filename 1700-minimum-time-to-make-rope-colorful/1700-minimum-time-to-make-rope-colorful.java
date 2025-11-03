 class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int mintime = 0;
        for(int i = 1; i<n ; i++)
        {


            if(colors.charAt(i) == colors.charAt(i-1))
            {
                mintime += Math.min(neededTime[i-1], neededTime[i]);
                neededTime[i] = Math.max(neededTime[i], neededTime[i-1]);
            }
            
        }


        return mintime;
    }
}