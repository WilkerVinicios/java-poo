public class Ave extends Animal{
    private  String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piando");
    }

    public void fazerNinho(){
        System.out.println("Constriu um Ninho");
    }
}
