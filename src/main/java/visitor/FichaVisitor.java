package visitor;

public class FichaVisitor implements Visitor {

    @Override
    public String visitarLivro(Livro livro) {
        return "Livro: " + livro.getTitulo()
                + " | Autor: " + livro.getAutor()
                + " | Editora: " + livro.getEditora().getNome();
    }

    @Override
    public String visitarRevista(Revista revista) {
        return "Revista: " + revista.getTitulo()
                + " | Número: " + revista.getNumero();
    }

    @Override
    public String visitarDVD(DVD dvd) {
        return "DVD: " + dvd.getTitulo()
                + " | Duração: " + dvd.getDuracao() + " min";
    }
}
