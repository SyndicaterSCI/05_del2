public class Player {

    private Account account;
    private String playerName;

    // Konstruktør for at oprette en ny spiller
    public Player(String playerName) {
        this.playerName = playerName;
        createAccount();
    }

    private void createAccount() {
        account = new Account();
    }

    // Metode til at få spillerens navn
    public String getPlayerName() {
        return playerName;
    }

    // Metode til at ændre spillerens navn
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    // Metode til at få spillerens balance
    public double getBalance() {
        return account.getBalance();

    }

    // Metode til at tilføje point til spillerens konto
    public void addSum(double money) {
        account.addSum(money);

    }

    // Metode til at trække point fra spillerens konto
    public void subtractSum(double money) {
        account.subtractSum(money);

    }

    // Metode til at udskrive spillerens oplysninger
    public void displayPlayerInfo() {
        System.out.println("Playername: " + playerName);
        System.out.println("Score: " + balance);
    }
}
