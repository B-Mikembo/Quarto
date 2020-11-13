package fr.brice.quarto.model;

public enum Form {
    PARALLELEPIPED ("Parallelepiped"),
    CYLINDRICAL ("Cylindrical");

    String form;

    private Form(String form){
        this.form = form;
    }

    public String value(){
        return this.form;
    }
}
