import java.util.ArrayList;

class Livro {
    int codigo;
    String titulo;
    boolean disponivel = true;

    public Livro(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }
}

class Usuario {
    String nome;
    public Usuario(String nome) {
        this.nome = nome;
    }
}

class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();
    
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(int codigo) {
        for (Livro livro : livros) {
            if (livro.codigo == codigo) {
                livro.disponivel = false;
                System.out.println("Livro emprestado!");
            } //verificar se o livro esta emprestado antes de empresta-lo
        }
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.codigo + " - " + livro.titulo + " - " + (livro.disponivel ? "Disponível" : "Emprestado"));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        b.adicionarLivro(new Livro(1, "Java Básico"));
        b.adicionarLivro(new Livro(2, "POO na prática"));

        b.emprestarLivro(1);
        b.emprestarLivro(1); // problema aqui

        b.listarLivros();
    }
}