import java.util.Scanner;

public class Calculadoraoperacoesbasicas {
    public static void main(String[] args) {
        
        int n1;
        int n2;
    
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
n1 = imput.nextInt();
System.out.println("Digite o segundo número: ");
n2 = imput.nextInt();

System.out.println("soma: "+(n1+n2));
System.out.println("subtração: "+(n1-n2));
System.out.println("divisão: "+(n1/n2));
System.out.println("multiplicação: "+(n1*n2));


    }
}

