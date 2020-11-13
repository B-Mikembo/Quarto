package main.fr.brice.quarto.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bag {
    ArrayList<Token> tokens;

    public Bag(){
        this.tokens = new ArrayList<Token>();
    }

    public void addToken(List<Token> token){
        if(token != null){
            this.tokens.addAll(token);
        }
    }

    public Token getToken(int index){
        return this.tokens != null && !this.tokens.isEmpty() ? this.tokens.get(index) : null;
    }

    public Token removeToken(int index){
        return this.tokens.remove(index);
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }
}
