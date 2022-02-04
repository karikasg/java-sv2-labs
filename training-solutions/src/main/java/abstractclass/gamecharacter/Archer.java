package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character {

    private int numberOfArrow;

    public Archer(Point position, Random random) {
        super(position, random);
        numberOfArrow = 100;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    private int getActualSecondaryDamage() {
        return random.nextInt(5) + 1;
    }

    private void shootingAnArrow(Character enemy) {
        hit(enemy, getActualSecondaryDamage());
        numberOfArrow--;
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
