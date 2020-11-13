package main.fr.brice.quarto.model;

public enum Summit {
    FULL ("Full"),
    DRILLED ("Drilled");

    String summit;

    private Summit(String summit){
        this.summit = summit;
    }

    public String value(){
        return this.summit;
    }
}
