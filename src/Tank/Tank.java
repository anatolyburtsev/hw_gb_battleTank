package Tank;
import spares.Gun;
import spares.Turret;
import spares.Suspension;

import java.util.Random;


public class Tank {
    Gun gun;
    Turret turret;
    Suspension suspension;

    public Tank() {
    }

    final Random random = new Random();

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public void setTurret(Turret turret) {
        this.turret = turret;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public void beginFighting() {
        if ( this.gun == null || this.turret == null || this.suspension == null) {
            System.out.println("Перед боев необходимо установить орудие, башню и ходовую.");
            System.exit(0);
        }
        if (! checkLoadOfSuspension()) {
            System.out.println("Танк перегружен.");
            System.exit(0);
        }
        boolean continueShooting = true;
        while (continueShooting) {
            for (int i = 0; i < random.nextInt(10); i++){
                turret.turnLeft();
            }
            for (int i = 0; i < random.nextInt(10); i++) {
                turret.turnRight();
            }
            System.out.println("Стреляю в направлении: " + turret.getCurrentRotation() + " градусов");
            continueShooting = gun.makeShoot();
        }
    }

    public void reloadGun() {
        this.gun.reloadGun();
    }

    private boolean checkLoadOfSuspension() {
        boolean isOverload = suspension.checkCurrentLoad(gun.getWeight() + turret.getWeight() + suspension.getWeight());
        return ! isOverload;
    }

}
