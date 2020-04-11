package model;

import java.util.Arrays;

public class Table {
    private Token[][] table;

    public Table(){
        this.table = new Token[4][4];
    }

    public Token[][] getTable() {
        return this.table;
    }

    public boolean addToken(Token token,int number){
        boolean c;
        switch (number){
            case 1:
                if(this.table[0][0] == null) {
                    this.table[0][0] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 2:
                if(this.table[0][1] == null) {
                    this.table[0][1] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 3:
                if(this.table[0][2] == null) {
                    this.table[0][2] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 4:
                if(this.table[0][3] == null) {
                    this.table[0][3] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 5:
                if(this.table[1][0] == null) {
                    this.table[1][0] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 6:
                if(this.table[1][1] == null) {
                    this.table[1][1] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 7:
                if(this.table[1][2] == null) {
                    this.table[1][2] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 8:
                if(this.table[1][3] == null) {
                    this.table[1][3] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 9:
                if(this.table[2][0] == null) {
                    this.table[2][0] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 10:
                if(this.table[2][1] == null) {
                    this.table[2][1] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 11:
                if(this.table[2][2] == null) {
                    this.table[2][2] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 12:
                if(this.table[2][3] == null) {
                    this.table[2][3] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 13:
                if(this.table[3][0] == null) {
                    this.table[3][0] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 14:
                if(this.table[3][1] == null) {
                    this.table[3][1] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 15:
                if(this.table[3][2] == null) {
                    this.table[3][2] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            case 16:
                if(this.table[3][3] == null) {
                    this.table[3][3] = token;
                    c = true;
                    break;
                }
                else{
                    System.out.println("Cette case est déjà prise !");
                    c = false;
                    break;
                }
            default:
                c = false;
                break;
        }
        return c;
    }

    @Override
    public String toString() {
        return "Table{" +
                "table=" + Arrays.toString(table) +
                '}';
    }
}
