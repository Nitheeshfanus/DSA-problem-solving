class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
         Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int n1=players.length;
        int j=0;
        int n2=trainers.length;
        int count=0;
        while(i<n1 && j<n2){
            if(i<n1 && players[i]<=trainers[j]){
                i++;
                j++;
                count++;
            }
            else{
                j++;
            }
        }
        return count;
         
    }
}