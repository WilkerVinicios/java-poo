public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[6];
        v[0] = new Video("Aula de POO 01");
        v[1] = new Video("Aula de POO 02");
        v[2] = new Video("Aula de POO 03");
        v[3] = new Video("Aula de POO 04");
        v[4] = new Video("Aula de POO 05");
        v[5] = new Video("Aula de POO 06");

        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Joao Cairiton",24,"M","auauau");
        g[1] = new Gafanhoto("Maria Eduarda",12,"F","maria01");
        g[2] = new Gafanhoto("Antonia Otacilia",6,"F","ant01");

        System.out.println("");
        System.out.println(v[0].toString());
        System.out.println("");
        System.out.println(g[0].toString());
        System.out.println("");

        Visualizacao ver[] = new Visualizacao[3];
        ver[0] = new Visualizacao(g[2],v[3]);
        ver[0].avaliar();
        System.out.println(ver[0].toString());
        System.out.println("");

        ver[1] = new Visualizacao(g[1],v[2]);
        ver[1].avaliar(8);
        System.out.println(ver[1].toString());
        System.out.println("");

        ver[2] = new Visualizacao(g[0],v[2]);
        ver[2].avaliar(2);
        System.out.println(ver[2].toString());
        System.out.println("");

        ver[1] = new Visualizacao(g[1],v[1]);
        ver[1].avaliar(70f);
        System.out.println(ver[1].toString());
        System.out.println("");

        ver[1] = new Visualizacao(g[1],v[4]);
        ver[1].avaliar(50f);
        System.out.println(ver[1].toString());
        System.out.println("");
    }

}
