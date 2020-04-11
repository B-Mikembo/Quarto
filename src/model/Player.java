package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Token> storageBag;

    public Player(String n, boolean firstPlayer){
        this.name = n;
        this.storageBag = new ArrayList<>();
        if(firstPlayer){
            Color c = Color.LIGHT;
            Height h = Height.SMALL;

            this.storageBag.add(new Token(c,h,Summit.FULL,Form.CYLINDRICAL));
            this.storageBag.add(new Token(c,h,Summit.DRILLED,Form.CYLINDRICAL));
            this.storageBag.add(new Token(c,h,Summit.FULL,Form.PARALLELEPIPED));
            this.storageBag.add(new Token(c,h,Summit.DRILLED,Form.PARALLELEPIPED));

            h = Height.LARGE;
            this.storageBag.add(new Token(c,h,Summit.FULL,Form.CYLINDRICAL));
            this.storageBag.add(new Token(c,h,Summit.DRILLED,Form.CYLINDRICAL));
            this.storageBag.add(new Token(c,h,Summit.FULL,Form.PARALLELEPIPED));
            this.storageBag.add(new Token(c,h,Summit.DRILLED,Form.PARALLELEPIPED));
        }
        else{
            Color c = Color.DARK;
            Height h = Height.SMALL;
            this.storageBag.add(new Token(c,h,Summit.FULL,Form.CYLINDRICAL));
            this.storageBag.add(new Token(c,h,Summit.DRILLED,Form.CYLINDRICAL));
            this.storageBag.add(new Token(c,h,Summit.FULL,Form.PARALLELEPIPED));
            this.storageBag.add(new Token(c,h,Summit.DRILLED,Form.PARALLELEPIPED));

            h = Height.LARGE;
            this.storageBag.add(new Token(c,h,Summit.FULL,Form.CYLINDRICAL));
            this.storageBag.add(new Token(c,h,Summit.DRILLED,Form.CYLINDRICAL));
            this.storageBag.add(new Token(c,h,Summit.FULL,Form.PARALLELEPIPED));
            this.storageBag.add(new Token(c,h,Summit.DRILLED,Form.PARALLELEPIPED));
        }
    }

    public String getName(){
        return this.name;
    }

    public List<Token> getStorageBag(){
        return this.storageBag;
    }

    public String toString(){
        String str = new String();

        str += "Name: "+this.name+" Tokens: \n";

        for (Token t:storageBag) {
            str += t.getColor()+"-"+t.getForm()+"-"+t.getHeight()+"-"+t.getSummit()+"\n";
        }

        return str;
    }
}
