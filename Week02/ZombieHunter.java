package prove02;

import java.awt.*;
import java.util.Random;

public class ZombieHunter extends Creature implements Movable, Aggressor, Aware {

    Random _rand;
    int direction;

    public ZombieHunter() {
        _rand = new Random();
        direction = _rand.nextInt(4);
        _health = 1;
    }

    public void attack(Creature target) {
        if(target instanceof Zombie) {
            target.takeDamage(5);
        }
    }

    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {

        try {
            if (above instanceof Zombie) { direction = 3; }

            else if (below instanceof Zombie) { direction = 2; }

            else if (right instanceof Zombie) { direction = 0; }

            else if (left instanceof Zombie) { direction = 1; }

            // Scared of wolves
            else if (above instanceof Wolf) { direction = 2; }

            else if (below instanceof Wolf) { direction = 3; }

            else if (right instanceof Wolf) { direction = 1; }

            else if (left instanceof Wolf) { direction = 0; }
        }
        finally {
            return;
        }
    }

    Shape getShape() { return Shape.Square; }

    Color getColor() { return new Color(255,165,0); }

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
}
