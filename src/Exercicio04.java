import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        // Declaração de Variáveis - Criar Variáveis
        Scanner sc = new Scanner(System.in);

        double quilowatt, salario, valorqw, conta;

        // Entrada de Dados
        System.out.println("Digite o valor do Salário Mínimo: ");
        salario = sc.nextDouble();

        System.out.println("Digite a quantidade de Quilowatt gasto na sua residêmcia: ");
        quilowatt = sc.nextDouble();

        // Processamento de Dados
        valorqw = salario / 7 / 100;
        conta = quilowatt * valorqw;

        // Saída de Dados
        System.out.println("Valor da Conta: " + conta + " Reais");

        System.out.println("Valor do quilowatt: " + valorqw + " Reais");

        System.out.println("Valor da conta com 10%: " + conta * 0.90 + " Reais");
    }
}
