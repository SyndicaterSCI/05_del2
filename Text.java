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
        "Congratulations! ",
        // Winning player name (entered in method)
        " has won the game." + "\n\n" + "Thank you for playing!"
    };


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
    public static void showPoints(double p1, double p2, String p1Name, String p2Name){
        //String[] firstSplit = pointText.split("#");
        long p1Int = Math.round(p1);
        long p2Int = Math.round(p2);
        String showPoints = p1Name + pointText[0] + p1Int + pointText[1] + p2Name + pointText[2] + p2Int + pointText[3];
        System.out.println(showPoints); 
    }

    /* Prints text for win display

     * @param   pName: name of winning player
     */
    public static void winGame(String pName){
        String winGame = winText[0] + pName + winText[1];

        System.out.println(winGame);
    }
}