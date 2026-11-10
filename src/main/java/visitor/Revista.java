package visitor;

public class Revista implements Material {

    private final String titulo;
    private final int numero;

    public Revista(String titulo, int numero) {
        this.titulo = titulo;
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.visitarRevista(this);
    }
}
