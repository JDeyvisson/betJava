public class Aposta {
    private double valorApostado;
    public Conta Usuario;
    public UFC PartidaUFC;
    private String apostaUfcVencedor; // Aposta no vencedor do UFC
    private String realUfcVencedor; // Real vencedor do UFC
    public Basquete PartidaBasquete;
    private String apostaBasqueteVencedor;
    private String realBasqueteVencedor;
    public Futebol PartidaFutebol;
    private String apostaFutebolVencedor;
    private String realFutebolVencedor;

    ///////////////////////////
    public void apostaUfcVencedor(String apostaufcvencedor, double valor) { // Faz a aposta para o vencedor UFC
        if (this.Usuario.getBalance() >= valor) {
            this.apostaUfcVencedor = apostaufcvencedor;
            this.valorApostado = valor;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public String getApostaUfcVencedor() { // Mostra em quem apostou pra vencedor do UFC
        return this.apostaUfcVencedor;
    }

    public void setRealUfcVencedor() {
        this.realUfcVencedor = PartidaUFC.getWinner(); // Coloca o real vencedor do UFC
    }

    public void verificaApostaUfcVencedor() {
        if (this.valorApostado != 0) {
            if (apostaUfcVencedor.equals(realUfcVencedor)) {
                System.out.println("Voce apostou pra vencedor da partida de UFC: " + apostaUfcVencedor + ", e ganhou: "
                        + valorApostado * 2 + "R$");
                Usuario.setBalance(valorApostado * 2); // Verifica se ganhou ou perdeu aposta do vencedor UFC e manda ou
                                                       // tira o dinheiro da conta
            } else {
                System.out.println("Voce apostou pra vencedor da partida de UFC: " + apostaUfcVencedor + ", e perdeu: "
                        + valorApostado + "R$");
                Usuario.saque(valorApostado);
            }
        } else {
            System.out.println("Aposta Invalida");
        }
    }

    /////////////////////////////////
    public void apostaBasqueteVencedor(String basqueteVencedor, double valor) {
        if (this.Usuario.getBalance() >= valor) {
            this.apostaBasqueteVencedor = basqueteVencedor;
            this.valorApostado = valor;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public String getApostaBasqueteVencedor() {
        return this.apostaBasqueteVencedor;
    }

    public void setRealBasqueteVencedor() {
        this.realBasqueteVencedor = PartidaBasquete.getEquipeVencedora();
    }

    public void verificaApostaBasqueteVencedor() {
        if (this.valorApostado != 0) {
            if (apostaBasqueteVencedor.equals(realBasqueteVencedor)) {
                System.out.println(
                        "Voce apostou pra vencedor da partida de basquete: " + apostaBasqueteVencedor + ", e ganhou: "
                                + valorApostado * 2 + "R$");
                Usuario.setBalance(valorApostado * 2); // Verifica se ganhou ou perdeu aposta do vencedor Basquete e
                                                       // manda ou
                                                       // tira o dinheiro da conta
            } else {
                System.out.println(
                        "Voce apostou pra vencedor da partida de basquete: " + apostaBasqueteVencedor + ", e perdeu: "
                                + valorApostado + "R$");
                Usuario.saque(valorApostado);
            }
        } else {
            System.out.println("Aposta Invalida");
        }
    }

    /////////////////////////////////
    public void apostaFutebolVencedor(String apostafutebolvencedor, double valor) {
        if (this.Usuario.getBalance() >= valor) {
            this.apostaFutebolVencedor = apostafutebolvencedor;
            this.valorApostado = valor;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public String getApostaFutebolVencedor() {
        return this.apostaFutebolVencedor;
    }

    public void setRealFutebolVencedor() {
        this.realFutebolVencedor = PartidaFutebol.getTimeVencedor(); // Coloca o real vencedor do UFC
    }

    public void verificaApostaFutebolVencedor() {
        if (this.valorApostado != 0) {
            if (apostaFutebolVencedor.equals(realFutebolVencedor)) {
                System.out.println(
                        "Voce apostou pra vencedor da partida de Futebol: " + apostaFutebolVencedor + ", e ganhou: "
                                + valorApostado * 2 + "R$");
                Usuario.setBalance(valorApostado * 2); // Verifica se ganhou ou perdeu aposta do vencedor UFC e manda ou
                                                       // tira o dinheiro da conta
            } else {
                System.out.println(
                        "Voce apostou pra vencedor da partida de Futebol: " + apostaFutebolVencedor + ", e perdeu: "
                                + valorApostado + "R$");
                Usuario.saque(valorApostado);
            }
        } else {
            System.out.println("Aposta Invalida");
        }
    }
}