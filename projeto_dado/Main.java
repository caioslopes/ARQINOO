package projeto_dado;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Dado dado;
        int input;
        int i = 0;
        int d;
        int lance = 0;
        int soma = 0;

        input = scanner.nextInt();

        while(i < 3){

            if(lance != 2){
                dado = new Dado(input);
                d = dado.lancarDado();
                System.out.printf("dado[%d]: %d ",lance+1, d);
                soma += d;
                lance++;
            }else{
                System.out.println("-> "+soma);
                lance = 0;
                soma = 0;
                i++;
            }

        }


    }

}