package Number_Guess_Game;// File: GameLauncher.java

import Number_Guess_Game.Game;

 class GameLauncher {

    public static void main(String[] args) {

        Game myGame = new Game(8);

        // Start the game
        myGame.play();
    }
}