public class Selection {
    private int[] a;
    private int max;
    public Selection (int s) {
        a=new int[s];
        max = s;
    }

    public void insert(int i,int value) {
        a[i]=value;
    }

    public void display() {
        for (int j=0;j<max;j++)
            System.out.print(a[j]+" ");
        System.out.println(" ");
    }

    public void SelectionSort() {
        int i,index,j,small;
        for (i=0;i<max-1;i++) {
            small = a[i+1];
            index = i+1;
            for (j=i+2;j<max;j++) {
                if (a[j]<small){
                    small=a[j];
                    index=j;
                }
            }
            if (a[index]<a[i]) {
                a[index]=a[i];
                a[i]=small;
            }
            for (j=0;j<max;j++) {
                System.out.println(a[j]+" ");
                System.out.println("");
            }
        }
    }
}
