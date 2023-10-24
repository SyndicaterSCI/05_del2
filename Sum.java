import javax.management.relation.Role;

class Sum{
    public int sum;

   public Sum(){
        int sum = 0;
        int numberOfDice = 2;
        int[] arr = new int[numberOfDice]; //made an array of dice to show it is easy to change the number of dice
        for (int i = 0; i<arr.length; i++){
            Die d1 = new Die(1, 6);
            d1.roll();
            arr[i] = d1.getFaceValue();
            sum += arr[i];
        }
        this.sum = sum;
    }
    
    public int getSum(){
        return sum;
    }

}