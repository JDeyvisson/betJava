public class Conta {
    private String name; // nome
    private double balance; // Saldo
    private String email;
    private String CPF;
    private String Banco;

    public void setBanco(String banco) {
        this.Banco = banco;
    }

    public String getBanco() {
        return this.Banco;
    }

    public void setCPF(String cpf) {
        this.CPF = cpf; // Coloca o cpf
    }

    public String getCPF() {
        return this.CPF; // Mostra o CPF
    }

    public void setBalance(double valor) {
        this.balance += valor; // Coloca saldo na conta
    }

    public double getBalance() {
        return this.balance; // Mostra o saldo da conta

    }

    public boolean saque(double valor) {
        if (this.balance > valor) {
            this.balance -= valor; // Saca saldo da conta
            return true;
        } else {
            System.out.println("Voce não tem este dinheiro, saque negado. Seu saldo: " + getBalance());
            return false;
        }

    }

    public void setName(String name) {
        this.name = name; // Coloca um nome
    }

    public String getName() {
        return this.name; // Mostra o nome
    }

    public void setEmail(String email) {
        this.email = email; // Coloca um email
    }

    public String getEmail() {
        return this.email; // Mostro o email
    }

}
