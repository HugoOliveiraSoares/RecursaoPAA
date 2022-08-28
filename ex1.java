public class ex1 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        inverter(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void inverter(int[] v, int pos, int pos_fim) {
        if (pos < v.length / 2) {

            int x = v[pos];
            v[pos] = v[pos_fim];
            v[pos_fim] = x;

            inverter(v, ++pos, --pos_fim);
        }
    }

}
