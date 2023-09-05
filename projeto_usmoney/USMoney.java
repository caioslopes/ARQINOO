package projeto_usmoney;

/**
 * USMoney
 */
public class USMoney {

    private int dollars;
    private int cents;

    public USMoney(int d,int c){
        if(d >= 0 && c >= 0){
            int aux = 0;
            while(c > 99){
                aux = c/100;
                c = c%100;
            }
            this.cents = c;
            this.dollars = d + aux;
        } 
    }

    public USMoney plus(USMoney obj){
        USMoney x;
        x = new USMoney((this.dollars+obj.dollars), (this.cents+obj.cents));
        return x;
    }

    public String getAll(){
        if(this.cents <= 9){
            return "$"+this.dollars+".0"+this.cents;
        }else{
            return "$"+this.dollars+"."+this.cents;
        }
    }

}