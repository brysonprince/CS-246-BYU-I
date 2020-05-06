package prove02;

import java.awt.*;
import java.util.Random;

public class Wolf extends Creature implements Aware, Aggressor, Movable, Spawner {

    Random _rand;
    int direction;
    boolean full;

    public Wolf() {
        _rand = new Random();
        direction = _rand.nextInt(4);
        _health = 1;
    }

    public void attack(Creature target) {
        if(target instanceof Animal) {
            target.takeDamage(5);
            full = true;
        }
    }

    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {

        try {
            if (above instanceof Animal) {
                direction = 3;
            }

            else if (below instanceof Animal) {
                direction = 2;
            }

            else if (right instanceof Animal) {
                direction = 0;
            }

            else if (left instanceof Animal) {
                direction = 1;
            }
        }
        finally {
            return;
        }
    }

    Shape getShape() { return Shape.Square; }

    Color getColor() { return new Color(128,128,128); }

    Boolean isAlive() { return _health > 0; }

    public void move() {

        switch(direction) {
            case 0:
                _location.x++;
                break;
            case 1:
                _location.x--;
                break;
            case 2:
                _location.y++;
                break;
            case 3:
                _location.y--;
                break;
            default:
                break;
        }
    }

    public Creature spawnNewCreature() {
        if(full) {
            full = false;
            return new Wolf();
        }
        return null;
    }
}
