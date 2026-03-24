import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        // Declaração de Variáveis
        Scanner sc = new Scanner(System.in);

        double vhoraaula, pdescontoINSS,salbruto, vdescontado, salliquido;
        int nhtrabalhadas;

        // Entrada de Dados
        System.out.println("Digite o valor da hora-aula: ");
        vhoraaula = sc.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        nhtrabalhadas = sc.nextInt();

        System.out.println("Digite a porcentagem de desconto do INSS: ");
        pdescontoINSS = sc.nextDouble();

        // Processamento de Dados
        salbruto = vhoraaula * nhtrabalhadas;

        vdescontado = salbruto * (pdescontoINSS/100);

        salliquido = salbruto - vdescontado;

        // Saída de Dados
        System.out.println("O valor de seu salário bruto é de R$: " + salbruto);

        System.out.println("O valor do desconto do INSS é de R$: " + vdescontado);

        System.out.println("O valor de seu salário líquido é de R$: " +
                String.format("%.2f",salliquido));
        // Formatação para exibir o resultado apenas com duas casas decimais



    }
}
