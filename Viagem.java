import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        
        double precoViagemAlemanha, precoViagemPortugal, precoViagemItalia, qtdePessoas, precoTotal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço da passagem para Alemanha: ");
        precoViagemAlemanha = scanner.nextDouble();

        System.out.println("Informe o preço da passagem para Portugal: ");
        precoViagemPortugal = scanner.nextDouble();

        System.out.println("Informe o preço da passagem para Itália: ");
        precoViagemItalia = scanner.nextDouble();

        System.out.println("Informe a quantidade de passageiros: ");
        qtdePessoas = scanner.nextDouble();

        precoTotal = (precoViagemAlemanha + precoViagemPortugal + precoViagemItalia) * qtdePessoas;

        System.out.println("O valor total será: " + precoTotal);

        scanner.close();
        
    }
    
}
