package projeto_usmoney;

public class Main {
 
    public static void main(String[] args) {
        
        USMoney x,y,z;

        // Caso de teste 01
        x = new USMoney(5, 80);
        y = new USMoney(1, 90);
        z = x.plus(y);
        System.out.println(z.getAll());

        // Caso de teste 02
        x = new USMoney(9, 90);
        y = new USMoney(9, 90);
        z = x.plus(y);
        System.out.println(z.getAll());

        // Caso de teste 03
        x = new USMoney(0, 0);
        y = new USMoney(10, 12);
        z = x.plus(y);
        System.out.println(z.getAll());

        // Caso de teste 04
        x = new USMoney(1, 999);
        y = new USMoney(10, 10);
        z = x.plus(y);
        System.out.println(z.getAll());

    }

}
