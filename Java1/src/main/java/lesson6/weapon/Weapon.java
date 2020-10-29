package lesson6.weapon;

public class Weapon {

    protected int damage;
    protected int range;

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public void hitEnemy(Enemy enemy, int range) {
        if (this.range >= range) {
            enemy.takeDamage(this);
        }
    }

}
