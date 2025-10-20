class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s:operations){
            switch(s){
                case("--X"):
                    x=x-1;
                    break;
                
                case("X--"):
                    x=x-1;
                    break;
                
                case("X++"):
                    x=x+1;
                    break;
                
                case("++X"):
                    x=x+1;
                    break;
                
            }
        }
        return x;
    }
}