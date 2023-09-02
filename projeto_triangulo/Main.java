package projeto_triangulo;
import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner;
        Triangulo triangulo;
        String tipo;
        float a, b, c;

        scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){

            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();

            triangulo = new Triangulo(a, b, c);
            tipo = triangulo.getTipoTriangulo();
            System.out.println(tipo);

        }

    }

}
