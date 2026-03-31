
abstract class Conta {
    String titular;
    double saldo;

    public Conta (String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){

        if (saldo < valor){
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }

    }
}

class ContaCorrente extends Conta {
    double cotas;

    public ContaCorrente (String titular, double saldo, double cotas){
        super(titular, saldo);
        this.cotas = cotas;
    }

    public void Cotas()

} 

class ContaPoupanca extends Conta {
    double TaxaJuros;

    public ContaPoupanca (String titular, double saldo, double TaxaJuros){
        super(titular, saldo);
        this.TaxaJuros = TaxaJuros;
    }

    public double rendimento (int meses){
        saldo = saldo * Math.pow((1+ TaxaJuros ), meses);
        return saldo;
    }

}

public class atividade2 {
    public static void main(String[] args) {
        System.out.println(".(hello word)");
    }
}


/*

Crie uma classe 
abstrata Conta
 com o atributo: saldo, 
método concreto: depositar(double valor) e 
método abstrato: sacar(doublevalor). 

Crie as classes ContaCorrente e ContaPoupanca.

*/