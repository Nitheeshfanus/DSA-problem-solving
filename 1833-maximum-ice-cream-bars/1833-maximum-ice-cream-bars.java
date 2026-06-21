class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n= costs.length;
        int sum= 0;
        int bars= 0;
        Arrays.sort(costs);

        for(int i=0; i<n; i++){
            if(sum + costs[i] > coins){
                continue;
            }
            sum+= costs[i];
            bars++;
            if(sum == coins){
                break;
            }
            
        }
        return bars;
    }
}