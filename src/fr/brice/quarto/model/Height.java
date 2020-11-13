package fr.brice.quarto.model;

public enum Height {
    SMALL ("Small"),
    LARGE ("Large");

    String height;

    private Height(String height){
        this.height = height;
    }

    public String value(){
        return this.height;
    }
}
