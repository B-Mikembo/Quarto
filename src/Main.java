import main.fr.brice.quarto.controller.GameController;
import main.fr.brice.quarto.model.GameBag;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController(new GameBag());
        gameController.addPlayer("Toto");
        gameController.addPlayer("Tata");

        gameController.startGame();

        gameController.getPlayers().stream().forEach(player -> System.out.println(player.getBag().getTokens().size()));

    }
}
