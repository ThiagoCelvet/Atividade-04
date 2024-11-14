abstract class Passaros {

    public abstract void canto();

    public void voar(){

        System.out.println("O passaro está voando.");

    }
}


class Canario extends Passaros {
    @Override
    public void canto() {
        System.out.println("O canario canta: triiiiim");
    }
}


class bemteVi extends Passaros{
    @Override
    public void canto() {
        System.out.println("O Bem-te-vi canta: Bem-te-vi");
    }
}


