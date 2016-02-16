package spares;

public class Suspension extends SpareSkeleton {
    // подвеска танка

    public Suspension(int maxLoad, int weight) {
        this.maxLoad = maxLoad;
        this.weight = weight;
    }

    public boolean checkCurrentLoad(int weight) {
        // Проверить текущую нагрузку
        return weight >= maxLoad;
    }

    private int maxLoad;

}
