import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        // Declaração de Variáveis
        Scanner sc = new Scanner(System.in);

        int numero, unidade , dezena, centena, invertido;

        // Entradada de Dados
        System.out.println("Digite um número que contenha três digitos: ");
        numero = sc.nextInt();

        // Processamento de Dados
        unidade = numero % 10;

        dezena = numero % 100 / 10;

        centena = numero / 100;

        // Saída de Dados
        // "Errado"
        System.out.println(unidade + "" + dezena + "" + centena);

        // Certo
        System.out.println(invertido = unidade * 100 + dezena * 10 + centena);
    }
}
