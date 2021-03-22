package model.idemo;

public class Airplane extends Vehicle
{

    private int capacity;

    public Airplane(int x, int y, String make, double price, int capacity) {
        super(x, y, make, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
    
    @Override
    public String toString()    
    {
        return "[Airplane] " + super.toString() + " capacity = " + capacity;
    }

    @Override
    public String getSound() {
        return "[Airplane] sonic B ooooooooooooo ~~~m";
    }
}
