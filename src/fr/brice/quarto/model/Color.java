package fr.brice.quarto.model;

public enum Color {
    LIGHT ("Light"),
    DARK ("Dark");

    String color;

    private Color(String color){
        this.color = color;
    }

    public String value(){
        return this.color;
    }
}
