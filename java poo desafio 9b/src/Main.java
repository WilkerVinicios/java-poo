public class Main {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Joao",24,"M");
        p[1] = new Pessoa("George",18,"M");

        l[0] = new Livro("Fique Rico ou Morra Tentando","50cent",400,p[0]);
        l[1] = new Livro("Seja Foda","Caio Carneiro",260,p[1]);
        l[2] = new Livro("12 Dias para atualizar sua Vida","Tiago Brunet",190,p[0]);

        System.out.printf(l[0].detalhes());

        l[0].abrir();
        l[0].folhear(190);
        l[0].avancarPag();
        System.out.printf(l[0].detalhes());
    }

}
