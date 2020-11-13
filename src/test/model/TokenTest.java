package test.model;

import main.fr.brice.quarto.model.*;
import org.junit.Assert;
import org.junit.Test;

public class TokenTest {
    @Test
    public void whenGetters_thenReturnPropertiesOfToken(){
        Token token = giveToken();

        Color color = token.getColor();
        Height height = token.getHeight();
        Summit summit = token.getSummit();
        Form form = token.getForm();

        Assert.assertNotNull(color);
        Assert.assertNotNull(height);
        Assert.assertNotNull(summit);
        Assert.assertNotNull(form);
    }

    private Token giveToken(){
        return new Token(Color.DARK, Height.LARGE, Summit.FULL, Form.CYLINDRICAL);
    }
}
