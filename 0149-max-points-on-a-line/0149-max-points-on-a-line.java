public class Solution {
    public static int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n; 

        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 1; 
            for (int j = i + 1; j < n; j++) {
                int tempCount = 2; 
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j) {
                        int x1 = points[i][0], y1 = points[i][1];
                        int x2 = points[j][0], y2 = points[j][1];
                        int x3 = points[k][0], y3 = points[k][1];
                        if ((y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1)) {
                            tempCount++;
                        }
                    }
                }
                
                if (tempCount > maxCount) {
                    maxCount = tempCount;
                }
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[][] points = {{1,1}, {2,2}, {3,3}};
        System.out.println("Maximum points on a line: " + maxPoints(points));
    }
}