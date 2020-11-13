package main.fr.brice.quarto.controller;

import main.fr.brice.quarto.model.Color;
import main.fr.brice.quarto.model.GameBag;
import main.fr.brice.quarto.model.Player;

import java.util.ArrayList;
import java.util.List;

class GameViewable {
    public void something() {
    }

    public void setController(GameController gameController) {
    }
};

public class GameController {
    enum GameState {
        AddingPlayers,
        TokensDealt,
        Game,
        WinnerRevealed
    }

    private GameBag gameBag;
    private ArrayList<Player> players;
    private Player winner;
    private GameViewable view;
    private GameState gameState;

    public GameController(/*GameViewable view,*/ GameBag gameBag) {
        //this.view = view;
        this.gameBag = gameBag;
        this.players = new ArrayList<Player>();
        this.gameState = GameState.AddingPlayers;
        //view.setController(this);
    }

    public void run() {
        while (true) {
            switch (gameState) {
                case AddingPlayers:
                    //this.view.something();
                    break;
                case TokensDealt:
                    //this.view.something();
                    break;
                case Game:
                    //this.view.something();
                    break;
                case WinnerRevealed:
                    //this.view.something();
                    break;
            }
        }
    }

    public void addPlayer(String playerName) {
        if(this.gameState == GameState.AddingPlayers){
            this.players.add(new Player(playerName));
            //this.view.something();
        }
    }

    public void startGame(){
        if(this.gameState != GameState.TokensDealt){
            this.players.get(0).addTokenToBag(this.gameBag.removeFromGameBag(Color.DARK));
            this.players.get(1).addTokenToBag(this.gameBag.removeFromGameBag(Color.LIGHT));
            //this.view.something();
            this.gameState = GameState.TokensDealt;
        }
    }

    public void evaluateWinner(){

    }

    public void displayWinner(){
        this.view.something();
    }

    public GameBag getGameBag() {
        return this.gameBag;
    }

    public List<Player> getPlayers(){
        return this.players;
    }
}
