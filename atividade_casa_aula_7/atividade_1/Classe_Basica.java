/* Exercício 1 – Classe Básica 
Crie uma classe Pessoa com: 
Atributos: nome (String), idade (int)  
Métodos: exibirDados()  
Tarefa: Instancie um objeto e exiba seus dados. */

package atividade_1;

class Pessoa {
    String nome;
    int idade;
    
    void exibirDados() {
        System.out.println(" é conhecido(a) como " + nome + ", e tem " + idade + " anos de idade.");
    }
}

public class Classe_Basica {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Nicolas Ramos";
        p1.idade = 23;
        p1.exibirDados();

        Pessoa p2 = new Pessoa();
        p2.nome = "Andrey";
        p2.idade = 20;
        p2.exibirDados();
        
    }
    
}




/*

class Forma {
    double areav2;

    void calcularArea() {
        System.out.println("A área da forma é " + areav2 + " m²");
    }
}

class Quadrado extends Forma{
    double ladov2;

    @Override
    void calcularArea() {
        areav2 = ladov2 * ladov2;


        System.out.println("A área do quadrado de lado " + ladov2 + "m é " + areav2 + " m²");
    }
}

class Circulo extends Forma{
    public double raiov2;

    @Override
    void calcularArea( ) {
        areav2 = Math.PI * (raiov2*raiov2);

        System.out.println("A área do circulo de raiov2" + raiov2 + "m é " + areav2 + " m²");
    }
}

public class atividade2V2 {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        q1.ladov2 = 5;
        q1.calcularArea();

        Circulo c1 = new Circulo();
        c1.raiov2 = 12;
        c1.calcularArea();
    }
}

*/