
class Solution {
    public List<String> buildArray(int[] target, int n) {
         ArrayList<String> ans=new ArrayList<>();
        int N=target.length;
        int index=0;
        for(int i=1;i<=n;i++){

            if(index<N && target[index]==i ){
            ans.add("Push");
            index++;
            }

            else{
                ans.add("Push");
                ans.add("Pop");
            }
            
            if(index==N) break;
        }
        return ans;
    }
}
