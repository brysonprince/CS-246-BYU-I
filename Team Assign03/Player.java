package Prince;

import com.google.gson.Gson;

import java.util.Map;

public class Player {

    private String name;
    private int health;
    private int mana;
    private int gold;
    private Map<String, Integer> equipment;

    public Player(String name, int health, int mana, int gold, Map<String, Integer> equipment) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.gold = gold;
        this.equipment = equipment;
    }

    public String toString() {
        Player player = new Player(name, health, mana, gold, equipment);
        Gson gson = new Gson();
        String playerJson = gson.toJson(player);

        return playerJson;
    }

    public void addEquipment(String name, Integer num) {
        equipment.put(name, num);
    }

    public void display() {
        System.out.println("name: " + name + " health: " + health + " mana: " + mana
                + " gold: " + gold);
        equipment.keySet().stream().forEach(System.out::println);
    }
}

