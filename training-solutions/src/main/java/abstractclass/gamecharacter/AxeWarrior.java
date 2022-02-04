package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character {

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    private int getActualSecondaryDamage() {
        return random.nextInt(MAX_DAMAGE*2) + 1;
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if (this.getPosition().getDistance(enemy.getPosition()) < 2) {
            hit(enemy, getActualSecondaryDamage());
        }
    }
}
