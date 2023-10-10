class Text{
    private static int[] value = new int[]{
        250,
        -100,
        100,
        -20,
        180,
        0,
        -70,
        +60,
        -80,
        -50,
        +650    
    };

    private static String[] text = new String[]{
        "Text 1",
        "Text 2",
        "Text 3",
        "Text 4",
        "Text 5",
        "Text 6",
        "Text 7",
        "Text 8",
        "Text 9",
        "Text 10",
        "Text 11",
    };
    
    private static String rules = "Rules";


    /*
     * Text used to print out the total amount of points of each player.
     * When translating, "#" must not be modified.
     */

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
        "Congratuælations! ",
        // Winning player name (entered in method)
        " has won the game." + "\n\n" + "Thank you for playing!"
    };


    /*
     *      METHODS 
     */

    /* Gives the value of corresponding "field" or "roll sum", according to rules.
     * 
     * @param   sum: the sum of 2 dice roll
     * @return  int value of corresponding field
     */
    public static int getValue(int sum){
        int gold = value[sum - 2];
        return gold;
    };

    /* Gives the corresponding text to the sum rolled or "field".
     * 
     * @param   sum: the sum of 2 dice roll
     * @return  String of text of corresponding field
     */
    public static String getText(int sum){
        String flavourText = text[sum -2];
        return flavourText;
    }

    /* Returns the rules text to be printed
     */
    public static String getRules(){
        return rules;
    }

    /* Gives the text to be printed to display current points
     * 
     * @param   p1: points of player 1
     *          p2: points of player 2
     *          p1Name: name of player 1
     *          p2Name: name of player 2
     * @return  String of text displaying points of both players
     */
    public static String showPoints(int p1, int p2, String p1Name, String p2Name){
        //String[] firstSplit = pointText.split("#");
        String showPoints = p1Name + pointText[0] + p1 + pointText[1] + p2Name + pointText[2] + p2 + pointText[3];
        return showPoints; 
    }

    /* Generates text for win display

     * @param   pName: name of winning player
     * @return  String of text to display win
     */
    public static String winGame(String pName){
        String winGame = winText[0] + pName + winText[1];

        return winGame;
    }
}