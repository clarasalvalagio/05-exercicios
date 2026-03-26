import java.util.Scanner;

public class Esercicio08 {
    public static void main(String[] args) {

        // Declaração de Variáveis
        Scanner sc = new Scanner(System.in);

        int valortresd, dezena;

        // Entrada de Dados
        System.out.println("Digite um número inteiro que contenha apenas três dígitos: ");
        valortresd = sc.nextInt();

        // Processamento de Dados
        dezena = valortresd % 100 / 10;


        //Saída de Dados
        System.out.println("O valor da dezena de seu número é o: " + dezena);
    }
}
