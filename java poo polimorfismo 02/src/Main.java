public class Main {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        Lobo lobo = new Lobo();
        Cachorro dog = new Cachorro();

        mamifero.emitirSom();
        lobo.emitirSom();
        dog.emitirSom();

        dog.reagir("ola");
        dog.reagir(true);
        dog.reagir("Vai apanhar");
        dog.reagir(11,43);
        dog.reagir(21,00);
        dog.reagir(false);
        dog.reagir(2,12.5f);
        dog.reagir(17,4.5f);
    }
}
