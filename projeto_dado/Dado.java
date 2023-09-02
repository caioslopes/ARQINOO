package projeto_dado;
import java.util.Random;

public class Dado {

    private int lados;

    public Dado(int n){
        if(n > 0){
            this.lados = n;
        }
    }

    public int lancarDado(){
        int numero = 0;
        Random random = new Random();
        numero = random.nextInt(lados) + 1;
        return numero;
    }

}
