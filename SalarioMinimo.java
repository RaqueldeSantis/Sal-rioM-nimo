import java.util.Scanner;

// Programa que calcula a quantidade de salários mínimos que o usuário ganha
public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Mensagem de boas-vindas
        System.out.println("Bem-vindo(a)!");

        // Valor do salário mínimo
        double salarioMinimo = 1412.00;
        
        // Solicitar o valor do salário do usuário
        System.out.println("Digite o valor do seu salário:");
        double salarioUsuario = scanner.nextDouble();
        
        // Calcular a quantidade de salários mínimos que o usuário ganha
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
        
        // Imprimir o resultado
        System.out.printf("Você ganha %.2f salários mínimos.%n", quantidadeSalariosMinimos);
    }
}
