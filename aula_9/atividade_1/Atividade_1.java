interface imprimivel {
    
    public void imprimir();
}

class documento implements imprimivel {
    String nome;
    public documento(String nome) {
        this.nome = nome;
    }

    @Override
    public void imprimir(){
        System.out.println("imprimindo documento '" + nome + "'.");
    };
}

class foto implements imprimivel {
    String nome;
    public foto(String nome) {
        this.nome = nome;
    }

    @Override
    public void imprimir(){
        System.out.println("imprimindo a foto '" + nome + "'.");
    }
}

public class Atividade_1 {
    public static void main(String[] args) {
    foto f1 = new foto("foto em famílha.jpg");
    documento doc1 = new documento("Atividades_em_java.pdf");

    f1.imprimir();
    doc1.imprimir();

    }
}