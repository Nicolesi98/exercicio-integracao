import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        /*
         Questão: Tamanho da String
        Crie um método que recebe como parâmetro uma String e retorna quantos
        caracteres existem na String.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma palavra para verificarmos o tamanho:");
        String palavra = scanner.nextLine();

        int tamanhoPalavra = contaTamanhoPalavra(palavra);

        System.out.println("O tamanho da palavra: "+palavra+ " é: " + tamanhoPalavra);
    }

    private static int contaTamanhoPalavra(String palavra) {
        return palavra.length();
    }
}