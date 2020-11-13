import fr.brice.quarto.model.*;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();

        for(int i = 0; i < table.getTable().length; i++){
            for (int j = 0; j < table.getTable()[i].length; j++){
                System.out.print("["+table.getTable()[i][j]+"]");
            }
            System.out.println();
        }

        table.addToken(new Token(Color.LIGHT, Height.SMALL, Summit.FULL, Form.CYLINDRICAL), 1);

        for(int i = 0; i < table.getTable().length; i++){
            for (int j = 0; j < table.getTable()[i].length; j++){
                System.out.print("["+table.getTable()[i][j]+"]");
            }
            System.out.println();
        }

    }
}
