class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalgas=0 ; 
        int totalcost=0;
        for(int i= 0 ; i< n ; i++){
             totalgas+=gas[i];
             totalcost+=cost[i];
        }
        if(totalgas<totalcost){
            return -1;
        }
        int totaldiff=0 ; 
        int start=0;
        for(int i= 0 ; i< n ; i++){
                  totaldiff+=gas[i]-cost[i];
                  if(totaldiff<0){
                    start=i+1;
                    totaldiff=0;
                  }
        }
      return start;
    }
}