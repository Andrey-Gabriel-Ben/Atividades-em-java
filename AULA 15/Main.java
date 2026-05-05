import java.util.ArrayList;

class Livro {
    private static int contador = 0;
    private int codigo;
    private String titulo;
    private boolean disponivel = true;

    public Livro(String titulo) {
        this.codigo = ++contador;
        this.titulo = titulo;
    }

    //gets e sets

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}

class Usuario {
    private static int contador = 0;
    private int codigo;
    private String nome;

    public Usuario(String nome) {
        this.codigo = ++contador;
        this.nome = nome;
    }

    //getters e setters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}

class Biblioteca {
    private static ArrayList<Livro> livros = new ArrayList<>();
    
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(int codigo) {
        for (Livro livro : livros) {
            if (livro.getCodigo() == codigo) {
                livro.setDisponivel(false);
                System.out.println("Livro emprestado!");
            } //verificar se o livro esta emprestado antes de empresta-lo
        }
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getCodigo() + " - " + livro.getTitulo() + " - " + (livro.getDisponivel() ? "Disponível" : "Emprestado"));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        b.adicionarLivro(new Livro( "Java Básico"));
        b.adicionarLivro(new Livro( "POO na prática"));

        b.emprestarLivro(1);
        b.emprestarLivro(1); // problema aqui

        b.listarLivros();
    }
}