import java.text.Normalizer;

public class Main {
    public static void main(String[] args) {

        Passaros canario = new Canario();
        Passaros bemteVi = new bemteVi();

        canario.canto();
        bemteVi.canto();

        canario.voar();
        bemteVi.voar();

        FormaGeometrica circulo = new Circulo(5.0);
        FormaGeometrica retangulo = new Retangulo(4.0, 6.0);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Tipo de forma: " + circulo.tipoForma());

        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        carro.iniciar();
        carro.tipoVeiculo();
        carro.parar();

        moto.iniciar();
        moto.tipoVeiculo();
        moto.parar();


    }
}