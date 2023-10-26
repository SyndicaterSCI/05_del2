import java.util.Scanner;

class DiceGame{
    private Player[] players;
    private Die d1;
    private Die d2;
    private boolean flag = true;
    
    public boolean getFlag(){
        return flag;
    }

    // Creates both dice to be used in game.
    public void creatDie(){
        d1 = new Die(1,6);
        d2 = new Die(1,6);
    }
    
    // Create both players with names, and prints game rules
    public void createPlayer(){
        players = new Player[2];
        Text.printRules();

        Scanner input = new Scanner(System.in);

        Text.printEnterName(1);
        String p1Name = input.nextLine();
        players[0] = new Player(p1Name);
        players[0].setBalance(1000);

        Text.printEnterName(2);
        String p2Name = input.nextLine();
        players[1] = new Player(p2Name);
        players[1].setBalance(1000);

        
    }

    /* Rolls dice and adds the corresponding amount of points/money to the player account.
     * 
     * @Param   player: the player which turn it is
     */
    public void roll(int playerNumber){
        
        Text.pressEnter(); // Prompt the user to press Enter
        Scanner input = new Scanner(System.in);
        String enter = input.nextLine(); // Wait for the user to press Enter
        

        
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
        Text.showPoints(players[0].getBalance(), players[1].getBalance(), players[0].getName(), players[1].getName());
    }

    /* Checks to see if player fullfills win conditions and stops the game if so.
     * 
     * @param   player: player of which turn it is
     */
    public void verifyWin(int playerNumber){
        double playerPoint = players[playerNumber - 1].getBalance();
        if(playerPoint >= 3000){
            Text.winGame(players[playerNumber - 1].getName());
            flag = false;
        }

    }

    
}