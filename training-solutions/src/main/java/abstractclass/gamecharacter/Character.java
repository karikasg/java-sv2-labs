package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    static final int MAX_DAMAGE = 10;
    static final int MAX_DEFENCE = 10;
    static final int DEFAULT_HP = 100;

    private int hitPoint = DEFAULT_HP;
    Point position;
    Random random = new Random();

    public Character(Point position, Random random) {

        this.position = position;
        this.random = random;
    }

    public boolean isAlive() {
        return (hitPoint > 0);
    }

    protected int getActualPrimaryDamage() {
        return random.nextInt(10) + 1;
    }

    private int getActualDefence() {
        return random.nextInt(6);
    }

    protected void hit(Character enemy, int damage) {
        if (enemy.getActualDefence() < damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy) {
        hit(enemy, getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        hitPoint -= diff;
    }

    abstract public void secondaryAttack(Character enemy);

    public int getHitPoint() {
        return hitPoint;
    }

    public Point getPosition() {
        return position;
    }
}
