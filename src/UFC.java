public class UFC {
    private String winner; // Vencedor
    private String fighter1; // Lutador 1
    private String fighter2; // Lutador 2
    private int roundsEnds; // Em que Round terminará
    private String winningMethod; // Como acabara a luta: nocaute, submissão ou decisão dos juízes

    public void setWinner(String winner) {

        if (winner.equals(fighter1) || winner.equals(fighter2)) {
            this.winner = winner;
        } else { // Verifica se o vencedor é um dos lutadores, se for coloca no winner
            System.out.println("O vencedor tem que ser um dos lutadores");
        }

    }

    public String getWinner() {
        return this.winner; // Mostrar o vencedor
    }

    public void setRoundsEnds(int roundsEnds) {
        this.roundsEnds = roundsEnds; // Coloca os rounds
    }

    public int getRoundsEnds() {
        return this.roundsEnds; // Mostra os rounds

    }

    public void setWinningMethod(String winningMethod) {
        this.winningMethod = winningMethod; // Coloca o metodo de vitoria
    }

    public String getWinningMethod() {
        return this.winningMethod; // Mostra o metodo de vitoria

    }

    public String getFighter1() {
        return fighter1; // mostra lutador 1
    }

    public void setFighter1(String fighter1) {
        this.fighter1 = fighter1; // Coloca o lutador 1
    }

    public String getFighter2() {
        return fighter2; // mostra o lutador 2
    }

    public void setFighter2(String fighter2) {
        this.fighter2 = fighter2; // coloca o lutador 2
    }
}
