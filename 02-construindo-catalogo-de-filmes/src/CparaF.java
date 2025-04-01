public class CparaF {
    public static void main(String[]args){
        double celsius = 30.4;
        double temperatura = (celsius * 1.8) + 32;
        int fahrenheit = (int) temperatura;
        System.out.println(String.format("Atemperatura é de %dº graus fahrenheit", fahrenheit));

    }
}
