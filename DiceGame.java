import java.util.Scanner;

class DiceGame{
    private static Player p1;
    private static Player p2;
    private static Die d1;
    private static Die d1;
    private static double currentSum;
    private static boolean flag = true;


    public static void main(String[] args){
        creatDie();
        createPlayer();

        // Cycles through both players
        for(int i = 1; flag; i++){
            if((i % 2) != 0){
                roll(p1);
                Text.showPoints(p1.getBalance(), p2.getBalance(), p1.getName(), p1.getName())
                verifyWin(p1);
            }else if((i % 2) == 0){
                roll(p2);
                Text.showPoints(p1.getBalance(), p2.getBalance(), p1.getName(), p1.getName())
                verifyWin(p2);
            }
        }
    }
    
    // Creates both dice to be used in game.
    public static void creatDie(){
        d1 = new Die(1,6);
        d1 = new Die(1,6);
    }
    
    // Create both players with names, and prints game rules
    public static void createPlayer(){
        Text.printRules();

        Scanner input = new Scanner(System.in);

        Text.printEnterName(1);
        String p1Name = input.nextString();
        p1 = new Player(p1Name);

        Text.printEnterName(2);
        String p2Name = input.nextString();
        p2 = new Player(p2Name);

        input.close();
    }

    /* Rolls dice and adds the corresponding amount of points/money to the player account.
     * 
     * @Param   player: the player which turn it is
     */
    public static void roll(Player player){
        Scanner roller = new Scanner(System.in);
        Text.pressEnter();
        roller.nextString();
        roller.close();

        d1.roll();
        double d1Result = d1.getFacevalue();
        d2.roll();
        double d2Result = d2.getFacevalue();

        currentSum = d1Result + d2Result;
        double money = Text.getValue(currentSum);
        player.addSum(currentSum);

        // Resets the players account to 0, if the account falls below.
        if(player.getBalance() < 0){
            player.setBalance(0);
        }
        
        Text.printText(currentSum);

        // Restarts the roll function if player rolls 10.
        if(currentSum == 10){
            roll(player);
        }

    }

    /* Checks to see if player fullfills win conditions and stops the game if so.
     * 
     * @param   player: player of which turn it is
     */
    public static void verifyWin(Player player){
        double playerPoint = player.getBalance();
        if(playerPoint >= 3000){
            Text.printWin(player.getName());
            flag = false;
        }

    }

    
}