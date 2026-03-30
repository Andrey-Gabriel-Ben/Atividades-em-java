package atividade_3;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void exibirDados() {
        System.out.println(" é conhecido(a) como " + nome + ", e tem " + idade + " anos de idade.");
    }
}



public class construtores {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("andrey", -20);
        Pessoa p2 = new Pessoa("Nicolas", 40);
        Pessoa p3 = new Pessoa("andriel", 25);
        Pessoa p4 = new Pessoa("jorge", 10);
        Pessoa p5 = new Pessoa("Samanta", -2700);
        Pessoa p6 = new Pessoa("Pierre", 5);
    
        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
        p4.exibirDados();
        p5.exibirDados();
        p6.exibirDados();



    }
}


//Para deixar registrado, tentei elaborar um método de verificação de idade utilizando gets e sets, mas como essa não é uma aplicação real, não adiantaria exibir uma mensagem de erro, já que não estamos recebendo inputs, mas sim analisando um valor pré-determinado no console.
