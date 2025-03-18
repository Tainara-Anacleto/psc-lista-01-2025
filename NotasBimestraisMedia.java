import java.util.Scanner;

public class NotasBimestraisMedia {
    public static void main(String[] args) {
        
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
       double nota1 = scanner.nextDouble();

       System.out.println("Digite o segundo número: ");
       double nota2 = scanner.nextDouble();

       System.out.println("Digite o terceiro número: ");
       double nota3 = scanner.nextDouble();

       System.out.println("Digite o quarto número: ");
       double nota4 = scanner.nextDouble();

       media = (nota1 + nota2 + nota3 + nota4)/4;
System.out.println("A média é: " + media);
       
scanner.close();
    }
    
}