public class TiposVariavies {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;

        int numeroNormal = numeroCurto;
        
        //Cast
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        
        numero = 2;

        System.out.println(numero);

        //Constante, que não pode ser modificada devido a palavra reservada final e CAIXA ALTA
        final double VALOR_DE_PI = 3.14;
    }
}
