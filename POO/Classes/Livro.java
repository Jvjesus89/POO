package Classes;

public class Livro {

    private Integer código;
    private String titulo;
    private String autor;
    private Integer nrPaginas;
   
   


    public Livro(Integer código, String titulo, String autor, Integer nrPaginas) {
        this.código = código;
        this.titulo = titulo;
        this.autor = autor;
        this.nrPaginas = nrPaginas;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getCódigo() {
        return código;
    }
    public void setCódigo(Integer código) {
        this.código = código;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getNrPaginas() {
        return nrPaginas;
    }
    public void setNrPaginas(Integer nrPaginas) {
        this.nrPaginas = nrPaginas;
    }

    @Override
    public String toString() {
        return "Livro [Código=" + código + ", autor=" + autor + ", nrPaginas=" + nrPaginas + ", titulo=" + titulo + "]";
    }

    
}

