package prove02;

import java.awt.*;


public class Zombie extends Creature implements Movable, Aggressor {

    public Zombie() { _health = 10; }

    public void attack(Creature target) {
        if (target instanceof Animal || target instanceof Wolf) {
            target.takeDamage(10);
        }
    }

    Shape getShape() { return Shape.Square; }

    Color getColor() { return new Color(0,0,255); }

    Boolean isAlive() { return _health > 0; }

    public void move() {
        _location.x++;
    }
}
