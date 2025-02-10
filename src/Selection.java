public class Selection {
    private int[] a;
    private int max;

    public Selection(int s) {
        a = new int[s];
        max = s;
    }

    public void insert(int i, int value) {
        a[i] = value;
    }

    public void display() {
        for (int j = 0; j < max; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }

    public void SelectionSort() {
        for (int i = 0; i < max - 1; i++) {
            int index = i;
            for (int j = i + 1; j < max; j++) {
                if (a[j] < a[index]) {
                    index = j; // Update index of the smallest element
                }
            }
            // Swap
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;

            // Print step by step
            System.out.println("Step " + (i + 1) + ":");
            for (int k = 0; k < max; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int maxSize = 6;
        Selection arr = new Selection(maxSize);

        arr.insert(0, 44);
        arr.insert(1, 17);
        arr.insert(2, 40);
        arr.insert(3, 32);
        arr.insert(4, 11);
        arr.insert(5, 14);

        System.out.println("Before Sorting:");
        arr.display();

        arr.SelectionSort();

        System.out.println("After Sorting:");
        arr.display();
    }
}
