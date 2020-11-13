package fr.brice.quarto.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Bag bag;

    public Player(String n, boolean firstPlayer) {
        this.name = n;
        this.bag = new Bag();
    }

    public String getName() {
        return this.name;
    }

    public void addTokenToBag(Token token) {
        this.bag.addToken(token);
    }

    public Token getToken(int index) {
        return this.bag.getToken(index);
    }

    public Token removeToken(int index){
        return this.bag.removeToken(index);
    }
}
