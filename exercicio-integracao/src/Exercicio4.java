import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        /*
        Questão: Contagem de Vogais e Consoantes
        Crie um método que recebe do usuário uma palavra ou frase como parâmetro, e
        em seguida, use um loop para contar o número de vogais e consoantes na
        entrada. Use uma função que recebe como parâmetro a String do usuário e
        realiza a contagem
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma palavra para contar as vogais e consoantes:");
        String palavra = scanner.nextLine();

        verificaVogais(palavra);
        verificaConsoantes(palavra);

    }

    // Colocamos void pois o método não retorna nada, autocontido
    private static void verificaVogais(String palavra) {
        int contaVogal = 0;
        String vogais = "";

        for(int i = 0;i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            if(eVogal(letra)){
                vogais += letra + ",";
                contaVogal++;
            }
        }

        System.out.println("O total de vogais na palavra: "+palavra+ " é: " + contaVogal +" e as vogais são: " + vogais);
    }

    private static void verificaConsoantes(String palavra) {
        int contaConsoantes = 0;
        String consoantes = "";

        for(int i = 0;i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            if(!eVogal(letra)){
                consoantes += letra + ",";
                contaConsoantes++;
            }
        }

        System.out.println("O total de consoantes na palavra: "+palavra+ " é: " + contaConsoantes +" e as consoantes são: " + consoantes);
    }

    private static boolean eVogal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
}