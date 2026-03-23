class Produto {
    String nome;
    double preço;
}

public class atividade1 {
     public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "carne moida";
        p1.preço = 9.99;

        Produto p2 = new Produto();
        p2.nome = "Feijão";
        p2.preço = 10.90;

        System.out.println("produto: " + p1.nome + " custa " + p1.preço);
        System.out.println("produto: " + p2.nome + " custa " + p2.preço);
}
}