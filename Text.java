class Text{
    private static double[] value = new double[]{
        250.0,
        -100.0,
        100.0,
        -20.0,
        180.0,
        0.0,
        -70.0,
        +60.0,
        -80.0,
        -50.0,
        +650.0    
    };

    private static String[] text = new String[]{
        "\nYou reach the tower, manage to climb up the vines along the side, and enter the \n chamber through the window. You look under the mattress and find 250 gold hidden \n underneath. You run home to celebrate your find.",
        "\nAs you're running along you suddenly slip and fall into a crater. After your fall you faint, \n and wake up moments later surrounded by orcs, they rob you of everything you have, \n including your clothes, and finally leave. You run home, naked and afraid. You lost 100 \n gold.",
        "\nYou get to the palace gates and everything is looking great, you look around and find a \n wallet on the floor. You decide to take what's in it, and find 100 gold. You go in and drink to \n celebrate, and wake up in the morning, somehow, at home.",
        "\nYou wander into the cold desert, and enter the pub to get out of the cold. You spend the \n entire night drinking, and when you wake up, you notice that you've lost 20 gold, and there \n is an unfamiliar smell on your sheets.",
        "\nAs you're taking a walk, you see a walled city, you choose to approach them. When the \n townsfolk notice you they are frightened, and bribe you with 180 gold to leave them alone, \n and not to tell others of their existence. Happy with the money, you take it, and find your \n way home.",
        "\nYou decide to visit the monastery to repent all the sins you've committed in your life. \n You go and pray, and when they ask for donations, you pretend to not understand and \n quickly hurry home, there is a limit to how much you repent.",
        "\nOn one of your adventures you notice a black cave, and as the brilliant adventurer you \n are, you decide to investigate. In the cave you see a chest and decide to rob it. When you \n approach it, it turns out to be a mimic, and attacks you. Once you manage to escape, you \n drop your bag on your way out, and unfortunately lose 70 gold.",
        "\nYou're out in the mountain looking for food, and notice a small collection of huts, they \n look abandoned. You choose to go look through them in hopes of loot. After going through \n all of them you've managed to collect 60 gold, and a bit of food. You return home happy \n and hungry.",
        "\nYou stumble across the Werewall on your latest adventure. It's a terrifying sight, with \n werewolves everywhere. They notice your smell, and start chasing you. As you're running, \n one of them reaches you, and manages to snatch your pouch. You return home \n unharmed, but 80 gold poorer. The adrenaline is pumping, so you decide to go on another \n adventure immediately. You get an extra turn.",
        "\nOn your newest adventure you decide to go through the forest, as you're walking along \n the path, you accidentally walk over a trap, and fall into a pit. After being in there for a \n while, someone appears at the top. They will help you out, but only if you pay them 50 \n gold. You give in, and can finally get out.",
        "\nYou're on your daily stroll, when you see something glistening in the distance. You \n approach and see that it's a goldmine, and it seems that there's no one else here. You go \n over and grab all the gold you can carry and go home. Once you go home, you get to \n counting it, and see that you've managed to find 650 gold. YOU'RE RICH."
    };
    
    private static String rules = "\nWelcome to the dicegame (:\n This is a two player game.\n To start the game, enter your names and press enter each time you want to roll the dice.\n You start with 1000 gold each, and your goal is to reach 3000 gold first.\n";

    private static String pressEnter = "\nPress enter to roll the dice";

    private static String enterName = "\nEnter name of player "; // 1 or 2 (entered in method)

    private static String[] pointText ={
        // Player 1 name (entered in method)
        " has ",
        // Player 1 points (entered in method)
        " points" + "\n",
        // Player 2 name (entered in method)
        " has ",
        // Player 2 points (entered in method)
        " points"
    };

    private static String[] winText = {
        "\nCongratulations! ",
        // Winning player name (entered in method)
        " has won the game." + "\n\n" + "Thank you for playing!"
    };

    private static String playerTurn = "\nTurn of "; // Player name added in method


    /*
     *      METHODS 
     */

    /* Gives the value of corresponding "field" or "roll sum", according to rules.
     * 
     * @param   sum: the sum of 2 dice roll
     * @return  double value of corresponding field
     */
    public static double getValue(int sum){
        double gold = value[sum - 2];
        return gold;
    };

    /* Prints before each turn */
    public static void pressEnter(){
        System.out.println(pressEnter);
    }

    /* Prints the command for entering player name
     * 
     * @param   playerNumber: the number of the player being asked the name of
     */
    public static void printEnterName(int playerNumber){
        System.out.println(enterName + playerNumber);
    }

    /* Prints the corresponding text to the sum rolled or "field".
     * 
     * @param   sum: the sum of 2 dice roll
     */
    public static void printText(int sum){
        String flavourText = text[sum -2];
        System.out.println(flavourText);
    }

    /* Prints the rules text
     */
    public static void printRules(){
        System.out.println(rules);
    }

    /* Prints the amount of points of each player
     * 
     * @param   p1: points of player 1
     *          p2: points of player 2
     *          p1Name: name of player 1
     *          p2Name: name of player 2
     */
    public static void showPoints(double p1, String p1Name){
        //String[] firstSplit = pointText.split("#");
        long p1Int = Math.round(p1);
        String showPoints = p1Name + pointText[0] + p1Int + pointText[1];
        System.out.println(showPoints); 
    }

    /* Prints text for who's turn it is

     * @param   playerName: name of player
     */
    public static void printTurn(String playerName){
        String turn = playerTurn + playerName;
        System.out.println(turn);
    }

    /* Prints text for win display

     * @param   pName: name of winning player
     */
    public static void winGame(String pName){
        String winGame = winText[0] + pName + winText[1];

        System.out.println(winGame);
    }
}