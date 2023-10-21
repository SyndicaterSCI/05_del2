class Dice{
    public int faceValue;

    //Generate a random number between 1 and 6, and sets the varibel "faceValue"
    public void rolle(){
        var maxRoll = 6;
        var minRoll = 1;
        faceValue = (int) Math.random(minRoll)*maxRoll+1;
        // if you whant to be abele to role more then 6 chanse 6 to the whantet number 
    }

    public int getValue(){
        return faceValue;
    }

    //to get the sum of the dices
    public int sum;
    public int getSum(){
        int sum = 0;
        int numberOfDice = 2;
        for (int i = 0; i<numberOfDice; i++){
            sum += faceValue;
        }
        return sum;
    }
}
class Main{
    public static void main(String[] args) {
        for (int i = 0; i>20; i++){
            System.out.println(getValue);
        }
    }
}