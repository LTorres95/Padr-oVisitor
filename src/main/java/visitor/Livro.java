package visitor;

public class Livro implements Material {

    private final String titulo;
    private final String autor;
    private final Editora editora;

    public Livro(String titulo, String autor, Editora editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Editora getEditora() {
        return editora;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.visitarLivro(this);
    }
}
