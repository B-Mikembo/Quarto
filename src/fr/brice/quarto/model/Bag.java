package fr.brice.quarto.model;

import java.util.ArrayList;

public class Bag {
    ArrayList<Token> tokens;

    public Bag(){
        this.tokens = new ArrayList<Token>();
    }

    public void addToken(Token token){
        this.tokens.add(token);
    }

    public Token getToken(int index){
        return this.tokens.get(index);
    }

    public Token removeToken(int index){
        return this.tokens.remove(index);
    }
}
