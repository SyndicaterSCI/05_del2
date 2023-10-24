import java.util.Random;

class Dice{
    public int faceValue;

    //Generate a random number between 1 and 6, and sets the variable "faceValue"
    public Dice(){
        int maxRoll = 6;
        int minRoll = 1;
        Random random = new Random();
        faceValue = random.nextInt((maxRoll-minRoll)+1)+minRoll;
        // if you want to be able to roll more than 6 change 6 to the wanted number 
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