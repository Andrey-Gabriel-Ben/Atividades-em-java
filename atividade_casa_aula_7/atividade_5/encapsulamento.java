package atividade_5;

class aluno {
    private String nome;
    private double nota;

    //sets e gets ini
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public double getNota() {
        return nota;
    }
    //sets e gets end

    public void verificarAprovacao(){
        if (this.nota >= 6) {
            System.out.println("aluno " + nome + " APROVADO, com nota " + nota);
        } else {
            System.out.println("aluno " + nome + " REPROVADO, com nota " + nota);
        }
    }



}


public class encapsulamento {
    public static void main(String[] args) {
        
        aluno a1 = new aluno();
        aluno a2 = new aluno();
        aluno a3 = new aluno();
        aluno a4 = new aluno();

        a1.setNome("Andrey");
        a2.setNome("Nicolas");
        a3.setNome("Andriel");
        a4.setNome("Jorge");

        a1.setNota(10);
        a2.setNota(9);
        a3.setNota(6);
        a4.setNota(4);

        a1.verificarAprovacao();
        a2.verificarAprovacao();
        a3.verificarAprovacao();
        a4.verificarAprovacao();
    }
}


/*

Crie a classe Aluno: 
Atributos privados: nome, nota  
Métodos: getters e setters, verificarAprovacao() 

*/