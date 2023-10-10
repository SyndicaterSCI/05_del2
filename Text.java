class Text{
    private int[] value = new int[]{
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

    private String[] text = new String[]{
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
    
    private String rules = "Rules";


    /*
     * Text used to print out the total amount of points of each player.
     * When translating, "!" and "#"
     */
    private static String pointText = 
        "#" + " has " + "#" + " points\n" + 
        "#" + " has " + "#" + " points";

    private String winTest = "";

    /* Gives the value of corresponding "field" or "roll sum", according to rules.
     * 
     * @param   sum: the sum of 2 dice roll
     * @return  int value of corresponding field
     */
    public int getValue(int sum){
        int gold = value[sum - 2];
        return gold;
    };

    /* Gives the corresponding text to the sum rolled or "field".
     * 
     * @param   sum: the sum of 2 dice roll
     * @return  String of text of corresponding field
     */
    public String getText(int sum){
        String flavourText = text[sum -2];
        return flavourText;
    }

    /* Returns the rules text to be printed
     */
    public String getRules(){
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
        String[] firstSplit = pointText.split("#");
        String ShowPoints = p1Name + firstSplit[1] + p1 + firstSplit[2] + p2Name + firstSplit[3] + p2 + firstSplit[4];
        return showPoints; 
    }

    /* Generates text for win display

     * @param   pName: name of winning player
     * @return  String of text to display win
     */
    public String winGame(String pName){
        String winGame = "";

        return winGame;
    }
}