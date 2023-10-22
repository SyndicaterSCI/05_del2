import java.util.Random;

class Dice{
    public int faceValue;

    //Generate a random number between 1 and 6, and sets the varibel "faceValue"
    public Dice(){
        var maxRoll = 6;
        var minRoll = 1;
        Random random = new Random();
        faceValue = random.nextInt((maxRoll-minRoll)+1)+minRoll;
        // if you whant to be abele to role more then 6 chanse 6 to the whantet number 
    }

    public int getValue(){
        return faceValue;
    }

    /*
    //to get the sum of the dices
    public int sum;
    public int getSum(){
        int sum = 0;
        int numberOfDice = 2;
        for (int i = 0; i<numberOfDice; i++){
            sum += rolle();;
        }
        return sum;
    }*/
}