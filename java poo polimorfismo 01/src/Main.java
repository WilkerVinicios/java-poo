public class Main {
    public static void main(String[] args) {
        //Animal n = new Animal();
        Mamifero m = new Mamifero();
        Ave a = new Ave();
        Reptil r = new Reptil();
        Peixe p = new Peixe();

        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga turtle = new Tartaruga();
        GoldFish fish = new GoldFish();
        Arara arara = new Arara();

        canguru.locomover();
        cachorro.locomover();
        cachorro.emitirSom();
    }
}
