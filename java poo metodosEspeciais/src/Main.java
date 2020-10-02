public class Main {
    public static void main(String[] args) {

    ContaBanco p1 = new ContaBanco();
    p1.setNumConta(1212);
    p1.setDono("Joao");
    p1.abrirConta("CC");

    ContaBanco p2 = new ContaBanco();
    p2.setNumConta(1122);
    p2.setDono("Maria");
    p2.abrirConta("CP");

    p1.depositar(100);
    p2.depositar(500);
    p2.sacar(130);

    p1.estadoAtual();
    p2.estadoAtual();


    }
}
