import java.util.Scanner;

class DiceGame{
    private static Player p1;
    private static Player p2;
    private static Die d1;
    private static Die d1;
    private static double currentSum;

    public static void main(String[] args){

    }
    
    public static creatDie(){
        d1 = new Die(1,6);
        d1 = new Die(1,6);
    }
    
    public static createPlayer(){
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

    public static roll(Player player){
        d1.roll();
        double d1Result = d1.getFacevalue();
        d2.roll();
        double d2Result = d2.getFacevalue();

        currentSum = d1Result + d2Result;
    }

    

    
}