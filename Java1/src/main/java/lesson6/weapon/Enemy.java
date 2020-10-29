package lesson6.weapon;

public class Enemy {

    private String name;
    private int hp;

    public Enemy(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void takeDamage(Weapon weapon) {
        if (hp <= 0) {
            throw new IllegalStateException("Enemy died. " +
                    "Don't hit died enemy!");
        }
        hp -= weapon.getDamage();
        System.out.println("Enemy hit by " + weapon.getDamage() +
                " point's from " + weapon.getClass().getSimpleName());
        if (hp <= 0) {
            System.out.println("Enemy killed!");
        }
    }
}
