public class App {
    public static void main(String[] args) throws Exception {
        Conta contaUm = new Conta(); // conta criada
        Aposta apostaUm = new Aposta(); // Aposta criada
        UFC PartidaUFCUm = new UFC(); 
        Futebol PartidaFutebolUm  = new Futebol();
        Basquete PartidaBasqueteUm = new Basquete();
        PartidaUFCUm.setFighter1("Pedro");
        PartidaUFCUm.setFighter2("João");
        PartidaUFCUm.setWinner("Pedro");
        // Partida de ufc criada e setado lutadores e vencedor
        PartidaBasqueteUm.setMandante("Red");
        PartidaBasqueteUm.setVisitante("Blue");
        PartidaBasqueteUm.setEquipeVencedora("Red");
        // Partida de Basquete criada
        PartidaFutebolUm.setTimeCasa("Brasil");
        PartidaFutebolUm.setTimeVisitante("Argentina");
        PartidaFutebolUm.setTimeVencedor("Brasil");
        //partida de futebol criada
        contaUm.setName("Lucas");
        contaUm.setBalance(1000);
        // setado nome lucas e saldo de 1000 na "contaUm"
        apostaUm.Usuario = contaUm;
        apostaUm.PartidaUFC = PartidaUFCUm;
        apostaUm.PartidaBasquete = PartidaBasqueteUm;
        apostaUm.PartidaFutebol = PartidaFutebolUm;
        // Partida de UFC, Basquete e Conta linkadas a aposta
        apostaUm.setRealUfcVencedor();
        // Mandou o verdadeiro ganhador da partida ufc para class Aposta
        apostaUm.apostaUfcVencedor("João", 100);
        // Apostou no vencedor da partida ufc, João no valor de 100 pra devolver 2x
        apostaUm.verificaApostaUfcVencedor();
        // Verifica se a aposta tava certa ou não e tira ou coloca o dinheiro na conta
        apostaUm.apostaBasqueteVencedor("Red", 100);
        apostaUm.setRealBasqueteVencedor();
        apostaUm.verificaApostaBasqueteVencedor();
        //aposta basquete
        apostaUm.apostaFutebolVencedor("Brasil", 150);
        apostaUm.setRealFutebolVencedor();
        apostaUm.verificaApostaFutebolVencedor();
        //aposta futebol
        System.out.println(contaUm.getBalance());
        // Saldo atual da conta

    }
}