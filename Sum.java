class Sum{
    public int sum;
    public Sum(){
        int sum = 0;
        var numberOfDice = 2;
        var arr = new int[numberOfDice]; //made an aray of dice sow it is esay to change the number of dice
        for (int i = 0; i<arr.length; i++){
            arr[i] = new Dice().getValue();
            sum += arr[i];
        }
        this.sum = sum;
    }
    
    public int getSum(){
        return sum;
    }

}