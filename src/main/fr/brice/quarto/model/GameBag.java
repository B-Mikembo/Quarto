package main.fr.brice.quarto.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GameBag {
    private ArrayList<Token> tokens;

    public GameBag() {
        this.tokens = new ArrayList<Token>();
        for (Color color : Color.values()) {
            for (Form form : Form.values()) {
                for (Height height : Height.values()) {
                    for (Summit summit : Summit.values()) {
                        System.out.println("Creating token: [" + color + "," + form + "," + height + "," + summit + "]");
                        this.tokens.add(new Token(color,height,summit,form));
                    }
                }
            }
        }
    }

    public List<Token> removeFromGameBag(Color c){
        Iterator<Token> iterator = this.tokens.iterator();
        List<Token> tokens = new ArrayList<Token>();
        Token tokenTmp = new Token(null,null,null,null);
        while (iterator.hasNext()){
            tokenTmp = iterator.next();
            if(tokenTmp.getColor().value() == c.value()){
                tokens.add(tokenTmp);
            }
        }

        return tokens;
    }

    public ArrayList<Token> getTokens() {
        return this.tokens;
    }
}
