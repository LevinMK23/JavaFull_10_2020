package lesson6.weapon;

public class Test {
    public static void main(String[] args) {
        Enemy volanDeMort = new Enemy("Volan De Mort", 1000);
        Knife knife = new Knife();
        ShotGun shotGun = new ShotGun();
        volanDeMort.takeDamage(knife);
        volanDeMort.takeDamage(shotGun);
        knife.hitEnemy(volanDeMort, 50);
        knife.hitEnemy(volanDeMort, 50);
        knife.hitEnemy(volanDeMort, 5);
        knife.hitEnemy(volanDeMort, 5);
        shotGun.hitEnemy(volanDeMort, 400);
        shotGun.hitEnemy(volanDeMort, 500);
        shotGun.hitEnemy(volanDeMort, 500);
    }
}
