//Essa aula introdutoria falou um pouco sobre variaveis, tipos de variaveis e como declarar variaveis
// e tipos primitivos.
public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match MotherFucker!");

        int anoDeLancamento = 2025;
        String  nomeDoFilme = "Warfare";

        System.out.println("O filme " + nomeDoFilme + " foi lancado em " + anoDeLancamento);

        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (notaDoFilme + 8.5 + 5.4) /3;
        System.out.println("A nota media do filme " + nomeDoFilme + " e " + String.format("%.2f",media));

        String sinopse = """
                Um grupo de mercenarios tenta tirar o controle da navelha da terra
                e destruir a humanidade de uma vez por todas.
                """;

        System.out.println(sinopse);



    }
}