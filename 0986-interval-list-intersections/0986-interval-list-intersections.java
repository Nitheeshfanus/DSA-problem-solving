class Solution {
public int[][] intervalIntersection(int[][] a, int[][] b) {
        
        int n1= a.length;
        int n2= b.length;
        int i=0;
        int j=0;
        List<int[]> list= new ArrayList<>();
        
        while(i < n1 && j < n2){
            int s1= a[i][0];
            int e1= a[i][1];
            int s2= b[j][0];
            int e2= b[j][1];

            if(s2 <= e1){
                if(s1 <= e2){
                    list.add(new int[]{Math.max(s1, s2),
                    Math.min(e1, e2)});
                }
            }
                if(e1 <= e2){
                    i++;
                }
                else{
                    j++;
                }
        }
        return list.toArray(new int[list.size()][2]);
    }
}