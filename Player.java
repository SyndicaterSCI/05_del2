class Player {

    private Account account;
    private String playerName;

    // Constructor for a new Player
    public Player(String playerName) {
        this.playerName = playerName;
        createAccount();
    }

    private void createAccount() {
        this.account = new Account();
    }

    // Method to get a playername and return it
    public String getName() {
        return playerName;
    }

    // Method to set/change a PlayerName
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setBalance(double money){
        account.setBalance(money);
    }

    // Method to get the players balance and return it
    public double getBalance() {
        return account.getBalance();

    }

    // Method to add money/points to Player accoutn
    public void addSum(double money) {
        account.addSum(money);

    }

    // Method to subtract money/sum from Players account
    public void subtractSum(double money) {
        account.subtractSum(money);

    }

    // Method to print Player info
    public void displayPlayerInfo() {
        System.out.println("Playername: " + playerName);
        System.out.println("Score: " + account.getBalance());
    }
}
