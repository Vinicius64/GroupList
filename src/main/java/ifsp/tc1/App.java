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
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = i;
        }
        return c;
    }
}
