class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n= candies.length;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<n ;i++){
            max=Math.max(max,candies[i]);
        }
        ArrayList<Boolean> ls= new ArrayList<>();

        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies < max){
                ls.add(false);
            }
            else{
                ls.add(true);
            }
        }
        return ls;
    }
}