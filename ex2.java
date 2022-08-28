public class ex2 {

    public static void main(String[] args) {

        int num = 762021192;
        System.out.println(contagem(num, 2));
    }

    static int contagem(int numero, int k) {

        int quantidade = 0;

       if (numero != 0) {
           int resto = numero % 10;
           if (resto == k) {
               quantidade++;
               return quantidade += contagem(numero / 10, k);
           }
           return contagem(numero / 10, k);
       }

       return quantidade;
    }



}
