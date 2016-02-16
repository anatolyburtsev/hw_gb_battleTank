import Tank.Tank;
import spares.Gun;
import spares.Suspension;
import spares.Turret;

public class Start {

    public static void main(String[] args) {
        Tank tank = new Tank();
        prepareForBattle(tank);
        tank.beginFighting();

        tank.reloadGun();
        tank.beginFighting();
    }

    public static void prepareForBattle(Tank tank) {
        Gun gun = new Gun(183, 4, 300);
        Turret turret = new Turret(4, 700);
        Suspension suspension = new Suspension(2000, 600);
        tank.setGun(gun);
        tank.setSuspension(suspension);
        tank.setTurret(turret);
    }
}
