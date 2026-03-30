package atividade_2;

class ContaBancaria {

    private String titular;
    private double saldo;

    //sets e gets ini
    public void setTitular(String nome){
        this.titular = nome;
    }
    public String getTitular() {
        return titular;
    }
    
    public void setSaldo(double valor){
        this.saldo = valor;
    }
    public double getSaldo() {
        return saldo;
    }
    //sets e gets end

    public void depositar(double valor) {
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

    public void exibirSaldo(){
        System.out.println("O saldo atual é de " + saldo);
    }
}

public class Métodos_e_Atributos {
    public static void main(String[] args) {
        
        ContaBancaria c1 = new ContaBancaria();
        c1.setTitular("Bruno");
        c1.setSaldo(3500);

        c1.exibirSaldo();

        c1.depositar(1500);

        c1.sacar(6000);
        c1.sacar(5000);

        c1.exibirSaldo();
    }
}


