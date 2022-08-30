import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = le.nextInt();
        System.out.println(somatorio(n));
    }

    static int somatorio(int n){
        int soma = 0;
        if (n == 0) return soma;

        soma += n;
        return soma += somatorio(--n);
    }

}
