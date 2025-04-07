package desafio;
// 6 - Declare uma variável do tipo double precoOriginal. Atribua um valor em reais
// a essa variável, representando o preço original de um produto. Em seguida,
// declare uma variável do tipo double percentualDesconto e atribua um valor
// percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor
// do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.


public class Questao06 {
    public static void main(String [] args){
        double precoOriginal = 29.90;
        double percentualDeDesconto = 10;
        double total = (precoOriginal*100)/10;
        System.out.println("Preço com desconto: %.2f%n", total);

    }}
