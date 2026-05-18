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

    // gets e sets

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean getDisponivel() {
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

    // getters e setters
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
    // listas de cadastro
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Livro> livros = new ArrayList<>();

    //Metodo de cadastro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuarios(Usuario usuario) {
        usuarios.add(usuario);
    }

    //metodo de emprestimo
    public void emprestarLivro(int id_livro, Usuario usuario) {
        for (Livro livro : livros) {
            if (livro.getCodigo() == id_livro) {
                if (livro.getDisponivel()) {
                    livro.setDisponivel(false);
                    System.out.println("Livro emprestado ao usuario de id " + id_usuario);
                } else {
                    System.out.println(
                            "O livro " + livro.getTitulo() + " selecionado encontra-se indisponível no momento.");
                }
            }
        }
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getCodigo() + " - " + livro.getTitulo() + " - "
                    + (livro.getDisponivel() ? "Disponível" : "Emprestado"));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        b.adicionarLivro(new Livro("Java Básico"));
        b.adicionarLivro(new Livro("POO na prática"));

        b.emprestarLivro(1, 1);
        b.emprestarLivro(1, 2); // problema aqui

        b.listarLivros();
    }
}