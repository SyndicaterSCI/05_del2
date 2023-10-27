import java.util.Scanner;

class DiceGame{
    private Player[] players;
    private Die d1;
    private Die d2;
    private boolean flag = true;
    private int numberOfPlayers;
    
    public DiceGame(int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
    }

    public boolean getFlag(){
        return flag;
    }

    public double getPlayerBalance(int playerNumber){
        double playerBalance = players[playerNumber - 1].getBalance();
        return playerBalance;
    }

    public String getPlayerName(int playerNumber){
        String playerName = players[playerNumber - 1].getName();
        return playerName;
    }

    public void setPlayerName(String playerName, int playerNumber){
        players[playerNumber - 1].setPlayerName(playerName);
    }

    public void setPlayerBalance(double playerBalance, int playerNumber){
        players[playerNumber - 1].setBalance(playerBalance);
    }

    public void play(){
        Text.printRules();
        creatDie();
        createPlayerArr();

        recievePlayerNameInput();

        for(int i = 1; flag; i++){
            if(i > numberOfPlayers){
                i = 1;
            }
            askForEnter(i);
            displayPoints();
            verifyWin(i);
        }

    }

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

    public void askForEnter(int playerNumber){
        Text.pressEnter(); // Prompt the user to press Enter
        Scanner input = new Scanner(System.in);
        String enter = input.nextLine(); // Wait for the user to press Enter

        roll(playerNumber);
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

        int currentSum = d1Result + d2Result;
        double money = Text.getValue(currentSum);
        players[playerNumber - 1].addSum(money);

        // Resets the players account to 0, if the account falls below.
        if(players[playerNumber - 1].getBalance() < 0){
            players[playerNumber - 1].setBalance(0);
        }
        
        Text.printText(currentSum);

        // Restarts the roll function if player rolls 10.
        if(currentSum == 10){
            roll(playerNumber);
        }
        
    }

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
    public void verifyWin(int playerNumber){
        double playerPoint = getPlayerBalance(playerNumber);
        if(playerPoint >= 3000){
            Text.winGame(getPlayerName(playerNumber));
            flag = false;
        }

    }

    
}