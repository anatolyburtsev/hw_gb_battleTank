package spares;

public class Turret extends SpareSkeleton {

    // Башня танка

    public Turret(int rotationSpeed, int weight) {
        this.rotationSpeed = rotationSpeed;
        this.currentRotation = 0;
        this.weight = weight;
    }

    public int getCurrentRotation() {
        return this.currentRotation;
    }

    public void turnLeft() {
        // вращаем башню танка налево
        this.currentRotation -= this.rotationSpeed;
    }

    public void turnRight() {
        // -||- направо
        this.currentRotation += this.rotationSpeed;
    }

    private int rotationSpeed;
    private int currentRotation;
}
