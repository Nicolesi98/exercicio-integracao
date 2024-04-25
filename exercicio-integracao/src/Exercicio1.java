import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        /* Questão: Inverter String
        Crie um método que recebe do usuário uma String de entrada e retorna na tela
        a String invertida. Ex: Banana -> ananaB;
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma palavra para ser invertida:");
        String palavra = scanner.nextLine();

        String palavraInvertida = invertePalavra(palavra);

        System.out.println("Palavra invertida: " + palavraInvertida);
    }

    private static String invertePalavra(String palavra) {
        StringBuilder sb = new StringBuilder(palavra);
        sb.reverse();
        return sb.toString();
    }
}