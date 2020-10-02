public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Joao cairiton","Libano",24,1.83f,65.0f,12,2,1);
        l[1] = new Lutador("José da Silva","Brasil",21,1.77f,69.0f,19,0,1);
        l[2] = new Lutador("Cachoeira","França",26,1.80f,76.0f,20,1,3);
        l[3] = new Lutador("Carlos shrek","EUA",28,1.74f,78.0f,8,3,5);
        l[4] = new Lutador("Fabiano Foca","Russia",34,1.91f,96.0f,5,0,3);
        l[5] = new Lutador("Emerson Touro","Argentina",37,1.90f,100.0f,35,4,8);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1],l[5]);
        UEC01.lutar();
        l[0].status();
        l[1].status();

    }
}
