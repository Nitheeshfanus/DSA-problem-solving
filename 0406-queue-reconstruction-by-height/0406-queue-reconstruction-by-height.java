class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int n= people.length;

        Arrays.sort(people, (a,b) ->{
        if(a[0] == b[0])
            return a[1]-b[1];
        return b[0]-a[0];
        });

ArrayList<int[]> lis= new ArrayList<>();

    for(int i=0; i<n; i++){
        lis.add(people[i][1], people[i]);
    }
    
    int[][] arr= new int[n][2];
    for(int i=0;i<n; i++){
        arr[i]= lis.get(i);
    }

    return arr;
     }
}