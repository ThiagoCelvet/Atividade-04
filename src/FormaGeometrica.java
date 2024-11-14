 abstract class FormaGeometrica {

    public abstract double calcularArea();

    public String tipoForma(){

     return "FormaGeométrica";

    }
}

 class Circulo extends FormaGeometrica{

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){

        return Math.PI * raio * raio;

    }
}

 class Retangulo extends FormaGeometrica{

    private  double largura;
    private double altura;

    public Retangulo(double largura, double altura){

        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea(){
        return largura * altura;
    }
 }
