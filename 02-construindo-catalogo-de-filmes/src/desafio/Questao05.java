package desafio;
//05 Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
// Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do
// valor em dólares para reais e imprima o resultado formatado.


import static java.lang.System.out;

public class Questao05 {
    public static void main(String[] args){

        double valorEmDorlares = 10.50;
        double taxaDeConversao = 4.94;

        double real = valorEmDorlares * taxaDeConversao;
                out.printf("R$%.2f%n", real);
    }
}
