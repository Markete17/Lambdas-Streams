package module2_functional_interfaces.exercise1_function;

public class Restaurant {
    String name;
    double mnt_order;
    int numTable;

    public Restaurant(String name, double mnt_order, int numTable) {
        this.name = name;
        this.mnt_order = mnt_order;
        this.numTable = numTable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMnt_order() {
        return mnt_order;
    }

    public void setMnt_order(double mnt_order) {
        this.mnt_order = mnt_order;
    }

    public int getNumTable() {
        return numTable;
    }

    public void setNumTable(int numTable) {
        this.numTable = numTable;
    }
}
