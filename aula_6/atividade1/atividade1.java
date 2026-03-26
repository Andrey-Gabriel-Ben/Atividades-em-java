// Crie a classe Veículo com o método mover() e, as subclasses: Carro e Bicicleta, cada uma imprimindo algodiferente.


class Veiculo {
    public void mover(){
        System.out.println("O Veiculo esta se movendo");
    }
}

class Carro extends Veiculo {
    @Override
    public void mover(){
        System.out.println("O Carro está se movendo");
    }
}
class Bicicleta extends Veiculo {
    @Override
    public void mover(){
        System.out.println("A Bicicleta está se movendo");
    }
}


public class atividade1 {
    public static void main(String[] args) {
        
        Veiculo c1 = new Carro();
        c1.mover();

        Veiculo b1 = new Bicicleta();
        b1.mover();

    }
}

