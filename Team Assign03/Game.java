package Prince;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Game {
    public Player getPlayer() {
        return player;
    }

    private Player player;

    public Game(Player player) {
        this.player = player;
    }

    public void saveGame(String playerJson) throws IOException {
        File save = new File("save.txt");
        FileWriter write = new FileWriter(save);

        write.write(playerJson);
        write.close();
    }

    public static Game loadGame(String fileName) throws FileNotFoundException {
        File load = new File(fileName);
        Scanner read = new Scanner(load);
        String playerJson = null;

        while (read.hasNextLine()) {
            playerJson = read.nextLine();
        }

        Gson gson = new Gson();
        Player newPlayer = gson.fromJson(playerJson, Player.class);
        Game newGame = new Game(newPlayer);

        return newGame;
    }
}
