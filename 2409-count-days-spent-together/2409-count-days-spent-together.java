class Solution {
    public int countDaysTogether(String aA, String lA, String aB, String lB) {

        String[] arr = {aA, lA, aB, lB};
        int[] sn = new int[4];

        int[] days = {
            0, 31, 59, 90, 120, 151,
            181, 212, 243, 273, 304, 334
        };

        for (int i = 0; i < 4; i++) {

            String[] a = arr[i].split("-");

            int mm = Integer.parseInt(a[0]);
            int dd = Integer.parseInt(a[1]);

            sn[i] = days[mm - 1] + dd;
        }

        int start = Math.max(sn[0], sn[2]);
        int end = Math.min(sn[1], sn[3]);

        return Math.max(0, end - start + 1);
    }
}