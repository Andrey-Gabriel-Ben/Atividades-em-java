package atividade_4;

class Produto {
    private String nome;
    private double preço;

    public Produto(){

    }

    public Produto (String nome, double preço){
        this.nome = nome;
        this.preço = preço;
    }

    public void exibirProduto(){
        System.out.println(nome + " | " + preço);
    }


}




public class Sobrecarga_de_Construtores {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Feijão", 4.50);
        Produto p2 = new Produto("Arroz", 5.50);
        Produto p3 = new  Produto("Carne moída", 23);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();

    }
}



/*

Na classe Produto: 
Atributos: nome, preço  
Construtores: Um vazio, um que recebe nome e preço 

*/