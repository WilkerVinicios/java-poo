public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Jose");
        v1.setIdade(35);
        v1.setSexo("M");

        System.out.println(v1.toString());
        System.out.println("______-______");

        Aluno a1 = new Aluno();
        a1.setNome("joao");
        a1.setMatricula(1221234);
        a1.setIdade(24);
        a1.setSexo("nao binario");
        a1.setCurso("Design Grafico");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(122212);
        b1.setNome("Edu");
        b1.setBolsa(12.7f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
