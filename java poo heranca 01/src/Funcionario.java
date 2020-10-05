public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void statusTrabalho(){
        if(this.trabalhando == false) {
            this.trabalhando = true;
            System.out.println("Funcionario está Trabalhando!");
        }else{
            this.trabalhando = false;
            System.out.println("Funcionario parou o trabalho!");
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
