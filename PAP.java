import java.util.Scanner;

public class PAP {
    public static void main(String[] args) {
        double precoLitro, qtdeLitros, precoApagar;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Quanto está o litro de gasolina: ");
        precoLitro = scanner.nextDouble();

        System.out.println("Quantos litros será vendido: ");
        qtdeLitros = scanner.nextDouble();

        precoApagar = precoLitro * qtdeLitros;

        System.out.println("Você pagará: " + precoApagar);
        scanner.close();
    
    }
    
}
