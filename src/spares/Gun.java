package spares;

/**
 * Created by onotole on 14.02.16.
 */
public class Gun extends SpareSkeleton {
    // Орудие танка


    public Gun(int caliber, int amountOfBullet, int weight) {
        assert caliber > 0;
        assert amountOfBullet >= 0;

        this.caliber = caliber;
        this.amountOfBullet = amountOfBullet;
        this.defaultAmountOfBullet = amountOfBullet;
        this.weight = weight;
    }

    public boolean makeShoot() {
        if (this.amountOfBullet > 0) {
            System.out.println("PEWPEW!11\n");
            this.amountOfBullet -= 1;
            return true;
        } else {
            System.out.println("ERROR: Кончились снаряды!\n");
            return false;
        }

    }

    public void reloadGun() {
        System.out.println("Перезаряжаюсь\n");
        this.amountOfBullet = this.defaultAmountOfBullet;
    }

    private int caliber;
    private int amountOfBullet;
    private int defaultAmountOfBullet;

}
