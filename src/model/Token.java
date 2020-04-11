package model;

public class Token {
    private Color color;
    private Height height;
    private Summit summit;
    private Form form;

    public Token(Color c, Height h, Summit s, Form f){
        this.color = c;
        this.height = h;
        this.summit = s;
        this.form = f;
    }

    public Color getColor() {
        return this.color;
    }

    public Height getHeight() {
        return this.height;
    }

    public Summit getSummit() {
        return this.summit;
    }

    public Form getForm() {
        return this.form;
    }

    @Override
    public String toString() {
        return "Token{" +
                "color=" + color +
                ", height=" + height +
                ", summit=" + summit +
                ", form=" + form +
                '}';
    }
}
