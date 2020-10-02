public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int em, int de) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.empates = em;
        this.derrotas = de;
    }

    public void status(){
        System.out.println(getNome());
        System.out.println(" é um lutador "+getCategoria());
        System.out.println(getVitorias()+" Vitórias");
        System.out.println(getDerrotas()+" Derrotas");
        System.out.println(getEmpates()+" Empates");
        System.out.println("------------------------");
    }
    public void apresentar(){
        System.out.println("Lutador: "+getNome());
        System.out.println("Origem: "+getNacionalidade());
        System.out.println(getIdade()+" anos.");
        System.out.println(getAltura()+" m de altura.");
        System.out.println("Pesando: "+getPeso()+"kg");
        System.out.println("Ganhou: "+getVitorias());
        System.out.println("Empatou: "+getEmpates());
        System.out.println("Perdeu: "+getDerrotas());
        System.out.println("_________________________");
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1) ;
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    // metodos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso < 52.2){
            categoria = "Inválido";
        }else if(this.peso <= 70.3){
            categoria = "Peso Leve";
        }else if(this.peso <= 83.9){
            categoria = "Peso Medio";
        }else if(this.peso <= 120.2){
            categoria = "Peso Pesado";
        }else{
            categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
