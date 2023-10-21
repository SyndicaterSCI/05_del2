class Sum{
    public int sum;
    public void rolle(){
        var sum = 0;
        var numberOfDice = 2;
        var arr = new int[numberOfDice-1];
        for (int i = 0; i>=arr.length; i++){
            arr[i] = new Dice().faceValue;
        }
        for (int i = 0; i>arr.length; i++){
            sum += arr[i];
        }
    }
    
    public int getSum(){
        return sum;
    }

}