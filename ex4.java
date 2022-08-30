public class ex4 {

  public static void main(String[] args) {
    System.out.println(mdc(18, 12));
  }

  static int mdc(int numero1, int numero2) {

   if (numero2 == 0){
     return numero1;
   }else {
     return mdc(numero2, numero1 % numero2);
   }

  }

}
