class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n=values.length;
        boolean[] visited=new boolean[n];
        int index=0;
        long score=0;
        while(index>=0 && index<n && !visited[index]){
              visited[index]=true;
            if(instructions[index].equals("add")){
                score+=values[index];
                index++;
            }
            else{
                index+=values[index];
            }
        
        }
        return score;
    }
}
