public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno alu = new Aluno();
        Professor prof = new Professor();
        Funcionario func = new Funcionario();

        p1.setNome("Joao");
        alu.setNome("Maria");
        prof.setNome("Faustino");
        func.setNome("Rafael Gaudino");

        p1.setSexo("M");
        alu.setSexo("F");
        prof.setSexo("M");
        func.setSexo("M");

        alu.setIdade(19);
        prof.receberAumento(200);
        func.isTrabalhando();
        prof.setEspecialidade("POO");
        alu.cancelarMatricula();

        System.out.println(p1.toString());
        System.out.println(alu.toString());
        System.out.println(prof.toString());
        System.out.println(func.toString());
    }
}
