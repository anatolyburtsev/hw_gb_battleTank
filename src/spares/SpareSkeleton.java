package spares;


public abstract class SpareSkeleton {
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
