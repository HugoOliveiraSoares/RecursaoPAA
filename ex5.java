public class ex5 {
  public static void main(String[] args) {
    int[] a = { 1, 5, 10, 12, 13, 20, 30 };
    int[] b = { 2, 3, 4, 8, 15, 16, 25, 31 };
    int[] c = merge(a, b);

    for (int j:c) {
      System.out.println(j);
    }
  }

  static int[] merge(int[] a, int[] b){
    int[] c = new int[a.length + b.length];
    return merge(a, b, c, 0, 0, 0);
  }

  static int[] merge(int[] a, int[] b, int[] c, int posA, int posB, int posC) {

    if (posA >= a.length ){
      c[posC] = b[posB];
      return c;
    } else if (posB >= b.length) {
      c[posC] = a[posA];
      return c;
    }

    if (a[posA] <= b[posB]) {
      c[posC] = a[posA];
      merge(a, b, c, ++posA, posB, ++posC);
    } else {
      c[posC] = b[posB];
      merge(a, b, c, posA, ++posB, ++posC);
    }
    return c;
  }
}
