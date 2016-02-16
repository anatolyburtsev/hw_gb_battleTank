package spares;

/**
 * Created by onotole on 14.02.16.
 */
public class SpareSkeleton {
    protected int weight;

    protected SpareSkeleton(int weight) {
        assert weight >= 0;
        this.weight = weight;
    }

    protected SpareSkeleton() {
        this.weight = 0;
    }

    public int getWeight() {
        return weight;
    }

}
