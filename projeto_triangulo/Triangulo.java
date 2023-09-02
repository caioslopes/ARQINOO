package projeto_triangulo;

public class Triangulo {
    
    private float a;
    private float b;
    private float c;
    private boolean ehValido;

    public Triangulo(float a, float b, float c){
        ehValido = false;
        if(a > 0 && b > 0 && c > 0){
            if(a + b > c){
                if(b + c > a){
                    if(a + c > b){
                        this.a = a;
                        this.b = b;
                        this.c = c;
                        ehValido = true;
                    }
                }
            }
        }
    }

    private boolean ehEquilatero(){
        boolean retorno;
        retorno = false;
        if(ehValido){
            if(a == b && b == c){
                retorno =  true;
            }
        }
        return retorno;
    }

    private boolean ehIsoceles(){
        boolean retorno;
        retorno = false;
        if(ehValido){
            if(a == b || b == c || a == c){
                retorno = true;
            }
        }
        return retorno;
    }

    private boolean ehEscaleno(){
        boolean retorno;
        retorno = false;
        if(ehValido){
            if(a != b){
                if(b != c){
                    retorno = true;
                }
            }
        }
        return retorno;
    }

    public String getTipoTriangulo(){
        if(ehValido){
            if(ehEquilatero()){
                return "Equilátero";
            }
            if(ehIsoceles()){
                return "Isóceles";
            }
            if(ehEscaleno()){
                return "Escaleno";
            }
        }
        return "Triângulo Inválido";
    }


}
