package visitor;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FichaVisitorTest {

    @Test
    void deveGerarFichaDoLivroComEditora() {
        Material livro = new Livro("Dom Casmurro", "Machado de Assis", new Editora("Ática"));

        assertEquals("Livro: Dom Casmurro | Autor: Machado de Assis | Editora: Ática",
                livro.aceitar(new FichaVisitor()));
    }

    @Test
    void deveGerarFichaDaRevista() {
        Material revista = new Revista("Ciência Hoje", 420);

        assertEquals("Revista: Ciência Hoje | Número: 420",
                revista.aceitar(new FichaVisitor()));
    }

    @Test
    void deveGerarFichaDoDVD() {
        Material dvd = new DVD("Central do Brasil", 110);

        assertEquals("DVD: Central do Brasil | Duração: 110 min",
                dvd.aceitar(new FichaVisitor()));
    }

    @Test
    void deveVisitarMateriaisDiferentesDoMesmoAcervo() {
        List<Material> acervo = List.of(
                new Livro("O Cortiço", "Aluísio Azevedo", new Editora("Moderna")),
                new Revista("Superinteressante", 480),
                new DVD("Ilha das Flores", 13));
        Visitor visitor = new FichaVisitor();

        List<String> fichas = acervo.stream()
                .map(material -> material.aceitar(visitor))
                .toList();

        assertEquals(List.of(
                "Livro: O Cortiço | Autor: Aluísio Azevedo | Editora: Moderna",
                "Revista: Superinteressante | Número: 480",
                "DVD: Ilha das Flores | Duração: 13 min"), fichas);
    }
}
