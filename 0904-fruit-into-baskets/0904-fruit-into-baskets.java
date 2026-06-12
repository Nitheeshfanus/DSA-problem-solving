class Solution {
    public int totalFruit(int[] f) {
        int n= f.length;
        HashMap<Integer, Integer> hs= new HashMap<>();

        int max=0;
        int i= 0; 
        int j= 0;

        while(j < n)
        {
            hs.put(f[j], hs.getOrDefault(f[j],0)+1);

            
                while(hs.size() > 2){
                    hs.put(f[i], hs.get(f[i])-1);
                
                if(hs.get(f[i]) ==0 ){
                        hs.remove(f[i]);
                    }
                    i++;
                }
            
            max= Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}