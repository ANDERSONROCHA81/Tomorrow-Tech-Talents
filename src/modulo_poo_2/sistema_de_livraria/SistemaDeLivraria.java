package modulo_poo_2.sistema_de_livraria;

import java.time.LocalDate;
import java.util.List;

public class SistemaDeLivraria {
    public static void main(String[] args) {
        Livraria livraria = new Livraria();
        //Cliente cliente1 = new Cliente("Roberto", 4558522, "214.558.125-33", LocalDate.of(2000, 8, 15));

        Produto brinquedo = new Brinquedo("Boneco", 25.85, 15, "Manual");
        Produto filme = new Filme("Os Vingadores", 45.90, 25, "Marvel Studios", List.of("Joss Whedon", "Stan Lee"), List.of("Ação", "Aventura"), List.of("Alan Fine", "Stan Lee"));
        Produto jogo = new Jogo("Uncharted", 99.50, 45, "Naughty Dog", "Aventura", "Bend Studio");
        Produto livro = new Livro("O Senhor dos Anéis", 125.85, 38, List.of("Ação", "Fantasia"), "J. R. R. Tolkien", "Allen & Unwin");
        Produto albumDeMusica = new AlbumDeMusica("Dirty Dancing", 55.25, 45, List.of("The Ronettes", "The Blow Monkeys"), List.of("Pop", "Rock", "Rhythm", "Blues"), List.of("RCA Records"));

        livraria.getEstoque().adicionarProduto(brinquedo);
        livraria.getEstoque().adicionarProduto(filme);
        livraria.getEstoque().verProduto(albumDeMusica);
        livraria.getEstoque().adicionarProduto(jogo);
        livraria.getEstoque().adicionarProduto(livro);
        livraria.getEstoque().adicionarProduto(albumDeMusica);

        livraria.getEstoque().verProduto(albumDeMusica);
        livraria.getEstoque().listarProdutosDoMesmoTipo(albumDeMusica);
        livraria.getEstoque().listarProdutosDoEstoque();
    }
}
