class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        Arrays.sort(arr2);

        int count = 0;

        for(int x : arr1) {

            if(!Bsearch(x, arr2, d)) {
                count++;
            }
        }

        return count;
    }

    public boolean Bsearch(int num, int[] a2, int d) {

        int i = 0;
        int j = a2.length - 1;

        while(i <= j) {

            int mid = i + (j - i) / 2;

            if(Math.abs(a2[mid] - num) <= d) {
                return true;
            }

            else if(a2[mid] < num) {
                i = mid + 1;
            }

            else {
                j = mid - 1;
            }
        }

        return false;
    }
}