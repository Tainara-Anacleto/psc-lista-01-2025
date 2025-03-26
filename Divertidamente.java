import java.util.Scanner;

public class Divertidamente {
   public static void main(String[] args){

    int qtdeAmizades, emocaoAlegria = 0, emocaoTristeza = 0, qtdeAlgorit;
    double A1, A2, A3, media;

   Scanner scanner = new Scanner(System.in);
    System.out.println("Quantas amizades Riley Fez: ");
    qtdeAmizades = scanner.nextInt();

    if (qtdeAmizades==0){
        emocaoTristeza += 30;
    }
    else{
        emocaoAlegria += (qtdeAmizades * 10);
    }
        System.out.println("Informe o valor da primeira nota: ");
        A1 = scanner.nextInt();
        System.out.println("Informe o valor da segunda nota: ");
        A2 = scanner.nextInt();
        System.out.println("Informe o valor da terceira nota: ");
        A3 = scanner.nextInt();

        media = (A1 + A2 + A3)/3;

        if (media >= 7){
        emocaoAlegria += 50;
        }
        else{
        emocaoTristeza += 50;
        }
        
        System.out.println("Quantos Algoritmos Riley conseguiu fazer: ");
        qtdeAlgorit = scanner.nextInt();

        if (qtdeAlgorit==0){
            emocaoTristeza += 10;
        }
        else {
            emocaoAlegria += (qtdeAlgorit * 10);
        }
        System.out.println(emocaoAlegria + emocaoTristeza);

        scanner.close();
        }

        
        }

   

