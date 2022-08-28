public class ex6 {

    public static void main(String[] args) {
        System.out.println(contaDigitos(2084));
    }

    static int contaDigitos(int numero) {
        int quantidade = 0;
        if (numero % 10 == numero) return 1;
        quantidade++;
        return quantidade += contaDigitos(numero/10);
    }

}
