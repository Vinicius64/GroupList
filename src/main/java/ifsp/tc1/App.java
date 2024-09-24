package ifsp.tc1;

public class App {
    private int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean listsHaveNLength(int[] a, int[] b) {
        return a.length == n && b.length == n;
    }

    public int[] intercalate(int[] a, int[] b) {
        int[] c = new int[2*n];
        for (int i = 0; i < n; i++) {
            c[2 * i] = a[i];
            c[2 * i + 1] = b[i];
        }
        return c;
    }
}
