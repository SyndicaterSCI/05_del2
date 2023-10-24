public class Player {

    private double balance;
    private String playerName;

    // Konstruktør for at oprette en ny spiller
    public Player(String playerName, double initialBalance) {
        this.playerName = playerName;
        this.balance = initialBalance;
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
        return balance;
    }

    // Metode til at tilføje point til spillerens konto
    public void addSum(double amount) {
        if (amount > 0) {
            balance += amount;
        }

    }

    // Metode til at trække point fra spillerens konto
    public void subtractSum(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;

        }
    }

    // Metode til at udskrive spillerens oplysninger
    public void displayPlayerInfo() {
        System.out.println("Playername: " + playerName);
        System.out.println("Score: " + balance);
    }
}
