package Prince;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
		Map<String, Integer> equipment = new HashMap<>();
	    Player player = new Player("Dave", 100, 50, 25, equipment);
		player.addEquipment("Sword", 1);
		player.addEquipment("Health Potion", 5);
		player.addEquipment("Loin Cloth", 1);

	    Game game = new Game(player);

	    game.saveGame(player.toString());

	    Game newGame = Game.loadGame("save.txt");

	    newGame.getPlayer().display();
    }
}
