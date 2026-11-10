package visitor;

public class DVD implements Material {

    private final String titulo;
    private final int duracao;

    public DVD(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.visitarDVD(this);
    }
}
