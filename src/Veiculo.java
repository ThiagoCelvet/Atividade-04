
interface Veiculo{

    void iniciar();

    void parar();

    default void tipoVeiculo() {

        System.out.println("Tipo do Veículo");
    }
}


 class Carro implements Veiculo{
    @Override

     public void iniciar(){
        System.out.println("O carro está ligando");
    }
    @Override
     public void parar(){
        System.out.println("O carro está desligando");
    }
 }

 class Moto implements Veiculo{
    @Override
    public void iniciar(){
        System.out.println("A Moto está ligando");
    }

    @Override
    public void parar(){
        System.out.println("A moto está desligando");
    }

    @Override
    public void tipoVeiculo(){
        System.out.println("Tipo: Moto");
    }

}