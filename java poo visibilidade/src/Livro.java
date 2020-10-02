public class Livro {
    private int isbn;
    public String titulo;
    public String autor;
    protected int paginas;
    private boolean fechado;

    public Livro(int isbn, String titulo, String autor, int paginas, boolean fechado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.fechado = fechado;
    }

    public void status(){
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero de Pg: " + this.paginas);
        System.out.println("Esta fechado ?: " + this.fechado);
    }
    protected void abrir(){
        this.fechado = false;

    }
    protected void fechar(){
        this.fechado = true;
    }
    public void lendo(){
        if(this.fechado == false){
            System.out.println("Estou lendo o Livro!");
        }else{
            System.out.println("Não é possivel LER o livro. Ele está fechado!");
        }

    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }
}
