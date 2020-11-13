package main.fr.brice.quarto.model;

import java.util.List;

public class Player {
    private String name;
    private Bag bag;

    public Player(String n) {
        this.name = n;
        this.bag = new Bag();
    }

    public String getName() {
        return this.name;
    }

    public void addTokenToBag(List<Token> token) {
        this.bag.addToken(token);
    }

    public Bag getBag() {
        return this.bag;
    }

    public Token removeToken(int index){
        return this.bag.removeToken(index);
    }
}
