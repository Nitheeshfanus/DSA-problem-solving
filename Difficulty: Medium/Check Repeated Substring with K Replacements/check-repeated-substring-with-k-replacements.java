class Solution {
    public boolean kSubstr(String s, int k) {
        // code here
        HashMap<String, Integer> hm= new HashMap<>();
        int n= s.length();
        
        int l= 0;
        for(int i= k; i<=n; i+=k){
            String ss= s.substring(l,i);
       //  System.out.println(ss);
            hm.put(ss, hm.getOrDefault(ss,0)+1);
            
            if(hm.size() > 2){
                return false;
            }
            
            l=i;
        }
            
        if(hm.size() ==1){
                return true;
            }
        int c= (n/k)-1;
     //   System.out.println(c);
        for(int i: hm.values()){
     //        System.out.println(i);
            if(i == 1){
                return true;
            }
        }
        return false;
        
    }
}