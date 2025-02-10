public class QuickSort {
    private int[] a;
    private int max;

    public QuickSort(int s) {
        a = new int[s];
        max = s;
    }

    public void insert(int i, int value) {
        a[i] = value;
    }

    public void display() {
        for (int j = 0; j < max; j++)
            System.out.print(a[j] + " "); // Fixed missing space
        System.out.println();
    }

    public void quicksort(int left, int right) {
        int pivot;
        if (right - left > 0) {
            pivot = partition(left, right);
            quicksort(left, pivot - 1);
            quicksort(pivot + 1, right);
        }
    }

    public int partition(int left, int right) {
        int[] greater = new int[a.length];
        int k = left + 1, gsize = 0;

        for (int i = left + 1; i <= right; i++) {
            if (a[i] < a[left]) {
                a[k++] = a[i];
            } else {
                greater[gsize++] = a[i];
            }
        }

        int temp = a[left];
        a[left] = a[k - 1];
        a[k - 1] = temp;

        for (int i = 0; i < gsize; i++)
            a[k + i] = greater[i]; // Fixed incorrect index

        // Properly formatted display after partition
        for (int j = 0; j < max; j++)
            System.out.print(a[j] + " "); // Fixed newline issue
        System.out.println();

        return k - 1;
    }

    public static void main(String[] args) {
        int maxSize = 8;
        QuickSort arr;
        arr = new QuickSort(maxSize);
        arr.insert(0,4);
        arr.insert(1,2);
        arr.insert(2,7);
        arr.insert(3,1);
        arr.insert(4,9);
        arr.insert(5,3);
        arr.insert(6,6);
        arr.insert(7,5);
        arr.display();
        arr.quicksort(0,maxSize-1);

    }
}
