package desafio;

import java.text.Format;

//04 Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
// Calcule o valor total multiplicando o preço do produto pela quantidade e
// apresente o resultado em uma mensagem.
public class Questao04 {
    public static void main(String[] args) {
        double precoProduto = 5.5;
        int quantidade = 10;

        double valorTotal =(double) precoProduto * quantidade;



        System.out.printf("O valor total das compras é de R$%.2f", valorTotal);

    }
}
