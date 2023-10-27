import java.util.Scanner;

class DiceGame{
    private Player[] players;
    private Die d1;
    private Die d2;
    private int numberOfPlayers;
    private int currentSum;
    private double currentMoney;
    
    /*Constructor for object DiceGame
     * 
     * @param   numberOfPlayers: the number of players in the game
     */
    public DiceGame(int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
    }

    /* Returns the balance of player 'n'
     * 
     * @param   playerNumber: the number of the player
     */
    public double getPlayerBalance(int playerNumber){
        double playerBalance = players[playerNumber - 1].getBalance();
        return playerBalance;
    }

    /* Returns the name of player 'n'
     * 
     * @param   playerNumber: the number of the player
     */
    public String getPlayerName(int playerNumber){
        String playerName = players[playerNumber - 1].getName();
        return playerName;
    }

    /* Set the name of player 'n'
     * 
     * @param   playerName: name of the player 'n'
     *          playerNumber: the number of the player 'n'
     */
    public void setPlayerName(String playerName, int playerNumber){
        players[playerNumber - 1].setPlayerName(playerName);
    }

    /* Set the balance of player 'n'
     * 
     * @param   playerBalance: initial balance of the player 'n'
     *          playerNumber: the number of the player 'n'
     */
    public void setPlayerBalance(double playerBalance, int playerNumber){
        players[playerNumber - 1].setBalance(playerBalance);
        // Resets the players account to 0, if the account falls below.
        if(players[playerNumber - 1].getBalance() < 0){
            players[playerNumber - 1].setBalance(0);
        }
    }

    /* Add amount to player balance
     * 
     * @param   money: the amount to be put into balance
     *          playerNumber: number of the player
     */
    public void addPlayerBalance(double money, int playerNumber){
        players[playerNumber - 1].addSum(money);

        // Resets the players account to 0, if the account falls below.
        if(players[playerNumber - 1].getBalance() < 0){
            players[playerNumber - 1].setBalance(0);
        }
    }

    /* Subtract amount to player balance
     * 
     * @param   money: the amount to be put taken out of balance
     *          playerNumber: number of the player
     */
    public void subtractPlayerBalance(double money, int playerNumber){
        players[playerNumber - 1].subtractSum(money);

        // Resets the players account to 0, if the account falls below.
        if(players[playerNumber - 1].getBalance() < 0){
            players[playerNumber - 1].setBalance(0);
        }
    }

    /* One method to rule them all. One method to find them all and in darkness, bind them */
    public void play(){
        Text.printRules();
        creatDie();
        createPlayerArr();

        recievePlayerNameInput();

        int previousPlayer = 1;
        for(int i = 1; !verifyWin(previousPlayer); i++){
            if(i > numberOfPlayers){
                i = 1;
            }
            currentMoney = 0;
            Text.printTurn(players[i-1].getName());
            askForEnter(i);
            if(currentMoney >= 0){
                addPlayerBalance(currentMoney, i);
            } else {
                subtractPlayerBalance(Math.abs(currentMoney), i);
            }
            displayPoints();
            previousPlayer = i;
        }

    }

    /* Recieves input from consol to set player names */
    public void recievePlayerNameInput(){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < players.length; i++){
            Text.printEnterName(i + 1);
            String playerName = input.nextLine();
            players[i].setPlayerName(playerName);
        }

    }

    /* Returns the balance of player 'n'
     * 
     * @param   playerNumber: the number of the player
     */
    public double getPlayerBalance(int playerNumber){
        double playerBalance = players[playerNumber - 1].getBalance();
        return playerBalance;
    }

    /* Returns the name of player 'n'
     * 
     * @param   playerNumber: the number of the player
     */
    public String getPlayerName(int playerNumber){
        String playerName = players[playerNumber - 1].getName();
        return playerName;
    }

    /* Set the name of player 'n'
     * 
     * @param   playerName: name of the player 'n'
     *          playerNumber: the number of the player 'n'
     */
    public void setPlayerName(String playerName, int playerNumber){
        players[playerNumber - 1].setPlayerName(playerName);
    }

    /* Set the balance of player 'n'
     * 
     * @param   playerBalance: initial balance of the player 'n'
     *          playerNumber: the number of the player 'n'
     */
    public void setPlayerBalance(double playerBalance, int playerNumber){
        players[playerNumber - 1].setBalance(playerBalance);
    }

    /* One method to rule them all. One method to find them all and in darkness, bind them */
    public void play(){
        Text.printRules();
        creatDie();
        createPlayerArr();

        recievePlayerNameInput();

        for(int i = 1; flag; i++){
            if(i > numberOfPlayers){
                i = 1;
            }
            Text.printTurn(players[i-1].getName());
            askForEnter(i);
            displayPoints();
            verifyWin(i);
        }

    }

    /* Recieves input from consol to set player names */
    public void recievePlayerNameInput(){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < players.length; i++){
            Text.printEnterName(i + 1);
            String playerName = input.nextLine();
            players[i].setPlayerName(playerName);
        }
    }

    // Creates both dice to be used in game.
    public void creatDie(){
        d1 = new Die(1,6);
        d2 = new Die(1,6);
    }
    
    // Create both players with names, and prints game rules
    public void createPlayerArr(){
        players = new Player[numberOfPlayers];
        for(int i = 0; i < players.length; i++){
            String placeholderName = "Player " + (i + 1);
            players[i] = new Player(placeholderName);
            players[i].setBalance(1000);
        }

        
    }

    /* Ask enter for input, and calls the roll function */
    public void askForEnter(int playerNumber){
        Text.pressEnter(); // Prompt the user to press Enter
        Scanner input = new Scanner(System.in);
        String enter = input.nextLine(); // Wait for the user to press Enter

        roll(playerNumber);

        // Restarts the roll function if player rolls 10.
        if(currentSum == 10){
            askForEnter(playerNumber);
        }

    }

    /* Rolls dice and adds the corresponding amount of points/money to the player account.
     * 
     * @Param   player: the player which turn it is
     */
    public void roll(int playerNumber){
        d1.roll();
        int d1Result = d1.getFaceValue();
        d2.roll();
        int d2Result = d2.getFaceValue();

        currentSum = d1Result + d2Result;
        currentMoney += Text.getValue(currentSum);
        
        Text.printText(currentSum);
        
    }

    /* Display points of all players */
    public void displayPoints(){
        System.out.println("\n");
        for(int i = 0; i < players.length; i++){
            Text.showPoints(players[i].getBalance(), players[i].getName());    
        }
        System.out.println("\n");
    }

    /* Checks to see if player fullfills win conditions and stops the game if so.
     * 
     * @param   player: player of which turn it is
     */
    public boolean verifyWin(int playerNumber){
        boolean playerWin = false;
        double playerPoint = getPlayerBalance(playerNumber);
        if(playerPoint >= 3000){
            Text.winGame(getPlayerName(playerNumber));
            playerWin = true;

        }
        return playerWin;

    }

    
}