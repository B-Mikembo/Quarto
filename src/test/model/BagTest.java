package test.model;

import main.fr.brice.quarto.model.*;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BagTest {
    @Test
    public void givenListOfToken_whenAddToken_thenListOfTokenOfBagNotNull() {
        Bag bagTest = new Bag();
        List<Token> tokenList = giveListOfToken();

        bagTest.addToken(tokenList);

        Assert.assertNotNull(bagTest.getTokens());
    }

    @Test
    public void givenIndex_whenGetToken_thenReturnToken() {
        Bag bagTest = giveBagWithListOfToken();
        int index = 0;

        Token token = bagTest.getToken(index);

        Assert.assertNotNull(token);
    }

    @Test
    public void givenIndex_whenGetToken_thenReturnNull() {
        Bag bagTest = new Bag();
        int index = 0;

        Token token = bagTest.getToken(index);
        Assert.assertNull(token);
    }

    private @NotNull
    List<Token> giveListOfToken() {
        List<Token> tokenList = new ArrayList<Token>();
        for (Color color : Color.values()) {
            for (Form form : Form.values()) {
                for (Height height : Height.values()) {
                    for (Summit summit : Summit.values()) {
                        tokenList.add(new Token(color, height, summit, form));
                    }
                }
            }
        }

        return tokenList;
    }

    private Bag giveBagWithListOfToken() {
        Bag bag = new Bag();
        List<Token> tokenList = giveListOfToken();
        bag.addToken(tokenList);
        return bag;
    }
}
