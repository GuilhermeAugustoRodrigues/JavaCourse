package BankAccount;

public class Conta {
    private String titularConta;
    private double saldo;
    private int numeroConta;

    public Conta(String titularConta, int numeroConta) {
        this.titularConta = titularConta;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public Conta(String titularConta, int numeroConta, double saldo) {
        this.titularConta = titularConta;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    private double getSaldo(){
        return this.saldo;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public String saque(double valor){
        valor+=5;
        if(valor < this.saldo){
            this.saldo-=valor;
            return "Saque efetuado com sucesso. Saldo atual:\n"+this.getSaldo();
        } else {
            return "Você não possui saldo suficiente.";
        }
    }
    public String deposito(double valor){
        if(valor > 0){
            this.saldo+=valor;
            return "Saque efetuado com sucesso. Saldo atual:\n"+this.getSaldo();
        } else {
            return "Você não pode depositar valores negativos.";
        }
    }

    @Override
    public String toString() {
        return "Número da conta: " + numeroConta +
             "\nTitular da conta:" + titularConta +
             "\nSaldo:" + saldo;
    }

    public String saldo() {
        return "Número da conta: " + numeroConta +
             "\nSaldo:" + saldo;
    }
}
