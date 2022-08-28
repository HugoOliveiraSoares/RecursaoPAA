public class ex3 {
    public static void main(String[] args) {
       System.out.println(decimalParabinario(10));
    }

    static String decimalParabinario(int numero){

        String binario = "";

        if (numero == 0) return "0";
        binario = Integer.toString(numero % 2) + binario;
        return decimalParabinario(numero / 2) + binario;

    }

}
