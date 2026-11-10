package visitor;

public interface Visitor {

    String visitarLivro(Livro livro);

    String visitarRevista(Revista revista);

    String visitarDVD(DVD dvd);
}
