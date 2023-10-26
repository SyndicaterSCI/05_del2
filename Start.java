public class Start {
    
    public static void main(String[] args){
        var game = new DiceGame();
        game.creatDie();
        game.createPlayer();

        // Cycles through both players
        for(int i = 1; game.getFlag(); i++){
            if((i % 2) != 0){
                game.roll(1);
                game.displayPoints();
                game.verifyWin(1);
            }else if((i % 2) == 0){
                game.roll(2);
                game.displayPoints();
                game.verifyWin(2);
            }
        }
    }
}
