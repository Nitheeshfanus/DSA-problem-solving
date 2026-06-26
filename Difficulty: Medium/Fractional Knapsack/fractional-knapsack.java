class Item {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {

        int n = val.length;

        Item[] items = new Item[n];

        for (int i = 0; i < n; i++) {
            items[i] = new Item(val[i], wt[i]);
        }

        Arrays.sort(items, (a, b) ->
            Double.compare(
                (double) b.value / b.weight,
                (double) a.value / a.weight
            )
        );

        double ans = 0;

        for (Item item : items) {

            if (item.weight <= capacity) {
                ans += item.value;
                capacity -= item.weight;
            } else {
                ans += ((double) capacity / item.weight) * item.value;
                break;
            }
        }

        return ans;
    }
}